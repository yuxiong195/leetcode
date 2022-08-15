package 排序;

import java.util.*;

public class LC692 {
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> treeMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            treeMap.put(word, treeMap.getOrDefault(word, 0) + 1);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(treeMap.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if (o2.getValue() == o1.getValue()) {
                return o1.getKey().compareTo(o2.getKey());
            }
            return o2.getValue() - o1.getValue();
        });

        ArrayList<String> strings = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : list.subList(0, k)) {
            strings.add(entry.getKey());
        }
        return strings;
    }

    public static void main(String[] args) {
        String[] s = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(topKFrequent(s, 4));
    }
}
