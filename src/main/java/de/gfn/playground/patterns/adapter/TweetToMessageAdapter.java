package de.gfn.playground.patterns.adapter;

public class TweetToMessageAdapter implements Message {

    private Tweet tweet;

    public TweetToMessageAdapter(Tweet tweet) {
        this.tweet = tweet;
    }

    @Override
    public void submit() {
        tweet.post();
    }
}
