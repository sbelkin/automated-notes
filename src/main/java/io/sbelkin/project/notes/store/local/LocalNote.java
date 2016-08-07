package io.sbelkin.project.notes.store.local;

import io.sbelkin.project.notes.store.NoteFunctions;
import io.sbelkin.project.notes.store.entity.Note;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sbelkin on 8/7/2016.
 */
public class LocalNote implements NoteFunctions{

    Long id;
    private HashMap<Long,Note> map;

    public LocalNote(){
        id = 0L;
        map = new HashMap<Long, Note>();
    }

    public Long insertNote(Note note){
        id +=1;
        map.put(id,note);
        return id;
    }

    public Note selectNote(Long id) throws Exception {
        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            throw new Exception("doenst exist.");
        }
    }

    public void updateNote(Long id, Note note){
        map.put(id,note);
    }
}
