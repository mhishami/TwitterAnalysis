# TwitterAnalysis
Sample NLP Analysis on Twitter

# Setup
First, you need to add `twitter4j.properties`. The file should contain your Twitter secret keys and all

```
oauth.consumerKey=<api-key-for-your-app>
oauth.consumerSecret=<api-secret-for-your-app>
oauth.accessToken=<access-token>
oauth.accessTokenSecret=<access-token-secret>
```

# How to run
- clone the repo
- `$ mvn exec:java`

That would run the sample analysis using "Trump" as the argument in the Twitter Hose.
