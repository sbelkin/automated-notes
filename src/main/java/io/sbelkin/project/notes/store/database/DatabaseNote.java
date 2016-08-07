package io.sbelkin.project.notes.store.database;

import io.sbelkin.project.notes.store.NoteFunctions;
import io.sbelkin.project.notes.store.database.notes.InsertNote;
import io.sbelkin.project.notes.store.database.notes.SelectNote;
import io.sbelkin.project.notes.store.database.notes.UpdateNote;
import io.sbelkin.project.notes.store.entity.Note;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class DatabaseNote implements NoteFunctions {

    private InsertNote insertNote;
    private SelectNote selectNote;
    private UpdateNote updateNote;

    public DatabaseNote() throws SQLException {
        DatabaseConnect databaseConnect = new DatabaseConnect();
        Connection connection = databaseConnect.initialize();
        this.insertNote = new InsertNote(connection);
        this.selectNote = new SelectNote(connection);
        this.updateNote = new UpdateNote(connection);
    }

    public Long insertNote(Note note) throws Exception {
        return insertNote.process(note);
    }

    public Note selectNote(Long id) throws Exception {
        return selectNote.process(id);
    }

    public void updateNote(Note note) throws Exception {
        updateNote.process(note);
    }
}
