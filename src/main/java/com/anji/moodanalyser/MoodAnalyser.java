package com.anji.moodanalyser;

/**
 * Program on MoodAnalyser
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 22/10/2021
 *
 */

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("happy")) {
            return "Happy";
        } else if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else
            return null;
    }


    public static void main(String[] args) {
        String mood = MoodAnalyser.analyseMood("I am Happy");
        System.out.println(mood);
        mood = MoodAnalyser.analyseMood("I am Sad");
        System.out.println(mood);
    }
}