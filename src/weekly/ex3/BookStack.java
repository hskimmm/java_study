package weekly.ex3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books;

    public BookStack(){
        this.books = new Stack<>();
    }

    //도서 추가
    public void pushBook(Book<T> book){
        books.push(book);
    }

    //도서 삭제
    public Book<T> popBook(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return books.pop();
    }

    //도서 반품
    public Book<T> peekBook(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return books.peek();
    }

    //스택 확인
    public boolean isEmpty(){
        return books.isEmpty();
    }
}
