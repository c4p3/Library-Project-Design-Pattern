package com.tseort;

import com.tseort.BookAbstractFactoryMethod.AbstractFactory;
import com.tseort.BookAbstractFactoryMethod.FactoryProducer;
import com.tseort.BookFactory.IBook;
import com.tseort.Builder.Loan;
import com.tseort.Builder.LoanBuilder;
import com.tseort.Builder.LoanBuilderDirector;
import com.tseort.Iterator.BookRepository;
import com.tseort.Iterator.Iterator;
import com.tseort.Iterator.LoanRepository;
import com.tseort.Iterator.UserRepository;
import com.tseort.UserFactory.IUser;
import com.tseort.UserFactory.UserFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        UserRepository userList = new UserRepository();
        BookRepository bookList = new BookRepository();
        LoanRepository loanList = new LoanRepository();

        AbstractFactory textBookFactory = FactoryProducer.getFactory("textbook");
        AbstractFactory eBookFactory = FactoryProducer.getFactory("ebook");
        AbstractFactory audioBookFactory = FactoryProducer.getFactory("audiobook");

        IBook book0 = textBookFactory.createBook("Fiction");
        book0.setTitle("The Road");
        book0.setIsbn("978-0307387899");
        bookList.addBook(book0);

        IBook book1 = eBookFactory.createBook("Academic");
        book1.setTitle("Design Patterns: Elements of Reusable Object-Oriented Software");
        book1.setIsbn("978-0201633610");
        bookList.addBook(book1);

        IBook book2 = audioBookFactory.createBook("Biography");
        book2.setTitle("Einstein: His Life and Universe");
        book2.setIsbn("978-0743264747");
        bookList.addBook(book2);

        // Creating a book from using the factory
        IBook book3 = textBookFactory.createBook("Fiction");
        book3.setTitle("Dune");
        book3.setIsbn("978-0441172719");
        bookList.addBook(book3);

        // USER TEST:
        UserFactory userFactory = new UserFactory();

        IUser user1 = userFactory.createUser("Tommy", "test", false);
        user1.setUsername("Tommy");
        user1.setPassword("test");
        userList.addUser(user1);

        IUser user2 = userFactory.createUser("Caja", "test", true);
        user2.setUsername("Caja");
        user2.setPassword("test");
        userList.addUser(user2);

        // LOAN BUILDER PATTERN
        // Creating a loanbuilder
        LoanBuilder loanBuilder = new LoanBuilder();

        // Crating a loanbuilder director passing the loanbuilder.
        LoanBuilderDirector loanBuilderDirector = new LoanBuilderDirector(loanBuilder);

        // Building a loan using the loanbuilder directors construct method.
        Loan loan1 = loanBuilderDirector.construct().setBook(book0).setUser(user1).setPeriod();
        loanList.addLoan(loan1);

        // Building a loan using the loanbuilder directors construct method.
        Loan loan2 = loanBuilderDirector.construct().setBook(book1).setUser(user2).setPeriod();
        loanList.addLoan(loan2);

        // Building a loan using the loanbuilder directors construct method.
        Loan loan3 = loanBuilderDirector.construct().setBook(book2).setUser(user2);
        loanList.addLoan(loan3);

        // Print Methods for outputting users, books and loans.
        PrintLibraryUsers(userList);
        PrintLibraryBooks(bookList);
        PrintLibraryLoans(loanList);
    }

    private static void PrintLibraryLoans(LoanRepository loanList) {
        System.out.println("=====================================================================================");
        System.out.println("LIBRARY CURRENT LOANS");
        for (Iterator iterator = loanList.getIterator(); iterator.hasNext();) {
            Loan loan = (Loan)iterator.next();
            System.out.println("=====================================================================================");
            System.out.println("Loaner: " + loan.getUser().getUsername());
            System.out.println("Book: " + loan.getBook().getTitle());
            System.out.println("Period: " + loan.getPeriod());
            System.out.println("Format: " + loan.getBook().getBookFormat());
            System.out.println("Category: " + loan.getBook().getCategory());
        }
        System.out.println("=====================================================================================");
        System.out.println();
        System.out.println();
    }

    private static void PrintLibraryBooks(BookRepository bookList) {
        System.out.println("=====================================================================================");
        System.out.println("LIBRARY BOOKS");
        for (Iterator iterator = bookList.getIterator(); iterator.hasNext();) {
            IBook book = (IBook)iterator.next();
            System.out.println("=====================================================================================");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Isbn: " + book.getIsbn());
            System.out.println("Period: " + book.getLoanPeriod());
            System.out.println("Format: " + book.getBookFormat());
            System.out.println("Category: " + book.getCategory());
        }
        System.out.println("=====================================================================================");
        System.out.println();
        System.out.println();
    }

    private static void PrintLibraryUsers(UserRepository userList) {
        System.out.println("=====================================================================================");
        System.out.println("LIBRARY USERS");
        for (Iterator iterator = userList.getIterator(); iterator.hasNext();) {
            IUser user = (IUser)iterator.next();
            System.out.println("=====================================================================================");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
        }
        System.out.println("=====================================================================================");
        System.out.println();
        System.out.println();
    }
}
