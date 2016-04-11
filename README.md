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
fetch from the search
