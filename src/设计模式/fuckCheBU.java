package 设计模式;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

/**
 * 客户关系图谱
 *
 * @author XXX
 * @since 2022-08-05 17:29
 */
public class fuckCheBU {
    public static void main(String[] args) {

        System.out.println(isValidDate("2000-01-01", "2007/02/29"));
    }

    public static boolean isValidDate(String startDate, String endDate) {
        // 指定日期格式，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parseStartDate;
        Date parseEndDate;
        try {
            // 设置lenient为false.
            // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
//            format.setLenient(false);
            System.out.println(parseStartDate = format.parse(startDate));
            System.out.println(parseEndDate = format.parse(endDate));
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
//            throw new KgException(e.getMessage());
            return false;
        }
        return parseStartDate.before(parseEndDate);
    }

    public static void StringJoiner(String[] args) {
//        StringJoiner stringJoiner = new StringJoiner(", ", "[ ", " ]");
//        for (String relation : queryEmployeeVo.getRelationShip()) {
//            stringJoiner.add("'" + relation + "'");
//        }
//        publicQueryStatement.append(stringJoiner);
    }
}
