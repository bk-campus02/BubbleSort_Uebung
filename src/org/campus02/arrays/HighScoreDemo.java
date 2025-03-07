package org.campus02.arrays;

import java.util.Arrays;

public class HighScoreDemo {

    public static void main(String[] args) {

        HighScore[] highScores = {
                new HighScore("Max", 100.20),
                new HighScore("Susi", 240.50),
                new HighScore("John", 23.90),
        };

        System.out.println(Arrays.toString(highScores));

        System.out.println();

        Arrays.sort(highScores);
        System.out.println("Die sortierte Liste: " + Arrays.toString(highScores));


    }

}
