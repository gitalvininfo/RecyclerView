package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRevView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contactsRevView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Alvin Yanson", "yansonalvin29@gmail.com", "https://www.chessforstudents.com/wp-content/uploads/Misha-Osipov-3-years-old-eyes-looking-at-camera.jpg"));
        contacts.add(new Contact("Alvin Yanson", "yansonalvin29@gmail.com", "https://www.chessforstudents.com/wp-content/uploads/Misha-Osipov-3-years-old-eyes-looking-at-camera.jpg"));
        contacts.add(new Contact("Alvin Yanson", "yansonalvin29@gmail.com", "https://www.chessforstudents.com/wp-content/uploads/Misha-Osipov-3-years-old-eyes-looking-at-camera.jpg"));
        contacts.add(new Contact("Alvin Yanson", "yansonalvin29@gmail.com", "https://www.chessforstudents.com/wp-content/uploads/Misha-Osipov-3-years-old-eyes-looking-at-camera.jpg"));
        contacts.add(new Contact("Alvin Yanson", "yansonalvin29@gmail.com", "https://www.chessforstudents.com/wp-content/uploads/Misha-Osipov-3-years-old-eyes-looking-at-camera.jpg"));


        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRevView.setAdapter(adapter);
//        contactsRevView.setLayoutManager(new LinearLayoutManager(this));
        contactsRevView.setLayoutManager(new GridLayoutManager(this, 2));


    }
}