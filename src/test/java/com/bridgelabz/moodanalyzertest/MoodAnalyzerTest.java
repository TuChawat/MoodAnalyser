package com.bridgelabz.moodanalyzertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class MoodAnalyzerTest {

    @Test
    public void givenMessage_whenSad_ShouldReturnSad() throws MoodException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() throws MoodException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Happy Message");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            String mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("HAPPY", mood);
        }catch(MoodException e) {
            e.getMessage();
        }
    }

}