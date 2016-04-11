package com.zmt.nlp.twitter;

import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hisham on 11/04/2016.
 * Copyright 2016, All rights reserved.
 * <p>
 * <contact>
 * Hisham Ismail <mhishami@gmail.com>
 * </contact>
 */
public class TweetManager {

    public TweetManager() {
    }

    public static ArrayList<String> getTweets(String topic) {
        Twitter twitter = new TwitterFactory().getInstance();
        ArrayList<String> tweetList = new ArrayList<String>();
        try {
            int count = 10;

            Query query = new Query(topic);
            QueryResult queryResult;

            do {
                queryResult = twitter.search(query);
                List<Status> tweets = queryResult.getTweets();
                for (Status tweet : tweets) {
                    tweetList.add(tweet.getText());
                }
            } while ((query = queryResult.nextQuery()) != null && --count != 0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getErrorMessage());
        }

        return tweetList;

    }
}
