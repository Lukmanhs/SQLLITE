package id.ac.LukmanHakims.notesapp.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import id.ac.LukmanHakims.notesapp.models.User;

@Dao
public interface UserDao {
    @Insert
    void insert(User... user);

    @Query("SELECT * FROM users WHERE username = :username LIMIT 1")
    LiveData<User> getUserByUsername(String username);
}
