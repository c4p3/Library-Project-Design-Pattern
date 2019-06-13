package com.tseort.BookFactory;

public class AudioBook implements IBook {

    String title;
    String isbn;
    int loanPeriod;
    int length;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void setLoanPeriod() {
        this.loanPeriod = 7;
    }

    public void setAudioLength(int audioLengthHours) {
        this.length = audioLengthHours;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public int getLoanPeriod() {
        return loanPeriod;
    }

    public int getAudioLength() { return length; }
}
