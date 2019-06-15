package com.gamatechno.gtapps.DAO;

import androidx.room.Insert;
import androidx.room.Query;

import com.gamatechno.gtapps.ContactModel;

import java.util.List;

public interface ContactDAO {

    @Insert
    void insertAll(ContactModel... users);

    @Query("SELECT * from contact ORDER BY user_name ASC")
    List<ContactModel> getAllContact();
}
