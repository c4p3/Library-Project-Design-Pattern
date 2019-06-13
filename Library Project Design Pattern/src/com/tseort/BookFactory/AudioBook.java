package com.tseort.BookFactory;

public class AudioBook implements IBook {

    String title;
    String isbn;
    int loanPeriod;
    int length;
    String category;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void setLoanPeriod(String category) {
        this.category = category;
        if (category.equalsIgnoreCase("biography")) {
            this.loanPeriod = 7;
        } else if (category.equalsIgnoreCase("fiction")) {
            this.loanPeriod = 14;
        } else if (category.equalsIgnoreCase("academic")) {
            this.loanPeriod = 21;
        } else {
            System.out.println("Category not recognized.");
            this.loanPeriod = 0;
        }
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

    public String getBookFormat() {
        return "Audiobook";
    }

    public String getCategory() {
        return category;
    }
}
