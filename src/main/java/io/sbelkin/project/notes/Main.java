package io.sbelkin.project.notes;

import io.sbelkin.project.notes.store.entity.Note;
import io.sbelkin.project.notes.store.entity.User;
import io.sbelkin.project.notes.store.local.LocalNote;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        localTemp();
    }

    public static void localTemp() throws Exception {
        User current = new User(1,"admin");
        LocalNote localNote = new LocalNote();
        Note note = new Note("a","asdsad ", current.getId(), System.currentTimeMillis()/1000);
        long id = localNote.insertNote(note);
        System.out.println(id);
        Note note1 = localNote.selectNote(id);
        System.out.println(note1.toString());
        Note note2 = localNote.selectNote(2L);
    }

}
