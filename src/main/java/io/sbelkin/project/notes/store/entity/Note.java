package io.sbelkin.project.notes.store.entity;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class Note {

    private long id;
    private String name;
    private String context;
    private long userId;
    private long date;

    public Note() {
    }

    public Note(String name, String context, long userId, long date) {
        this.name = name;
        this.context = context;
        this.date = date;
        this.userId = userId;
    }

    public Note(long id, String name, String context, long userId, long date) {
        this.id = id;
        this.name = name;
        this.context = context;
        this.date = date;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", context='" + context + '\'' +
                ", userId=" + userId +
                ", date=" + date +
                '}';
    }
}
