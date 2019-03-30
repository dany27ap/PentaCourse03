package com.dlegacy.course3.Problem3;

import java.lang.reflect.Array;
import java.util.Random;

public class cloneArray {
    int []array;
    int n;

    public cloneArray(int[] array, int n) {
        this.n = n;
        this.array = new int[this.n];
    }

    public void initialization(int high){
        Random random = new Random();
        for (int i = 0; i < this.array.length; i++) {
            int rando = random.nextInt(high);
            this.array[i] = rando;
        }
    }

    public cloneArray(cloneArray arr){
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = arr.array[i];
        }
    }

    public int pozition(int element){
        for (int i = 0; i <this.array.length ; i++) {
            if(this.array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int maxInSecvention(int n, int m){
        int max = this.array[n];
        for(int i = n; i < m; ++i){
            if(max < this.array[i]){
                max = this.array[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int var : this.array){
            sb.append(var + " ");
        }
        return sb.toString();
    }
}
