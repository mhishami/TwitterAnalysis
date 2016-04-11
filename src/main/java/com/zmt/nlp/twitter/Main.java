package com.zmt.nlp.twitter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hisham on 11/04/2016.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the text to search:");
        String context = scan.next();

        ArrayList<String> tweets = TweetManager.getTweets(context);
        NLP.init();

        for (String tweet : tweets) {
            System.out.println(NLP.getSentiment(tweet) + ":\t" + tweet.replaceAll("\n", " "));
        }
    }
}
