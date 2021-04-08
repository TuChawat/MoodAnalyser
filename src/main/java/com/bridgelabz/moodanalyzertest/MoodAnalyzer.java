package com.bridgelabz.moodanalyzertest;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(String input) {
        message = input;
    }

    public String analyseMood()  throws MoodException {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }else{
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodException("Please enter proper message");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer");
    }
}
