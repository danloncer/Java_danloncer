package pro.sky.java.course1.lesson8;

public class Library {
    private Book[] listOfBooks;
    private int range;


    public Library(int range) {
        Book[] listOfBooks = new Book[range];
    }

    public void appendBook(Book book) {
        for (int i = 0; i < this.listOfBooks.length; i++) {
            if (this.listOfBooks[i] == null) {
                this.listOfBooks[i] = book;
                System.out.println();
                System.out.println("Книга добавлена в ячейку " + i);
                return;
            } else {
                System.out.println("Ячейка " + i + " заполнена");
            }
        }
    }


    public void printBooks () {
        for (Book book : this.listOfBooks) {
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
    }


}
