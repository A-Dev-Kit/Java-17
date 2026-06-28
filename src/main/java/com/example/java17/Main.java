package com.example.java17;

import com.example.java17.notations.NotationsExample;
import com.example.java17.record.IntegerRecord;

public class Main {
    public static void main(String[] args) {
        System.out.println(NotationsExample.evaluate(new IntegerRecord(5, 10, 2)));
    }
}
