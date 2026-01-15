package com.andersenlab.nurlib.service;

import com.andersenlab.nurlib.dto.request.BookRequestDto;
import com.andersenlab.nurlib.entity.Book;

import java.util.List;

public interface BookService {

    Book getBookById(Long id);

    Book getBookByIsbn(String isbn);

    List<Book> getAllBooks();

    Long createBook(BookRequestDto dto);

    Book updateBook(Long id, BookRequestDto dto);

    boolean deleteBook(Long id);
}
