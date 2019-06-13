package com.tseort.Builder;

import com.tseort.BookFactory.IBook;
import com.tseort.UserFactory.IUser;

public class Loan {

    private IUser user;
    private IBook book;
    private int loanPeriod;

    public Loan() {

    }

    public IUser getUser() {
        return user;
    }

    public Loan setUser(IUser user) {
        this.user = user;
        return this;
    }

    public IBook getBook() {
        return book;
    }

    public Loan setBook(IBook book) {
        this.book = book;
        return this;
    }

    public int getPeriod() {
        return loanPeriod;
    }

    public Loan setPeriod() {
        if (user.getType() == "Premium User") {
            this.loanPeriod = book.getLoanPeriod() + 7;
        } else {
            this.loanPeriod = book.getLoanPeriod();
        }
        return this;
    }
}
