package wj.template;

import java.util.List;

public class User {
    private String name;
    private String email;

    private List<Book> books;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
