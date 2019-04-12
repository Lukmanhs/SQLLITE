package id.ac.LukmanHakims.notesapp;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import id.ac.LukmanHakims.notesapp.models.Note;
import repositories.NoteRepository;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepository repository;
    private LiveData<List<Note>> notes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        this.repository = new NoteRepository(application);
        this.notes = repository.getNotes();
    }

    public LiveData<List<Note>> getNotes() {
        return notes;
    }

    public  void insert(Note note){
        repository.insert(note);
    }

    public void update(Note note){
        repository.update(note);
    }


}
