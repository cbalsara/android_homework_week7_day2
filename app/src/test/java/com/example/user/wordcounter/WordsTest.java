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
        wordCount = new WordCount("This string is entered as an example");
    }

    @Test
    public void enteringTextTest(){
        assertEquals("This string is entered as an example", wordCount.getEntry());
    }

    @Test
    public void CountingAllTheWords(){
        assertEquals(7, wordCount.wordCounter().intValue());
    }



}
















