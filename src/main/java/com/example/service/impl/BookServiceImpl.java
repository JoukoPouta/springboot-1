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
    public void addBook(book b) {
        bookMapper.addBook(b);
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.deleteBook(id);
    }

    @Override
    public void UpdateBook(book b) {
        bookMapper.updateBook(b);
    }
}
