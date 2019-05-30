package com.tseort.BookFactory;

public interface IBook {

    void setTitle(String title);
    void setIsbn(String isbn);
    void setLoanPeriod();
    String getTitle();
    String getIsbn();
    int getLoanPeriod();
}
