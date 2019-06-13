package com.tseort.BookAbstractFactoryMethod;

import com.tseort.BookFactory.EBook;
import com.tseort.BookFactory.IBook;

public class EBookFactory extends AbstractFactory {

    @Override
    public IBook createBook(String category) {

        IBook book = new EBook();
        book.setLoanPeriod(category);
        return book;
    }
}
