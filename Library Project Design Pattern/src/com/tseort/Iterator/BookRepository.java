package com.tseort.Iterator;

import com.tseort.BookFactory.IBook;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements Container {

    public List<IBook> books = new ArrayList<IBook>();

    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }

    public void addBook(IBook user) {
        books.add(user);
    }

    private class BookIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < books.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }
}
