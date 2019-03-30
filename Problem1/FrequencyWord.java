package com.dlegacy.course3.Problem1;

import java.io.File;
import java.util.*;

public class FrequencyWord {
    String text;

    public FrequencyWord(String text){
        this.text = text;
    }

    public void DisplayCount(){
        for(String word : text.split(" ")){
            System.out.println("Frequency of: " + "< " + word + " >" + " is " + Collections.frequency(Arrays.asList(text.split("\\s")), word));
        }
    }
}
