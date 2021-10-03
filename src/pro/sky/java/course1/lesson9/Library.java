package pro.sky.java.course1.lesson9;

public class Library {
    private Book[] listOfBooks;


    public Library(int range) {
        listOfBooks = new Book[range];
    }

    public String toString() {
        StringBuilder newListOfBooks = new StringBuilder();
        for (int i = 0; i < listOfBooks.length; i++) {
            newListOfBooks.append(listOfBooks[i] + " \n");
        }
        return "Library: " + "\n" + newListOfBooks;
    }

    public void addBook(Book book) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i] == null) {
                listOfBooks[i] = book;
                System.out.println("Книга добавлена в ячейку " + i);
                return;
            }
        }
        System.out.println("Книга не добавлена, так как нет свободных ячеек");
    }


    public void printBooks () {
        for (Book book :listOfBooks) {
            if (book != null) {
                System.out.println(book);
            }
        }
        System.out.println();
    }


    public void getInformationAboutBook(String name) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i].getTitle() != null) {
                if (listOfBooks[i].getTitle().equals(name)) {
                    System.out.println(listOfBooks[i].getTitle() + " by " + listOfBooks[i].getAuthor().getMiddleName() + listOfBooks[i].getAuthor().getFirstName() + " was published in " + listOfBooks[i].getYearPublication());
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("Данной книги нет");
    }

    public void editYearOfBook(String name, int newYear) {
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i].getTitle() != null) {
                if (listOfBooks[i].getTitle().equals(name)) {
                    System.out.print("Год изменен с " + listOfBooks[i].getYearPublication());
                    listOfBooks[i].setYearPublication(newYear);
                    System.out.print(" на " + listOfBooks[i].getYearPublication());
                    return;
                }
            }
        }
    }

}