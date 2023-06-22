package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class DistinctCharacters {

    public static void main(String[] args) {
        String str = "test string";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : charCountMap.keySet()) {
            int count = charCountMap.get(c);
            System.out.println(c + "-" + count);
        }
    }
}

