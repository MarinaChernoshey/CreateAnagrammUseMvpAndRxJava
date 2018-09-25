package com.example.fanmu.task1anagrams;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestAnagram {

    @Test
    public void testAnagramFunction() {
        String anagram = StringUtil.getAnagram("and!123roid test123 123anagram");
        assertEquals(anagram, "dio!123rdna tset123 123margana");
    }
}
