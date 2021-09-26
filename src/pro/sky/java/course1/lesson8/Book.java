package pro.sky.java.course1.lesson8;

public class Book {

    private String title;
    private Author author;
    private int yearPublication;


    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int year) {
        this.yearPublication = year;
    }

}
