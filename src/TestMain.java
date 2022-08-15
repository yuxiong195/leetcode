import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMain {
    public static void main(String[] args) throws ParseException {

//        String s = "Hi world! world!";
//        String word = "world";
//        StringBuilder sb = new StringBuilder(s);
//        int i = sb.indexOf(word, 0);
//        int i1 = sb.indexOf(word, i + word.length());
//        System.out.println(i+","+(i+word.length()) );
//        System.out.println(i1);

//        ArrayList<Integer> objects = new ArrayList<>();
//        ArrayList<Integer> objects1 = new ArrayList<>();
//        objects1.add(2);
//        objects1.add(3);
//
//        objects.addAll(objects1);
//        System.out.println(objects);

//        String[] names = {"Bob"};
//        StringJoiner sj = new StringJoiner(", ", "[ ", " ]");
//        for (String name : names) {
//            sj.add("'"+name+"'");
//        }
//        System.out.println(sj.toString());
//
//        Date date = new SimpleDateFormat("yy-MM-dd").parse("2022-08-03");
//        System.out.println(date.toString());
//        System.out.println(hashMap.get("abc")==true);
        String left = "323";
        String right = "345";
        String s1 = "32";
        System.out.println(right.substring(2));
        System.out.println(left.compareTo(s1) <= 0 && s1.compareTo(right) <=0);

    }
}