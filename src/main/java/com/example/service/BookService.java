package com.example.service;

import com.example.pojo.book;

public interface BookService {

    book findByname(String name);

    void addBook(book book);

    void deleteBook(Integer id);
}
