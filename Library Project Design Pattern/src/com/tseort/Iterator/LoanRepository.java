package com.tseort.Iterator;

import com.tseort.Builder.Loan;

import java.util.ArrayList;
import java.util.List;

public class LoanRepository implements Container {

    public List<Loan> loans = new ArrayList<Loan>();

    @Override
    public Iterator getIterator() {
        return new LoanIterator();
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    private class LoanIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < loans.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return loans.get(index++);
            }
            return null;
        }
    }
}
