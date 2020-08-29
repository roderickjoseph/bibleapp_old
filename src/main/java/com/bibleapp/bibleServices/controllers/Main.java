package com.bibleapp.bibleServices.controllers;

import com.bibleapp.bibleServices.mappers.VersesMapper;
import com.bibleapp.bibleServices.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Main {

    @Autowired
    VersesMapper versesMapper;

    @GetMapping
    public void welcomeHome() {}

    @GetMapping("book/{id}")
    public Book wholeBook(@PathVariable(value = "id") int id) {
        return this.versesMapper.bookById(id);
    }
}
