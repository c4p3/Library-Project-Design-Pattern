package com.tseort.BookFactory;

public class BookFactory {

    public IBook createBook(String category) {
        switch (category.toLowerCase()) {
            case "academic":
                return new AcademicBook();
            case "biography":
                return new BiographyBook();
            case "fiction":
                return new FictionBook();
            default:
                return null;
        }
    }
}
