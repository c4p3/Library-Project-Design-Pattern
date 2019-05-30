package com.tseort.Builder;

import com.tseort.BookFactory.IBook;
import com.tseort.UserFactory.IUser;

public interface ILoanBuilder {

    Loan build();

    ILoanBuilder setUser(IUser user);
    ILoanBuilder setBook(IBook book);
}
