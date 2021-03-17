package com.saradha.leetcode.solution;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstUniqueCharacterInString {
    public static void main(String args[]) {
        System.out.print(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> stringMap = new LinkedHashMap<>(); //to maintain insertion order
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (stringMap.containsKey(character)) {
                int count = stringMap.get(character) + 1;
                stringMap.put(character, count);
            } else {
                stringMap.put(character, 1);
            }

        }
        int index = -1;
        for (Map.Entry<Character, Integer> entry : stringMap.entrySet()) {
            if (entry.getValue() == 1) {
                index = s.indexOf(entry.getKey());
                break;
            }
        }

        return index;
    }
}
