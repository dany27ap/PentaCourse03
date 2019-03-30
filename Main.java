package com.dlegacy.course3;

import com.dlegacy.course3.Problem1.FrequencyWord;

public class Main {

    public static void main(String[] args) {
        String txt = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been " +
                "the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type " +
                "and scrambled it to make a type specimen book.";

    }

    public static boolean isDivisible(int n, int m){
        if(n % m == 0){
            return true;
        }
        return false;
    }
}
