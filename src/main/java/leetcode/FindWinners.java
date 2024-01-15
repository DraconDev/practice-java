package leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWinners {
    // public static List<List<Integer>> findWinners(int[][] matches) {
    // Map<Integer, Integer> map = new HashMap<>();

    // for (int[] match : matches) {
    // map.put(match[0], map.getOrDefault(match[0], 0));
    // map.put(match[1], map.getOrDefault(match[1], 0) + 1);
    // }

    // List<List<Integer>> result = new ArrayList<>();
    // result.add(new ArrayList<Integer>());
    // result.add(new ArrayList<Integer>());

    // for (Integer key : map.keySet()) {
    // if (map.get(key) == 0) {
    // result.get(0).add(key);
    // } else if (map.get(key) == 1) {
    // result.get(1).add(key);
    // }
    // }

    // return result;

    // }

    public static List<List<Integer>> findWinners(int[][] matches) {

        Set<Integer> no_loss = new HashSet<>();
        Set<Integer> one_loss = new HashSet<>();
        Set<Integer> more_loss = new HashSet<>();

        for (int[] match : matches) {
            if (no_loss.contains(match[1])) {
                no_loss.remove(match[1]);
                one_loss.add(match[1]);
            } else if (one_loss.contains(match[1])) {
                one_loss.remove(match[1]);
                more_loss.add(match[1]);
            } else if (!more_loss.contains(match[1])) {
                one_loss.add(match[1]);
            }
            if (!one_loss.contains(match[0]) && !more_loss.contains(match[0])) {
                no_loss.add(match[0]);
            }
        }
        List<List<Integer>> result = new java.util.ArrayList<>();
        result.add(new java.util.ArrayList<>(no_loss));
        Collections.sort(result.get(0));
        result.add(new java.util.ArrayList<>(one_loss));
        Collections.sort(result.get(1));

        return result;
    }
}