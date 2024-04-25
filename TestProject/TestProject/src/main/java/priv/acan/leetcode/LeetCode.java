package priv.acan.leetcode;

import lombok.*;
import org.junit.Test;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author acan
 * @version 2023/07/28 19:48
 */
class CountIntervals {

    private final TreeMap<Integer, Integer> map;
    private int cnt;

    public CountIntervals() {
        this.map = new TreeMap<>();
        this.cnt = 0;
    }

    public void add(int left, int right) {
        for (Map.Entry<Integer, Integer> entry = map.floorEntry(right); entry != null && entry.getValue() >= left; entry = map.floorEntry(right)) {
            int l = entry.getKey();
            int r = entry.getValue();
            left = Math.min(left, l);
            right = Math.max(right, r);
            cnt -= r - l + 1;
            map.remove(l);
        }
        map.put(left, right);
        cnt += right - left + 1;
    }

    public int count() {
        return cnt;
    }
}

@Getter
@Setter
class Node {
    private String val;
    private Node left;
    private Node right;

    public Node(String val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LeetCode {

    public static void main(String[] args) {
    }

    private static void printNode(Node node) {
        if (node != null) {
            printNode(node.getLeft());
            System.out.println(node.getVal());
            printNode(node.getRight());
        }
    }

    @Test
    public void alskjdf() {
        System.out.println(4 >> 3);
    }

    @Test
    public void lcTest() {
    }

    public boolean canMeasureWater(int a, int b, int c) {
        if (a + b < c) return false;
        else return c % gcd(a, b) == 0;
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;
        else if (b == 0) return a;
        else if ((a & 1) == 0 && (b & 1) == 0) return gcd(a >> 1, b >> 1) << 1;
        else if ((a & 1) == 0) return gcd(a >> 1, b);
        else if ((b & 1) == 0) return gcd(a, b >> 1);
        else if (a > b) return gcd(a - b, b);
        else return gcd(b - a, a);
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            int cnt = 0;
            int n = i;
            while (n != 0) {
                n &= (n - 1);
                ++cnt;
            }
            if (cnt == k) {
                ans += nums.get(i);
            }
        }
        return ans;
    }

    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        return pattern.matcher(s).matches();
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (set.contains(new StringBuilder(word).reverse().toString())) {
                ++ans;
            } else {
                set.add(word);
            }
        }
        return ans;
    }

    public int strStr(String str1, String str2) {
        int[] next = calculateNext(str2);
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                ++i;
                ++j;
            } else {
                if (j != 0) {
                    j = next[j - 1];
                } else {
                    ++i;
                }
            }
        }
        if (j == str2.length()) {
            return i - j;
        }
        return -1;
    }

    private int[] calculateNext(String str) {
        int[] next = new int[str.length()];
        int i = 1, j = 0;
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                ++j;
                next[i] = j;
                ++i;
            } else {
                if (j != 0) {
                    j = next[j - 1];
                } else {
                    next[i] = 0;
                    ++i;
                }
            }
        }
        return next;
    }


    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int left = numRows * 2 - 2, right = 0;
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i, tmp = right; j < len; ) {
                if (tmp == left) {
                    tmp = right;
                } else {
                    tmp = left;
                }
                if (tmp != 0) {
                    sb.append(s.charAt(j));
                    j += tmp;
                }
            }
            left -= 2;
            right += 2;
        }
        return sb.toString();
    }

    public int dayOfYear(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        int[] md = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        return md[month - 1] + day + (((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) && month > 2 ? 1 : 0);
    }

    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] md = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int cnt = (year - 1971) * 365 + md[month - 1] + day + 4;
        for (int i = 1972; i < year; i += 4) {
            if (i % 100 != 0 || i % 400 == 0) {
                ++cnt;
            }
        }
        if (((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) && month > 2) {
            ++cnt;
        }
        return week[cnt % 7];
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length, m = dungeon[0].length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; ++i) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[n][m - 1] = dp[n - 1][m] = 1;
        for (int i = n - 1; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                int minn = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minn - dungeon[i][j], 1);
            }
        }
        return dp[0][0];
    }

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < m; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[n - 1][m - 1];
    }

    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, maxSum = nums[0], curMax = 0, minSum = nums[0], curMin = 0;
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
            total += num;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }

    public int getMaxLen(int[] nums) {
        int neg = 0, pos = 0, index = -1;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                pos = 0;
                neg = 0;
                index = -1;
            } else if (nums[i] > 0) {
                ++pos;
            } else {
                if (index == -1) {
                    index = i;
                }
                ++neg;
            }
            if (neg % 2 == 0) {
                ans = Math.max(ans, pos + neg);
            } else {
                ans = Math.max(ans, i - index);
            }
        }
        return ans;
    }

    public int isWinner(int[] player1, int[] player2) {
        int len = player1.length;
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < len; i++) {
            int mul1 = 1, mul2 = 1;
            if (i > 1) {
                if (player1[i - 2] == 10 || player1[i - 1] == 10) {
                    mul1 = 2;
                }
                if (player2[i - 2] == 10 || player2[i - 1] == 10) {
                    mul2 = 2;
                }
            } else if (i > 0) {
                if (player1[i - 1] == 10) {
                    mul1 = 2;
                }
                if (player2[i - 1] == 10) {
                    mul2 = 2;
                }
            }
            cnt1 += mul1 * player1[i];
            cnt2 += mul2 * player2[i];
        }
        return cnt1 > cnt2 ? 1 : cnt2 > cnt1 ? 2 : 0;
    }

    public int maxProduct(int[] nums) {
        int a = 1;
        int b = 1;
        int ans = Integer.MIN_VALUE;
        for (int num : nums) {
            int c = a * num;
            int d = b * num;
            a = Math.max(c, Math.max(num, d));
            b = Math.min(d, Math.min(num, c));
            ans = Math.max(ans, a);
        }
        return ans;
    }

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices % 2 != 0 || tomatoSlices < cheeseSlices << 1 || tomatoSlices > cheeseSlices << 2) {
            return Collections.emptyList();
        }
        return new ArrayList<>() {{
            add((tomatoSlices >> 1) - cheeseSlices);
            add((cheeseSlices << 1) - (tomatoSlices >> 1));
        }};
    }

    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        for (int pile : piles) {
            pq.offer(pile);
        }
        for (int i = 0; i < k; i++) {
            int pile = pq.poll();
            pile = (pile + 1) / 2;
            pq.offer(pile);
        }
        int ans = 0;
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }
        return ans;
    }

    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] pre = getArray(nums);
        int[] suf = reverse(getArray(reverse(nums)));

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (pre[i] > 1 && suf[i] > 1) {
                ans = Math.max(ans, pre[i] + suf[i] - 1);
            }
        }

        return n - ans;
    }

    private int[] getArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }

    private int[] reverse(int[] nums) {
        int n = nums.length;
        int[] reversed = new int[n];
        n -= 1;
        for (int i = 0; i <= n; ++i) {
            reversed[i] = nums[n - i];
        }
        return reversed;
    }

    public long maximumSumOfHeights1(List<Integer> maxHeights) {
        int n = maxHeights.size();
        long res = 0;
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack1.isEmpty() && maxHeights.get(i) < maxHeights.get(stack1.peek())) {
                stack1.pop();
            }
            if (stack1.isEmpty()) {
                prefix[i] = (long) (i + 1) * maxHeights.get(i);
            } else {
                prefix[i] = prefix[stack1.peek()] + (long) (i - stack1.peek()) * maxHeights.get(i);
            }
            stack1.push(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && maxHeights.get(i) < maxHeights.get(stack2.peek())) {
                stack2.pop();
            }
            if (stack2.isEmpty()) {
                suffix[i] = (long) (n - i) * maxHeights.get(i);
            } else {
                suffix[i] = suffix[stack2.peek()] + (long) (stack2.peek() - i) * maxHeights.get(i);
            }
            stack2.push(i);
            res = Math.max(res, prefix[i] + suffix[i] - maxHeights.get(i));
        }
        return res;
    }

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int size = maxHeights.size();
        long ans = 0;
        long[] pre = new long[size];
        long[] suf = new long[size];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            int index = maxHeights.get(i);
            while (!stack.isEmpty() && index < maxHeights.get(stack.peek())) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                pre[i] = (long) (i + 1) * index;
            } else {
                int peek = stack.peek();
                pre[i] = pre[peek] + (long) (i - peek) * index;
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = size - 1; i >= 0; i--) {
            int index = maxHeights.get(i);
            while (!stack.isEmpty() && index < maxHeights.get(stack.peek())) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                suf[i] = (long) (size - i) * index;
            } else {
                int peek = stack.peek();
                suf[i] = suf[peek] + (long) (peek - i) * index;
            }
            stack.push(i);
            ans = Math.max(ans, suf[i] + pre[i] - index);
        }
        return ans;
    }

    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean a = i == 0 || mat[i][j] > mat[i - 1][j];
                boolean b = i == m - 1 || mat[i][j] > mat[i + 1][j];
                boolean c = j == 0 || mat[i][j] > mat[i][j - 1];
                boolean d = j == n - 1 || mat[i][j] > mat[i][j + 1];
                if (a && b && c && d) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        for (int i = 1; i < len - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        if (nums[0] > nums[1]) {
            return 0;
        } else {
            return len - 1;
        }
    }

    public int minCostClimbingStairs(int[] cost) {
        int a = 0, b = 0;
        for (int i : cost) {
            int t = a;
            a = Math.min(a, b) + i;
            b = t;
        }
        return Math.min(a, b);
    }

    public int climbStairs(int n) {
        int a, b = 1, c = 1;
        for (int i = 1; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    public int nextBeautifulNumber(int n) {
        int[] map = {1, 22, 122, 212, 221, 333, 1333, 3133, 3313, 3331, 4444, 14444, 22333, 23233, 23323, 23332, 32233, 32323, 32332, 33223, 33232, 33322, 41444, 44144, 44414, 44441, 55555, 122333, 123233, 123323, 123332, 132233, 132323, 132332, 133223, 133232, 133322, 155555, 212333, 213233, 213323, 213332, 221333, 223133, 223313, 223331, 224444, 231233, 231323, 231332, 232133, 232313, 232331, 233123, 233132, 233213, 233231, 233312, 233321, 242444, 244244, 244424, 244442, 312233, 312323, 312332, 313223, 313232, 313322, 321233, 321323, 321332, 322133, 322313, 322331, 323123, 323132, 323213, 323231, 323312, 323321, 331223, 331232, 331322, 332123, 332132, 332213, 332231, 332312, 332321, 333122, 333212, 333221, 422444, 424244, 424424, 424442, 442244, 442424, 442442, 444224, 444242, 444422, 515555, 551555, 555155, 555515, 555551, 666666, 1224444};
        int i = Arrays.binarySearch(map, n + 1);
        if (i < 0) {
            i = -i - 1;
        }
        return map[i];
    }

    public boolean carPooling(int[][] trips, int capacity) {
        int end = 0;
        for (int[] trip : trips) {
            end = Math.max(end, trip[2]);
        }

        int[] diff = new int[end + 1];
        for (int[] trip : trips) {
            diff[trip[1]] += trip[0];
            diff[trip[2]] -= trip[0];
        }

        int cnt = 0;
        for (int i = 0; i <= end; ++i) {
            cnt += diff[i];
            if (cnt > capacity) {
                return false;
            }
        }
        return true;
    }

    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int size = len - k;
        int window = 0;
        int sum;
        for (int i = 0; i < size; i++) {
            window += cardPoints[i];
        }
        sum = window;
        for (int i = size; i < len; i++) {
            sum += cardPoints[i];
        }
        int min = window;
        for (int i = 0, j = size; j < len; ++i, ++j) {
            window = window - cardPoints[i] + cardPoints[j];
            min = Math.min(min, window);
        }
        return sum - min;
    }

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowCnt = new int[n];
        int[] colCnt = new int[m];
        int[] map = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[mat[i][j] - 1] = i * n + j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int tmp = map[arr[i] - 1];
            int x = tmp / n;
            int y = tmp % n;
            ++rowCnt[y];
            ++colCnt[x];
            if (rowCnt[y] == m || colCnt[x] == n) {
                return i;
            }
        }
        return 0;
    }


    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else if (word1.equals(word2)) {
            return true;
        }
        int len = 26;
        int[] cnt1 = new int[len];
        int[] cnt2 = new int[len];
        for (int i = 0; i < word1.length(); i++) {
            ++cnt1[word1.charAt(i) - 'a'];
            ++cnt2[word2.charAt(i) - 'a'];
        }
        for (int i = 0; i < len; i++) {
            if ((cnt1[i] == 0 && cnt2[i] != 0) || (cnt1[i] != 0 && cnt2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(cnt1);
        Arrays.sort(cnt2);
        return Arrays.equals(cnt1, cnt2);
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Deque<Integer> monoStack = new ArrayDeque<>();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            while (!monoStack.isEmpty() && arr[i] <= arr[monoStack.peek()]) {
                monoStack.pop();
            }
            left[i] = i - (monoStack.isEmpty() ? -1 : monoStack.peek());
            monoStack.push(i);
        }
        monoStack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!monoStack.isEmpty() && arr[i] < arr[monoStack.peek()]) {
                monoStack.pop();
            }
            right[i] = (monoStack.isEmpty() ? n : monoStack.peek()) - i;
            monoStack.push(i);
        }
        long ans = 0;
        final int MOD = 1000000007;
        for (int i = 0; i < n; i++) {
            ans = (ans + (long) left[i] * right[i] * arr[i]) % MOD;
        }
        return (int) ans;
    }

    public int uniqueLetterString(String s) {
        int ans = 0;
        int len = s.length();
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new ArrayList<>() {{
                    add(-1);
                }});
            }
            map.get(c).add(i);
        }
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            list.add(len);
            for (int i = 1; i < list.size() - 1; i++) {
                int before = list.get(i - 1);
                int index = list.get(i);
                int after = list.get(i + 1);
                ans += (index - before) * (after - index);
            }
        }
        return ans;
    }

    public int countPairs(List<Integer> nums, int target) {
        int[] tmp = new int[101];
        for (int num : nums) {
            ++tmp[num + 50];
        }
        int ans = 0;
        for (int i = 0; i < tmp.length; i++) {
            int index = tmp[i];
            if (index != 0) {
                int cnt = 0;
                for (int j = 0; j < target - i + 100 && j < 101; j++) {
                    int sub = tmp[j];
                    if (j != i) {
                        cnt += sub;
                    } else {
                        cnt += sub - 1;
                    }
                }
                ans += index * cnt;
            }
        }
        return ans >> 1;
    }

    public String entityParser(String text) {
        int len = text.length();
        int[] stack = new int[len];
        int index = -1;
        int[] match = new int[len];
        int cnt = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c == '&') {
                stack[++index] = i;
            } else if (c == ';' && index != -1) {
                match[cnt++] = stack[index--];
                match[cnt++] = i;
            }
        }
        if (cnt > 0) {
            Map<String, String> map = new HashMap<>() {{
                put("&quot;", "\"");
                put("&apos;", "'");
                put("&amp;", "&");
                put("&gt;", ">");
                put("&lt;", "<");
                put("&frasl;", "/");
            }};
            StringBuilder sb = new StringBuilder();
            int pos = 0;
            for (int i = 0; i < cnt; i += 2) {
                sb.append(text, pos, match[i]);
                pos = match[i + 1] + 1;
                String str = text.substring(match[i], pos);
                sb.append(map.getOrDefault(str, str));
            }
            sb.append(text, pos, len);
            return sb.toString();
        }
        return text;
    }

    public int minPathCost(int[][] grid, int[][] moveCost) {
        int len = grid.length;
        int length = grid[0].length;
        int[][] dp = new int[2][length];
        dp[0] = grid[0].clone();
        dp[1] = grid[0].clone();
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < length; j++) {
                int min = Integer.MAX_VALUE;
                int prime = 0;
                for (int k = 0; k < length; k++) {
                    int next = grid[i][k];
                    int tmp = moveCost[dp[0][j]][k] + next;
                    if (tmp < min) {
                        min = tmp;
                        prime = next;
                    }
                }
                dp[0][j] = prime;
                dp[1][j] += min;
            }
        }
        return Arrays.stream(dp[1]).min().orElse(Integer.MAX_VALUE);
    }

    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        Set<Character> set = new HashSet<>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
        }};
        for (int i = left; i <= right && i < words.length; i++) {
            String word = words[i];
            if (set.contains(word.charAt(0)) && set.contains(word.charAt(word.length() - 1))) {
                ++ans;
            }
        }
        return ans;
    }

    public int findTheLongestBalancedSubstring(String s) {
        int cnt0 = 0, cnt1 = 0;
        int ans = 0, tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                cnt1 = 0;
                ++cnt0;
                tmp = cnt0;
            } else {
                cnt0 = 0;
                ++cnt1;
                if (tmp >= cnt1) {
                    ans = Math.max(cnt1, ans);
                }
            }
        }
        return ans * 2;
    }

    public int minDeletion(int[] nums) {
        int len = nums.length;
        int ans = 0;
        boolean check = true;
        for (int i = 0; i + 1 < len; i++) {
            if (nums[i] == nums[i + 1] && check) {
                ++ans;
            } else {
                check = !check;
            }
        }
        return ((len - ans) & 1) == 0 ? ans : ans + 1;
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            if (sum < 0) {
                sum = num;
            } else {
                sum += num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public int maximumSum(int[] nums) {
        int[][] matrixs = new int[82][2];
        for (int num : nums) {
            int index = 0;
            for (int tmp = num; tmp > 0; tmp /= 10) {
                index += tmp % 10;
            }
            if (num > matrixs[index][1]) {
                if (num > matrixs[index][0]) {
                    int tmp = matrixs[index][0];
                    matrixs[index][0] = num;
                    matrixs[index][1] = tmp;
                } else {
                    matrixs[index][1] = num;
                }
            }
        }
        int ans = -1;
        for (int[] matrix : matrixs) {
            int m1 = matrix[0];
            int m2 = matrix[1];
            if (m1 > 0 && m2 > 0) {
                ans = Math.max(ans, m1 + m2);
            }
        }
        return ans;
    }

    public int[] maximumSumQueries(int[] nums1, int[] nums2, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int max = -1;
            for (int j = 0; j < nums1.length; j++) {
                int i1 = nums1[j];
                int i2 = nums2[j];
                if (i1 >= queries[i][0] && i2 >= queries[i][1]) {
                    max = Math.max(max, i1 + i2);
                }
            }
            ans[i] = max;
        }
        return ans;
    }

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = 0;
        int ans = 0;
        for (int num : nums) {
            if (num <= threshold && (num & 1) == (len & 1)) {
                ++len;
            } else {
                ans = Math.max(ans, len);
                len = 0;
                if (num <= threshold && (num & 1) == 0) {
                    ++len;
                }
            }
        }
        ans = Math.max(ans, len);
        return ans;
    }

    public int maxProduct(String[] words) {
        int ans = 0;
        int len = words.length;
        int[] tmp = new int[len];
        for (int i = 0; i < len; i++) {
            int j = i;
            words[i].chars().forEach(c -> tmp[j] |= 1 << c);
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((tmp[i] & tmp[j]) == 0) {
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
        return ans;
    }

    private void asdf(int index, double acc) {
        double next = index;
        double prime;
        do {
            prime = next;
            next -= (next * next - index) / (2 * next);
            System.out.println(next);
        } while (Math.abs(next - prime) > acc);
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            // a % b == 0 ? a / b - 1 : a / b
            // ( a + b - 1 ) / b - 1
            long target = (success + spells[i] - 1) / spells[i] - 1;
            ans[i] = potions.length - binarySearch(potions, target);
        }
        return ans;
    }

    private int binarySearch(int[] arr, long target) {
        int start = 0;
        int end = arr.length - 1;
        int res = end + 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int[] queen : queens) {
            set.add(queen[0] * 8 + queen[1]);
        }
        for (int x = -1; x <= 1; ++x) {
            for (int y = -1; y <= 1; ++y) {
                if (x == 0 && y == 0) {
                    continue;
                }
                for (int i = king[0] + x, j = king[1] + y; 0 <= i && i < 8 && 0 <= j && j < 8; i += x, j += y) {
                    if (set.contains(i * 8 + j)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        list.add(j);
                        ans.add(list);
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public int maximizeSum(int[] nums, int k) {
        int max = 1;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max * k + k * (k - 1) / 2;
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] map = new int[n][n];
        int ans = -1;
        int min = Integer.MAX_VALUE / 2;
        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], min);
        }
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            map[from][to] = weight;
            map[to][from] = weight;
        }
        for (int i = 0; i < n; i++) {
            map[i][i] = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    map[j][k] = Math.min(map[j][k], map[j][i] + map[i][k]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (map[i][j] <= distanceThreshold) {
                    ++cnt;
                }
            }
            if (cnt <= min) {
                ans = i;
                min = cnt;
            }
        }
        return ans;
    }

    public int distributeCandies(int n, int limit) {
        if (n > limit) {
            int min = (n - limit) / limit;
            if (n / min < 3) {
                return 3;
            } else {
                return distributeCandies(n - 3 * min, limit);
            }
        } else {
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += arrange(n, i);
            }
            return ans;
        }
    }

    private int arrange(int n, int m) {
        int res = 1;
        for (int i = m; i > 0; --i, --n) {
            res *= n;
        }
        return res;
    }

    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return Collections.emptyList();
        }
        List<String> list = new ArrayList<>();
        int start = nums[0];
        int end;
        int cnt = start;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != ++cnt) {
                end = nums[i - 1];
                if (start == end) {
                    list.add(String.valueOf(start));
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
                cnt = start;
            }
        }
        if (start == cnt) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + nums[len - 1]);
        }
        return list;
    }

    public int jump(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        int cnt = 0;
        int ans = 0;
        for (; ans < len; ++ans) {
            if (ans <= cnt) {
                cnt = Math.max(cnt, ans + nums[ans]);
                if (cnt >= len - 1) {
                    break;
                }
            }
        }
        return ans;
    }

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for (int i = 0; i < len; ++i) {
            if (i <= cnt) {
                cnt = Math.max(cnt, i + nums[i]);
                if (cnt >= len - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return profit;
    }

//    public void rotate(int[] nums, int k) {
//        int len = nums.length;
//        k %= len;
//        int gcd = gcd(len, k);
//        for (int i = 0; i < gcd; i++) {
//            for (int j = 0, next, cache = nums[i]; j < len / gcd; ++j) {
//                next = ((j * k + i) % len + k) % len;
//                int tmp = nums[next];
//                nums[next] = cache;
//                cache = tmp;
//            }
//        }
//    }
//
//    private int gcd(int x, int y) {
//        return y > 0 ? gcd(y, x % y) : x;
//    }

    private int swap(int[] nums, int index, int cache) {
        int tmp = nums[index];
        nums[index] = cache;
        return tmp;
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        int max = n << 1;
        char[] chars = new char[max];
        backTrace(n, n, res, max, chars);
        return res;
    }

    private void backTrace(int l, int r, List<String> res, int max, char[] chars) {
        int cnt = chars.length - l - r;
        if (cnt == max) {
            res.add(new String(chars));
            return;
        }
        if (l > 0) {
            chars[cnt] = '(';
            backTrace(l - 1, r, res, max, chars);
        }
        if (r > l) {
            chars[cnt] = ')';
            backTrace(l, r - 1, res, max, chars);
        }
    }
}

@Getter
@AllArgsConstructor
enum XianKa {

    _79XTX(96, 7299), _79XT(84, 5999), _79GRE(80, 5299), _78XT(60, 4099), _77XT(54, 3699);

    private final double cu;
    private final double price;

}

@Getter
@AllArgsConstructor
enum BuyWord {

    l1(500, 8), l2(800, 12), l3(1800, 25), l4(4000, 50), l5(8000, 88), l6(16000, 163);

    private final double count;
    private final double money;


}
