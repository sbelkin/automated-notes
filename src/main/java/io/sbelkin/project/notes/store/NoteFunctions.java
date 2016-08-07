package io.sbelkin.project.notes.store;

import io.sbelkin.project.notes.store.entity.Note;

import java.util.HashMap;

/**
 * Created by sbelkin on 8/7/2016.
 */
public interface NoteFunctions {

    public Long insertNote(Note note) throws Exception;

    public Note selectNote(Long id) throws Exception;

    public void updateNote(Note note) throws Exception;

}
