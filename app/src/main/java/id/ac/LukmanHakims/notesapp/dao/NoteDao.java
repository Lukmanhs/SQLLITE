package id.ac.LukmanHakims.notesapp.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import id.ac.LukmanHakims.notesapp.models.Note;

@Dao
public interface NoteDao {
    @Insert
    void insert(Note... notes);

    @Update
    void update(Note... notes);

    @Delete
    void delete(Note... notes);

    @Query("SELECT * FROM notes")
    LiveData<List<Note>> getAll();
}
