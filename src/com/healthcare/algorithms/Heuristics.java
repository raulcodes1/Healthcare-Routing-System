package com.healthcare.algorithms;

public class Heuristics {

    public static int estimate(String a, String b) {
        return Math.abs(a.charAt(0) - b.charAt(0));
    }
}