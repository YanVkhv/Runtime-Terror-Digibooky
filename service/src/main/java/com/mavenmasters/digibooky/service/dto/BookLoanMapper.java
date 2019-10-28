package com.mavenmasters.digibooky.service.dto;

import com.mavenmasters.digibooky.domain.book.BookLoan;

public class BookLoanMapper {
    public static BookLoanDto mapToDto(BookLoan bookLoan) {
        return new BookLoanDto(
                bookLoan.getMemberId(),
                bookLoan.getBookIsbn(),
                bookLoan.getDueDate(),
                bookLoan.isReturned()
                );
    }
}