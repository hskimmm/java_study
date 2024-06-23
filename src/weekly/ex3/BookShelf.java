package weekly.ex3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T>{

    private List<Book<T>> books; // Book 객체저장

    public BookShelf() {
        books = new ArrayList<Book<T>>();
    }


    @Override
    public void addBook(Book<T> book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book<T> book) {
        books.remove(book);
    }

    //도서 제목검색
    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> searchTitleList = new ArrayList<>();
        String searchTitle = title.toLowerCase();

        for (Book<T> book : books) {
            if(book.getTitle().toLowerCase().contains(searchTitle)){
                searchTitleList.add(book);
            }
        }

        return searchTitleList;
    }

    //도서 저자검색
    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> searchAuthorList = new ArrayList<>();
        String searchAuthor = author.toLowerCase();

        for (Book<T> book : books) {
            if(book.getAuthor().contains(searchAuthor)){
                searchAuthorList.add(book);
            }
        }

        return searchAuthorList;
    }
}
