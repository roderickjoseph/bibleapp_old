package com.bibleapp.bibleServices.controllers;

import com.bibleapp.bibleServices.mappers.VerseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Main {

    @Autowired
    private VerseMapper verseMapper;

    @GetMapping
    public void welcomeHome() {}

    @GetMapping("book/{id}")
    public String[] wholeBook(@PathVariable(value = "id") int id) {
        return this.verseMapper.wholeBook(id);
    }
}
