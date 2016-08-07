package io.sbelkin.project.notes;

import io.sbelkin.project.notes.database.NoteFunctions;
import io.sbelkin.project.notes.database.entity.Note;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        NoteFunctions noteFunctions = new NoteFunctions();
        Note note = new Note("a","asdsad ", System.currentTimeMillis()/1000);
        long id = noteFunctions.insertNote(note);
        System.out.println(id);
        Note note1 = noteFunctions.selectNote(id);
        System.out.println(note1.toString());
    }
}
