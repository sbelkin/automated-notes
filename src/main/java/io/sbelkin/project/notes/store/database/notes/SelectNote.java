package io.sbelkin.project.notes.store.database.notes;

import io.sbelkin.project.notes.store.database.DatabaseConnect;
import io.sbelkin.project.notes.store.entity.Note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class SelectNote extends DatabaseConnect {

    Connection connection;

    public SelectNote(Connection connection){
        this.connection = connection;
    }

    private String query(){
        String select = "Select * from note where id = ?";
        return select;
    }

    public Note process(Long id) throws Exception {
        try {
            PreparedStatement ps = connection.prepareStatement(query());
            ps.setLong(1, id);
            ResultSet resultSet = ps.executeQuery();
            Note note = new Note();
            while (resultSet.next()){
                String user = resultSet.getString("user");
                String context = resultSet.getString("context");
                long date = resultSet.getLong("date");
                note = new Note(id, user,context,date);
            }
            return note;
        } catch (Exception e){
            throw e;
        }
    }

}
