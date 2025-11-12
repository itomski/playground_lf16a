package de.gfn.playground.collections;

import java.time.LocalDateTime;

public class Task {

    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime doneAt;

    public Task(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getDoneAt() {
        return doneAt;
    }

    public boolean isDone() {
        return doneAt != null;
    }

    public void setDone() {
        if(!isDone()) {
            doneAt = LocalDateTime.now();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("name='").append(name).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append(", doneAt=").append(doneAt);
        sb.append('}');
        return sb.toString();
    }
}
