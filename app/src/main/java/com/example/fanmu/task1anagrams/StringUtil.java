package com.example.fanmu.task1anagrams;

import android.util.Log;

import com.example.fanmu.task1anagrams.Mvp.MainActivity;

public final class StringUtil {

    public static String getAnagram(String text) {
        StringBuilder wordAnagram = new StringBuilder();
        for (String word : text.split("[\\s]+")) {
            wordAnagram.append(rotate1(word.toCharArray())).append(" ");
        }
        wordAnagram.delete(wordAnagram.length() - 1, wordAnagram.length());
        return String.valueOf(wordAnagram);
    }

    private static String rotate1(char[] symbols) {
        char symbolForChange;
        int indexTail = symbols.length - 1;
        for (int indexHead = 0; indexHead < indexTail; indexHead++) {
            if (!Character.isLetter(symbols[indexHead])) continue;
            while (!Character.isLetter(symbols[indexTail]))
                indexTail--;
            symbolForChange = symbols[indexHead];
            symbols[indexHead] = symbols[indexTail];
            symbols[indexTail] = symbolForChange;
            indexTail--;
        }
        return String.valueOf(symbols);
    }
}