package 模拟OJ.工作级0806;/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2023. All rights reserved.
 * Description: 上机编程认证
 * Note: 缺省代码仅供参考，可自行决定使用、修改或删除
 */

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * OJ考题代码：漫游区域
 *
 * @author 命题组
 * @since 2020-03-20
 */
public class Exam2 {
    // 待实现函数，在此函数中填入答题代码
    private static String[] getRoamingArea(List<String[]> restricts, String[] areas) {

        LinkedList<String> areasList = new LinkedList<>(Arrays.asList(areas));

        for (String[] restrict : restricts) {
            String[] str = restrict;
            String left = str[0];
            String right = str[1];
            Iterator<String> iterator = areasList.iterator();

            while (iterator.hasNext()) {
                String area = iterator.next().substring(0, left.length());
                if (left.compareTo(area) <= 0 && area.compareTo(right) <=0) {
                    iterator.remove();
                }
            }
        }

        Collections.sort(areasList, Comparator.reverseOrder());
        ArrayList<String> result = new ArrayList<>();
        for (String area : areasList) {
            result.add(area);
        }
        return result.toArray(new String[result.size()]);
    }

    // main入口由OJ平台调用
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());
        int mRow = cin.nextInt();
        int nRow = cin.nextInt();
        int mCow = 2;
        List<String[]> range = new ArrayList<>();
        for (int i = 0; i < mRow; i++) {
            String[] row = new String[mCow];
            for (int j = 0; j < mCow; j++) {
                row[j] = cin.next();
            }
            range.add(row);
        }
        String[] numbers = new String[nRow];
        for (int i = 0; i < nRow; i++) {
            numbers[i] = cin.next();
        }
        cin.close();
        String[] results = getRoamingArea(range, numbers);
        if (results.length == 0) {
            System.out.println("empty");
        } else {
            for (String result : results) {
                System.out.println(result);
            }
        }
    }
}
