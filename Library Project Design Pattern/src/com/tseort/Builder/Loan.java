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

    public void setUser(IUser user) {
        this.user = user;
    }

    public IBook getBook() {
        return book;
    }

    public void setBook(IBook book) {
        this.book = book;
    }

    public int getPeriod() {
        return loanPeriod;
    }

    public void setPeriod() {
        if (user.getType() == "Premium User") {
            this.loanPeriod = book.getLoanPeriod() + 7;
        } else {
            this.loanPeriod = book.getLoanPeriod();
        }
    }
}
