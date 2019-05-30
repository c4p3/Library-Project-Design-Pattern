package com.tseort.BookAbstractFactoryMethod;

import com.tseort.BookFactory.AcademicBook;
import com.tseort.BookFactory.BiographyBook;
import com.tseort.BookFactory.FictionBook;
import com.tseort.BookFactory.IBook;

public class AudioBookFactory extends AbstractFactory {

    @Override
    public IBook createBook(String category) {

        if (category.equalsIgnoreCase("fiction")) {
            return new FictionBook();
        } else if (category.equalsIgnoreCase("biography")) {
            return new BiographyBook();
        } else if (category.equalsIgnoreCase("academic")) {
            return new AcademicBook();
        }
        return null;
    }
}
