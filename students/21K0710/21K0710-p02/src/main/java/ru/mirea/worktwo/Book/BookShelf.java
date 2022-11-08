package Book;

import java.util.Arrays;

public class BookShelf {
    Book bookShelf[];
    int N;

    public BookShelf(int n){
        N = n;
        bookShelf = new Book[N];
    }
    int k = 0;
    public void addBook(Book a){
        if (k < N){
            bookShelf[k] = a;
            k++;
        }
        else{
            System.out.println("Достигнуто максимальное количество книг на полке");
        }
    }
    public Book newestBook(){
        Book newestBook = new Book("none", "none", 0);
        for (int i = 0; i < k; i++){
            if (bookShelf[i].date > newestBook.date){
                newestBook = bookShelf[i];
            }
        }
        return newestBook;
    }
    public Book oldestBook(){
        Book oldestBook = new Book("none", "none", 9999);
        for (int i = 0; i < k; i++){
            if (bookShelf[i].date < oldestBook.date){
                oldestBook = bookShelf[i];
            }
        }
        return oldestBook;
    }
    public void sortBooks(){
        for (int g = 0; g < k-1; g++){
            for (int i = 0; i < k-1; i++){
                if (bookShelf[i].date > bookShelf[i+1].date){
                    Book temp = bookShelf[i+1];
                    bookShelf[i+1] = bookShelf[i];
                    bookShelf[i] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "bookShelf=" + Arrays.toString(bookShelf) +
                '}';
    }
}
