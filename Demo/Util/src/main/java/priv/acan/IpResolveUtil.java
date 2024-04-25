package priv.acan;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author acan
 * @version 2023/12/17 01:30
 */
public class IpResolveUtil {


    @Test
    public void asdf() {
        LinkedList<String> list = resolveTheIPString("0.0.0.0-0.1.0.0,127.255.255.255");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private LinkedList<String> resolveTheIPString(String ip) {
        LinkedList<long[]> intervals = new LinkedList<>();
        String[] splitCommas = ip.split(",");
        for (String splitComma : splitCommas) {
            String[] splitBars = splitComma.split("-");
            if (splitBars.length == 2) {
                intervals.add(new long[]{pointToPointConversionToInteger(splitBars[0]), pointToPointConversionToInteger(splitBars[1])});
            } else {
                intervals.add(new long[]{pointToPointConversionToInteger(splitBars[0]), pointToPointConversionToInteger(splitBars[0])});
            }
        }
        TreeMap<Long, Long> map = new TreeMap<>();
        mergerOfIntervals(intervals, map);
        LinkedList<String> list = new LinkedList<>();
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            long from = entry.getKey();
            long to = entry.getValue();
            for (long i = from; i <= to; i++) {
                list.add(integerConversionToPointToPoint(i));
            }
        }
        return list;
    }

    private void mergerOfIntervals(List<long[]> intervals, TreeMap<Long, Long> map) {
        for (long[] interval : intervals) {
            long l2 = interval[0];
            long r2 = interval[1];
            for (Map.Entry<Long, Long> entry = map.floorEntry(r2); entry != null && entry.getValue() >= l2; entry = map.floorEntry(r2)) {
                long l1 = entry.getKey();
                long r1 = entry.getValue();
                l2 = Math.min(l2, l1);
                r2 = Math.max(r2, r1);
                map.remove(l1);
            }
            map.put(l2, r2);
        }
    }


    private long pointToPointConversionToInteger(String ip) {
        String[] split = ip.split("\\.");
        return (Long.parseLong(split[0]) << 24) | (Long.parseLong(split[1]) << 16) | (Long.parseLong(split[2]) << 8) | Long.parseLong(split[3]);
    }

    private String integerConversionToPointToPoint(long ip) {
        return ((ip & 0xff000000L) >> 24) + "." + ((ip & 0x00ff0000L) >> 16) + "." + ((ip & 0x0000ff00L) >> 8) + "." + (ip & 0x000000ffL);
    }
}
