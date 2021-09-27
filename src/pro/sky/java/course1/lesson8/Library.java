package pro.sky.java.course1.lesson8;

public class Library {
    private Book[] listOfBooks;


    public Library(int range) {
        this.listOfBooks = new Book[range];
    }

    public void appendBook(Book book) {
        for (int i = 0; i < this.listOfBooks.length; i++) {
            if (this.listOfBooks[i] == null) {
                this.listOfBooks[i] = book;
                System.out.println();
                System.out.println("Книга добавлена в ячейку " + i);
                return;
            }
        }
    }


    public void printBooks () {
        for (Book book :listOfBooks) {
            if (book != null) {
                System.out.println();
                System.out.print(book.getAuthor().getFirstName());
                System.out.print(" ");
                System.out.print(book.getAuthor().getMiddleName());
                System.out.print(": ");
                System.out.print(book.getTitle());
                System.out.print(": ");
                System.out.print(book.getYearPublication());
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Ячейка пуста");
            }
        }
        System.out.println();
    }


    public void getInformationAboutBook(String name) {
        for (int i = 0; i < this.listOfBooks.length; i++) {
            if (this.listOfBooks[i].getTitle().equals(name)) {
                System.out.println(this.listOfBooks[i].getTitle() + " by " + this.listOfBooks[i].getAuthor().getMiddleName() + this.listOfBooks[i].getAuthor().getFirstName() + " was published in " + this.listOfBooks[i].getYearPublication());
                System.out.println();
                return;
            }
        }
        System.out.println("Данной книги нет");
        System.out.println();
    }

    public void editYearOfBook(String name, int newYear) {
        for (int i = 0; i < this.listOfBooks.length; i++) {
            if (this.listOfBooks[i].getTitle().equals(name)) {
                System.out.print("Год изменен с " + this.listOfBooks[i].getYearPublication());
                this.listOfBooks[i].setYearPublication(newYear);
                System.out.print(" на " + this.listOfBooks[i].getYearPublication());
                return;
            }
        }
    }

}
