package com.tseort.BookAbstractFactoryMethod;

public class FactoryProducer {

    public static AbstractFactory getFactory(String bookType) {

        if (bookType.equalsIgnoreCase("textbook")) {
            return new TextBookFactory();
        } else if (bookType.equalsIgnoreCase("ebook")) {
            return new EBookFactory();
        } else if (bookType.equalsIgnoreCase("audiobook")) {
            return new AudioBookFactory();
        } else {
            System.out.println("Booktype not recognized!");
            return null;
        }
    }
}
