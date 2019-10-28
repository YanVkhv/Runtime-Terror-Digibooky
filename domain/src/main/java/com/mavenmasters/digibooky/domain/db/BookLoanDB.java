package com.mavenmasters.digibooky.domain.db;

import com.mavenmasters.digibooky.domain.book.Book;
import com.mavenmasters.digibooky.domain.book.BookLoan;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class BookLoanDB implements Database {
    private HashMap<UUID, BookLoan> bookLoans;

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
        this.bookLoans.put(bookLoan.getId(), bookLoan);
        return bookLoan;
    }

    public BookLoan returnBookLoan(UUID bookLoanId) {
        BookLoan bookLoan = this.getById(bookLoanId);
        bookLoan.setReturned(true);
        bookLoans.put(bookLoan.getId(), bookLoan);
        return bookLoan;
    }

    public List<BookLoan> getAllBookLoansByMemberId(UUID memberUuid) {
        return bookLoans.values().stream()
                .filter(bookLoan -> bookLoan.getMemberId().equals(memberUuid))
                .collect(Collectors.toList());
    }

    public BookLoan getNonReturnedBookLoanByBookUuid(UUID bookUuid) {
        return bookLoans.values().stream()
                .filter(bookLoan -> bookLoan.getId().equals(bookUuid))
                .filter(bookLoan -> !bookLoan.isReturned())
                .findFirst()
                .get();
    }
}
