package com.example.mapper;

import com.example.pojo.book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    @Select("select * from book.book where name = #{name}")
    book findByname(String name);

    @Insert("insert into book.book values(#{id},#{name})")
    void addBook(book book);

    @Delete("delete from book.book where id = #{id}")
    void deleteBook(Integer id);
}
