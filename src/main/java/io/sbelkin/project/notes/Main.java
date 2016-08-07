package io.sbelkin.project.notes;

import io.sbelkin.project.notes.store.NoteFunctions;
import io.sbelkin.project.notes.store.entity.Note;
import io.sbelkin.project.notes.store.local.LocalNote;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        LocalNote localNote = new LocalNote();
        Note note = new Note("a","asdsad ", System.currentTimeMillis()/1000);
        long id = localNote.insertNote(note);
        System.out.println(id);
        Note note1 = localNote.selectNote(id);
        System.out.println(note1.toString());
        Note note2 = localNote.selectNote(2L);

    }
}
