package weekly.ex3;

import java.util.List;

public class WeeklyQuiz {
    public static void main(String[] args) {
        BookShelf<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();


        //도서정보입력(제목, 저자, 식별자)
        bookShelf.addBook(new Book<>("Java", "저자1", "id-1134"));
        bookShelf.addBook(new Book<>("Spring", "저자2", "id-5461"));
        bookStack.pushBook(new Book<>("JavaScript", "저자3", 2));
        bookStack.pushBook(new Book<>("Python", "저자4", 3));

        //도서 제목과 저자로 검색 및 검색 결과 출력
        List<Book<String>> searchTitle = bookShelf.searchByTitle("java");
        printSearchBookInfo(searchTitle);
        List<Book<String>> searchAuthor = bookShelf.searchByAuthor("저자2");
        printSearchBookInfo(searchAuthor);


        //도서 popBook 및 도서 정보 출력
        Book<Integer> popBookList = bookStack.popBook();
        printSearchBookInfo(popBookList);

        //도서 peekBook 및 도서 정보 출력
        Book<Integer> peekBookList = bookStack.peekBook();
        printSearchBookInfo(peekBookList);

        //도서 isEmpty 및 결과 출력
        System.out.println("isEmpty = " + bookStack.isEmpty());
    }

    //도서 정보 출력
    private static <T> void printSearchBookInfo(List<Book<T>> book) {
        for (Book<T> books : book) {
            printSearchBookInfo(books);
        }
    }

    //도서 정보 출력
    private static <T> void printSearchBookInfo(Book<T> book) {
        System.out.println("======= Book Info =======");
        System.out.println("도서 제목 = " + book.getTitle());
        System.out.println("도서 저자 = " + book.getAuthor());
        System.out.println("도서 식별자 = " + book.getIdentifier());
        System.out.println("=========================");
        System.out.println();
    }
}
