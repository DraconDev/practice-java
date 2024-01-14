package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloseStrings {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        // make a str map
        Map<Character, Integer> strMap = new HashMap<>();
        Map<Character, Integer> strMap2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            strMap.put(word1.charAt(i), strMap.getOrDefault(word1.charAt(i), 0) + 1);
            strMap2.put(word2.charAt(i), strMap2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (strMap.size() != strMap2.size()) {
            return false;
        }

        for (char c : strMap.keySet()) {
            if (!strMap2.containsKey(c)) {
                return false;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer c : strMap.values()) {
            list.add(c);
        }
        list.sort(null);

        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer c : strMap2.values()) {
            list2.add(c);
        }
        list2.sort(null);

        return list.equals(list2);

    }
}