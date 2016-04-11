package com.zmt.nlp.twitter;

import java.util.ArrayList;

/**
 * Created by hisham on 11/04/2016.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String topic = "Trump";
        ArrayList<String> tweets = TweetManager.getTweets(topic);
        NLP.init();

        for (String tweet : tweets) {
            System.out.println(NLP.getSentiment(tweet) + ":\t" + tweet.replaceAll("\n", " "));
        }
    }
}
