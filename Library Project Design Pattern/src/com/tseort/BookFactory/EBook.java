package com.tseort.BookFactory;

public class EBook implements IBook {

    String title;
    String isbn;
    int loanPeriod;
    String category;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void setLoanPeriod() {
        this.loanPeriod = 14;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }
}
