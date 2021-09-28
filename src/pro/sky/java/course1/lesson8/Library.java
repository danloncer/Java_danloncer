package pro.sky.java.course1.lesson8;

public class Library {
    private Book[] listOfBooks;


    public Library(int range) {
        this.listOfBooks = new Book[range];
    }

    public void appendBook(Book book) {
        for (int i = 0; i < this.listOfBooks.length; i++) {
            if (listOfBooks[i] == null) {
                listOfBooks[i] = book;
                System.out.println();
                System.out.println("Книга добавлена в ячейку " + i);
                return;
            }
        }
        System.out.println("Книга не добавлена, так как нет свободных ячеек");
        System.out.println();
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
            }
        }
        System.out.println();
    }


    public void getInformationAboutBook(String name) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i].getTitle().equals(name)) {
                System.out.println(listOfBooks[i].getTitle() + " by " + listOfBooks[i].getAuthor().getMiddleName() + listOfBooks[i].getAuthor().getFirstName() + " was published in " + listOfBooks[i].getYearPublication());
                System.out.println();
                return;
            }
        }
        System.out.println("Данной книги нет");
        System.out.println();
    }

    public void editYearOfBook(String name, int newYear) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i].getTitle().equals(name)) {
                System.out.print("Год изменен с " + listOfBooks[i].getYearPublication());
                listOfBooks[i].setYearPublication(newYear);
                System.out.print(" на " + listOfBooks[i].getYearPublication());
                return;
            }
        }
    }

}
