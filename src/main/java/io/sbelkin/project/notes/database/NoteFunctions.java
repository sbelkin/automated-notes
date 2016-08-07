package io.sbelkin.project.notes.database;

import io.sbelkin.project.notes.database.entity.Note;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class NoteFunctions {

    Long id;
    ConcurrentHashMap<Long,Note> concurrentHashMap;

    public NoteFunctions(){
        id = 0L;
        concurrentHashMap = new ConcurrentHashMap<Long, Note>();
    }

    public Long insertNote(Note note){
        id +=1;
        concurrentHashMap.put(id,note);
        return id;
    }

    public Note selectNote(Long id) throws Exception {
        return concurrentHashMap.get(id);

//        if (concurrentHashMap.contains(id)){
//            return concurrentHashMap.get(id);
//        } else {
//            throw new Exception("doenst exist.");
//        }
    }

    public void updateNote(Long id, Note note){
        concurrentHashMap.put(id,note);
    }
}
