package com.cnki.chickenwingsweb.entities;


import javax.persistence.*;

@Entity
@Table(name = "book_lyear")
public class Books {
    public Books(int id, String title, String book, String author, int readnum, String state, String time) {
        this.id=id;
        this.readnum = readnum;
        this.title = title;
        this.book = book;
        this.author = author;
        this.state = state;
        this.time = time;
    }

    public Books(int id){
        this.id=id;
    }
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private int readnum;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String  book;
    @Column(nullable = false)
    private String  author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReadnum() {
        return readnum;
    }

    public void setReadnum(int readnum) {
        this.readnum = readnum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", readnum=" + readnum +
                ", title='" + title + '\'' +
                ", book='" + book + '\'' +
                ", author='" + author + '\'' +
                ", state='" + state + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Column(nullable = false)
    private String  state;
    @Column(nullable = false)
    private String  time;


}
