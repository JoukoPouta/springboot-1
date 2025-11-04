package com.example.controller;

import com.example.pojo.book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Bookcontorller {
    @Autowired
    private BookService bookService;
    @RequestMapping("/find")
    public String FindBook(String name) {
        book b = bookService.findByname(name);
        if (b == null) {
            return "没有此书";
        } else {
            return "书名：" + b.getName();
        }
    }
    @RequestMapping("add")
    public String addBook(Integer id , String name) {
        book b = new book();
        b.setId(id);
        b.setName(name);
        bookService.addBook(b);
        return "添加成功";
    }
}
