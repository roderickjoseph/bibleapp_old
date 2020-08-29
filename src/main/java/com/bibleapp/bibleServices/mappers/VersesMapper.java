package com.bibleapp.bibleServices.mappers;

import com.bibleapp.bibleServices.models.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VersesMapper {
    Book bookById(int id);
}
