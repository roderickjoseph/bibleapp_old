package com.bibleapp.bibleServices.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VerseMapper {

    @Select("SELECT t FROM t_asv WHERE b = #{id}")
    String[] wholeBook(int id);
}
