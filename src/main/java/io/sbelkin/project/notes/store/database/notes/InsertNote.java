package io.sbelkin.project.notes.store.database.notes;

import io.sbelkin.project.notes.store.database.DatabaseConnect;
import io.sbelkin.project.notes.store.entity.Note;

import java.sql.*;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class InsertNote extends DatabaseConnect {

    Connection connection;

    public InsertNote(Connection connection){
        this.connection = connection;
    }

    private String query(){
        String insert = "INSERT INTO note (name,context,timestamp) values(?,?,Now())";
        return insert;
    }

    public Long process(Note note) throws Exception {
        try {
            PreparedStatement ps = connection.prepareStatement(query(), Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, note.getName());
            ps.setString(2, note.getContext());
            boolean update = ps.execute();
            if (update){
                return ps.getGeneratedKeys().getLong(1);
            } else {
                throw new Exception("no key to return.");
            }
        } catch (Exception e){
            throw e;
        }
    }

}
