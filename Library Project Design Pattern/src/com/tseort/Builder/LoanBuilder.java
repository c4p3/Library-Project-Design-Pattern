package com.tseort.Builder;

import com.tseort.BookFactory.IBook;
import com.tseort.UserFactory.IUser;

public class LoanBuilder implements ILoanBuilder {

    private Loan tempLoan;

    public LoanBuilder() {
        tempLoan = new Loan();
    }

    @Override
    public Loan build() {
        Loan loan = new Loan();
        loan.setBook(tempLoan.getBook());
        return loan;
    }

    @Override
    public LoanBuilder setUser(final IUser user) {
        tempLoan.setUser(user);
        return this;
    }

    @Override
    public LoanBuilder setBook(final IBook book) {
        tempLoan.setBook(book);
        return this;
    }
}
