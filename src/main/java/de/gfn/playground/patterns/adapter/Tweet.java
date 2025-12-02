package de.gfn.playground.patterns.adapter;

import java.util.Arrays;

public class Tweet {

    private String author;
    private String group;
    private String title;
    private String body;
    private String[] tags;

    public Tweet(String author, String group, String title, String body, String... tags) {
        this.author = author;
        this.group = group;
        this.title = title;
        this.body = body;
        this.tags = tags;
    }

    public void post() {
        StringBuilder sb = new StringBuilder("\n----- POST TWEET -----");
        sb.append("\n\tAUTOR: \t").append(author)
                .append("\n\tGROUP: \t").append(group)
                .append("\n\tTITLE: \t").append(title)
                .append("\n\tBODY: \t").append(body)
                .append("\n\tTAGS: \t").append(Arrays.toString(tags))
                .append("\n----- END -----");
        System.out.println(sb);
    }
}
