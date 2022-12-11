package priv.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateConvertTest {

    public static void main(String[] args) {

        String text = new Scanner(System.in).nextLine();

        // 中文逗号转英文逗号, 截取得到两个日期
        String[] split = text.replaceAll("，", ",").split(",");
        if (split.length != 2) {
            System.exit(1);
        }
        try {
            String countDate = countDate(split[0], split[1]);
            System.out.println(countDate);
        } catch (ParseException e) {
            System.exit(1);
        }
    }

    private static String countDate(String date1, String date2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 将日期转为绝对毫秒
        return countDate(simpleDateFormat.parse(date1).getTime(), simpleDateFormat.parse(date2).getTime());
    }

    @SuppressWarnings("all")
    private static String countDate(long time1, long time2) {
        // 保证第一个日期比第二个日期大
        if (time1 < time2) {
            return countDate(time2, time1);
        }
        // 大绝对毫秒减小绝对毫秒, 并除以一天的绝对毫秒数, 得到天数
        return new BigDecimal(time1).subtract(new BigDecimal(time2)).divide(new BigDecimal(86400000)).toString();
    }

}
