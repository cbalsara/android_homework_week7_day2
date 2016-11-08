package com.example.user.wordcounter;


/**
 * Created by user on 08/11/2016.
 */

public class WordCount  {
    private String entry;

    public WordCount(String entry){
        this.entry = entry;
    }

    public String getEntry(){
        return this.entry;
    }

    public Integer wordCounter() {
        int count = entry.isEmpty() ? 0 : entry.split("\\s+").length;
        return count;
    }
}



