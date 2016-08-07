package io.sbelkin.project.notes.store.entity;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class Note {

    private long id;
    private String user;
    private String context;
    private long date;

    public Note() {
    }

    public Note(String user, String context, long date) {
        this.user = user;
        this.context = context;
        this.date = date;
    }
    public Note(long id, String user, String context, long date) {
        this.id = id;
        this.user = user;
        this.context = context;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
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
                ", user='" + user + '\'' +
                ", context='" + context + '\'' +
                ", date=" + date +
                '}';
    }
}
