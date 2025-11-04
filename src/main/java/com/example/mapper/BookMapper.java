package com.example.mapper;

import com.example.pojo.book;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BookMapper {
    @Select("select * from book.book where name = #{name}")
    book findByname(String name);

    @Insert("insert into book.book values(#{id},#{name})")
    void addBook(book book);

    @Delete("delete from book.book where id = #{id}")
    void deleteBook(Integer id);

    @Update("update book.book set name = #{name} where id = #{id}")
    void updateBook(book b);
}
