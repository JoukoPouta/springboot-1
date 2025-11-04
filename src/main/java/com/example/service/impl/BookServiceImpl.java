package com.example.service.impl;

import com.example.mapper.BookMapper;
import com.example.pojo.book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public book findByname(String name) {
        book b = bookMapper.findByname(name);
        return b;
    }

    @Override
    public void addBook(book book) {
        bookMapper.addBook(book);
    }
}
