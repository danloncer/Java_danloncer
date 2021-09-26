package pro.sky.java.course1.lesson8;

public class Homework8 {
    public static void main(String[] args) {
//Задача 1

        Author firstPublisher = new Author("Лев", "Толстой");
        Author secondPublisher = new Author("Александр", "Пушкин");

        Book warAndPeace = new Book("War and Peace", firstPublisher, 1867);
        Book eugeneOnegin = new Book("Eugene Onegin", secondPublisher, 1833);

        warAndPeace.setYearPublication(1870);

//Задача 2

        Book[] listOfBooks = new Book[5];
        listOfBooks[0] = warAndPeace;
        listOfBooks[1] = eugeneOnegin;

        Author thirdPublisher = new Author("Федор", "Достоевский"); //Для проверки метода ниже
        Book crimeAndPunishment = new Book("Crime and Punishment", thirdPublisher,1866); //Для проверки метода ниже

        appendBook(listOfBooks, crimeAndPunishment); //Проверка метода

        printBooks(listOfBooks);

        Library newListOfBooks = new Library(10);
        newListOfBooks.appendBook(crimeAndPunishment);
        newListOfBooks.printBooks();
    }


    public static void appendBook(Book[] listOfBooks, Book book) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i] == null) {
                listOfBooks[i] = book;
                System.out.println();
                System.out.println("Книга добавлена в ячейку " + i);
                return;
            } else {
                System.out.println("Ячейка " + i + " заполнена");
            }
        }
    }


    public static void printBooks (Book[] listOfBooks) {
        for (Book book : listOfBooks) {
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
