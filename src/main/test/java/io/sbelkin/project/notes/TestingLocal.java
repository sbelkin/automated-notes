package io.sbelkin.project.notes;

import io.sbelkin.project.notes.store.entity.Note;
import io.sbelkin.project.notes.store.entity.User;
import io.sbelkin.project.notes.store.local.LocalNote;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by sbelkin on 8/9/2016.
 */
public class TestingLocal {

    @Test
    public void localTemp() throws Exception {
        User current = new User(1,"admin");
        LocalNote localNote = new LocalNote();
        Note note = new Note("a","asdsad ", current.getId(), System.currentTimeMillis()/1000);
        long id = localNote.insertNote(note);
        Assert.assertEquals(id,1);
        Note noteActual = localNote.selectNote(id);
        note.setId(id);
        Assert.assertEquals(noteActual,note);
        try {
            Note note2 = localNote.selectNote(2L);
        } catch (Exception e){
            Assert.assertEquals(e.getMessage(),"doenst exist.");
        }

    }

    @Test
    public void localFile() throws Exception {
        User current = new User(1,"admin");
        String folderPath = "src\\main\\test\\resources\\file";
        LocalNote localNote = new LocalNote();
        File[] files = new File(folderPath).listFiles();
        long count = 0;
        for (File file: files) {
            String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
            Note note = new Note(file.getName(),content.toString(), current.getId(), System.currentTimeMillis()/1000);
            long id = localNote.insertNote(note);
            count += 1;
            Assert.assertEquals(id,count);
            Note noteActual = localNote.selectNote(id);
            note.setId(count);
            Assert.assertEquals(noteActual,note);
        }
    }
}
