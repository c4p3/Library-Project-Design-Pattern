package com.tseort.BookAbstractFactoryMethod;

import com.tseort.BookFactory.TextBook;
import com.tseort.BookFactory.AudioBook;
import com.tseort.BookFactory.EBook;
import com.tseort.BookFactory.IBook;

public class TextBookFactory extends AbstractFactory {

    @Override
    public IBook createBook(String category) {

        IBook book = new TextBook();
        book.setLoanPeriod(category);
        return book;
    }
}
