package com.tseort.BookAbstractFactoryMethod;

import com.tseort.BookFactory.TextBook;
import com.tseort.BookFactory.AudioBook;
import com.tseort.BookFactory.EBook;
import com.tseort.BookFactory.IBook;

public class AudioBookFactory extends AbstractFactory {

    @Override
    public IBook createBook(String category) {

        if (category.equalsIgnoreCase("fiction")) {
            return new EBook();
        } else if (category.equalsIgnoreCase("biography")) {
            return new AudioBook();
        } else if (category.equalsIgnoreCase("academic")) {
            return new TextBook();
        }
        return null;
    }
}
