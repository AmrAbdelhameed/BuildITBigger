package com.example.myjavalib;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by amr on 30/11/17.
 */

public class JokeClass {
    private static List<String> jokeList = Arrays.asList(
            "Joke 1",
            "Joke 2",
            "Joke 3",
            "Joke 4",
            "Joke 5");

    public static String getJoke() {
        Random ran = new Random();
        int jokeListIndex = ran.nextInt(5);
        return jokeList.get(jokeListIndex);
    }
}
