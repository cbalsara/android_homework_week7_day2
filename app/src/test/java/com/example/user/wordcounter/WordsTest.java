package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;



import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/11/2016.
 */

public class WordsTest {

    WordCount wordCount;

    @Before
    public void before(){
        wordCount = new WordCount("This string is entering");
    }

    @Test
    public void enteringTextTest(){
        assertEquals("This string is entered", wordCount.getEntry());
    }

    @Test
    public void CountingAllTheWords(){
        assertEquals(4, wordCount.wordCounter().intValue());
    }



}
















