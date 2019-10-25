package com.mavenmasters.digibooky.domain.db;

import com.mavenmasters.digibooky.domain.book.BookLoan;

import java.util.HashMap;
import java.util.UUID;

public class BookLoanDB implements Database {
    private final HashMap<UUID, BookLoan> bookLoans;

    public BookLoanDB() {
        this.bookLoans = new HashMap<>();
    }

    @Override
    public HashMap<UUID, BookLoan> getAll() {
        return this.bookLoans;
    }

    @Override
    public BookLoan getById(UUID id) {
        return bookLoans.entrySet().stream().filter(uuidBookLoanEntry -> uuidBookLoanEntry.getKey().equals(id))
                .findFirst()
                .get()
                .getValue();
    }

    public BookLoan addBookLoan(BookLoan bookLoan) {
        return this.bookLoans.put(bookLoan.getId(), bookLoan);
    }
}
