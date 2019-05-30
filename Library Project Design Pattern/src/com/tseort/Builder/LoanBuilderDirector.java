package com.tseort.Builder;

import com.tseort.BookFactory.IBook;
import com.tseort.UserFactory.IUser;

public class LoanBuilderDirector {

    private IUser user;
    private IBook book;
    private ILoanBuilder builder;

    public LoanBuilderDirector(final ILoanBuilder builder) {
        this.builder = builder;
    }

    public Loan construct() {
        return builder.setUser(user).setBook(book).build();
    }
}
