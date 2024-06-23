package weekly.ex3;

public class Book<T>{
    private String title; //제목
    private String author; //저자
    private T identifier; //고유 식별자

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public T getIdentifier(){
        return identifier;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", identifier=" + identifier +
                '}';
    }
}
