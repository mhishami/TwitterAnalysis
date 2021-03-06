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

You can create the keys here at [Twitter Apps](https://apps.twitter.com)
- Sign in to your Twitter account
- Create the app by clicking the `Create New App` button
- Fill in the application details, and accept the Agreement
- Create the `Access Token`.

# How to run
- clone the repo
- Add the `twitter4j.properties` in the classpath.
- `$ mvn exec:java`

```
[INFO] ------------------------------------------------------------------------
[INFO] Building twitter-analysis 1.0.0
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> exec-maven-plugin:1.2.1:java (default-cli) > validate @ twitter-analysis >>>
[INFO]
[INFO] <<< exec-maven-plugin:1.2.1:java (default-cli) < validate @ twitter-analysis <<<
[INFO]
[INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ twitter-analysis ---
Enter the text to search:
```

Enter the phrase to search for when prompted, and the sentiment analysis is then applied for each message
fetched from the search
