package org.ebikari;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class BidiMapDemo {

    public static void main(String[] args) {
        // initialize map
        BidiMap<String, Integer> bidiMap = new TreeBidiMap<>() {{
            put("one", 1);
            put("two", 1); // replaces the key "one"
        }};

        // "two"
        System.out.println(bidiMap.getKey(1));

        // {two=1}
        System.out.println(bidiMap);

    }
}
