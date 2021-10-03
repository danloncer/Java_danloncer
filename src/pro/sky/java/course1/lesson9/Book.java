package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Book {

    private final String title;
    private final Author author;
    private int yearPublication;


    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int year) {
        yearPublication = year;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ": published in " + yearPublication;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c3 = (Book) other;
        return title.equals(c3.title) && author.equals(c3.author) && yearPublication == c3.yearPublication;
    }

    public int hashCode() {
        return Objects.hash(title, author, yearPublication);
    }

}
