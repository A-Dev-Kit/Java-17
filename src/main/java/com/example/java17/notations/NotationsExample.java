package com.example.java17.notations;

import com.example.java17.record.IntegerRecord;

public final class NotationsExample {

    public static int evaluate(IntegerRecord record) {
        var first = record.first();
        var second = record.second();
        return (first++) + (++second) * record.third() - (first--) + (--second);
    }
}
