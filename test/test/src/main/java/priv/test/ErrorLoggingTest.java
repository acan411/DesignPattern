package priv.test;

import java.util.*;

public class ErrorLoggingTest {
    private static Map<String, Integer> map = new HashMap<>();
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        // 读取键盘输入, 输入exit停止
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if ("exit".equals(str)) {
                break;
            }
            setMapAndList(str);
        }

        // 最大只读取8条错误记录, 放入新数组排序
        int i = list.size() - 8;
        if (i < 0) {
            i = 0;
        }
        List<String> sortList = new ArrayList<>();
        for (; i < list.size(); ++i) {
            sortList.add(list.get(i));
        }

        // 结果根据数目从多到少排序
        int size = sortList.size();
        for (i = 1; i < size; i++) {
            boolean flag = true;
            for (int j = 0; j < size - i; j++) {
                String a1 = sortList.get(j);
                String a2 = sortList.get(j + 1);
                String[] b1 = a1.split(" ");
                String[] b2 = a2.split(" ");
                int c1 = Integer.parseInt(b1[2]);
                int c2 = Integer.parseInt(b2[2]);
                if (c1 < c2) {
                    sortList.set(j, a2);
                    sortList.set(j + 1, a1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        // 打印到控制台
        for(String str:sortList){
            System.out.println(str);
        }
    }

    private static void setMapAndList(String str) {

        // 按空格截取得到路径与行数
        String[] pathAndRow = str.split(" ");

        // 按反斜杠截取得到各级路径, 最后一位为文件名
        String[] path = pathAndRow[0].split("\\\\");

        // 最大只截取16位
        String fileName = path[path.length - 1];
        int length = fileName.length();
        if (length > 16) {
            fileName = fileName.substring(length - 16);
        }
        String key = fileName + " " + pathAndRow[1];

        // map中存在则将value+1, 并更新list, 不存在则直接存入
        if (map.containsKey(key)) {
            int value = map.get(key);
            for (int i = 0; i < list.size(); ++i) {
                if (list.get(i).equals(key + " " + value)) {
                    list.set(i, key + " " + (++value));
                }
            }
            map.put(key, value);
        } else {
            map.put(key, 1);
            list.add(key + " " + map.get(key));
        }
    }
}
