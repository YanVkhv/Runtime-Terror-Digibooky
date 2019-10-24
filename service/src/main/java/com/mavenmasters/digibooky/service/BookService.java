package com.mavenmasters.digibooky.service;

import com.mavenmasters.digibooky.domain.book.Author;
import com.mavenmasters.digibooky.domain.db.BookDB;
import com.mavenmasters.digibooky.service.dto.BookDto;
import com.mavenmasters.digibooky.service.dto.BookMapper;

import java.util.UUID;

public class BookService {
    private final BookDB bookDB;

    public BookService() {
        this.bookDB = new BookDB();
    }

    public BookDto getDetailsOfBook(UUID uuid) {
        return BookMapper.mapToDto(this.bookDB.getById(uuid));
    }

    public BookDto getBookByTitle(String title) {
        return BookMapper.mapToDto(this.bookDB.getByTitle(title));
    }

    public BookDto getBookByISBN(String isbn) {
        return BookMapper.mapToDto(this.bookDB.getByTitle(isbn));
    }

    public BookDto getBookByAuthor(String name) {
        return BookMapper.mapToDto(this.bookDB.getByTitle(name));
    }
}
