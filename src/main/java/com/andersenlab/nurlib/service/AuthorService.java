package com.andersenlab.nurlib.service;

import com.andersenlab.nurlib.dto.request.AuthorRequestDto;
import com.andersenlab.nurlib.entity.Author;

import java.util.List;

public interface AuthorService {

    Author getAuthorById(String id);

    List<Author> getAllAuthors();

    String createAuthor(AuthorRequestDto dto);

    Author updateAuthor(String id, AuthorRequestDto dto);

    boolean deleteAuthor(String id);
}
