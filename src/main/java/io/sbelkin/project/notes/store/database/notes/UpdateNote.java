package io.sbelkin.project.notes.store.database.notes;

import io.sbelkin.project.notes.store.database.DatabaseConnect;
import io.sbelkin.project.notes.store.entity.Note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class UpdateNote extends DatabaseConnect {

    Connection connection;

    public UpdateNote(Connection connection){
        this.connection = connection;
    }

    private String query(){
        String insert = "INSERT INTO note (id,user,context,timestamp) values(?,?,?,Now())";
        return insert;
    }

    public void process(Note note) throws Exception {
        try {
            PreparedStatement ps = connection.prepareStatement(query());
            ps.setLong(1, note.getId());
            ps.setString(2, note.getUser());
            ps.setString(3, note.getContext());
            int update = ps.executeUpdate();
            if (update == 0){
                throw new Exception("No rows updated error.");
            }
        } catch (Exception e){
            throw e;
        }
    }
}
