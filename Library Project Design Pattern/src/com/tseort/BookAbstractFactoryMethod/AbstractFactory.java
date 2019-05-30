package com.tseort.BookAbstractFactoryMethod;

import com.tseort.BookFactory.IBook;

public abstract class AbstractFactory {

    public abstract IBook createBook(String category);

}
