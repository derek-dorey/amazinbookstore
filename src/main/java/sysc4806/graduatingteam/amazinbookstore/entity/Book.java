package sysc4806.graduatingteam.amazinbookstore.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="BOOK")
public class Book {

    @Id
    @Column(name="ISBN")
    private String ISBN;

    @Column(name="TITLE")
    private String title;

    @Column(name="AUTHOR")
    private String author;

    @Column(name="PUBLISHER")
    private String publisher;

    @Column(name="STOCK")
    private Integer stock;

    @Column(name="PUBLISH_DATE")
    private String publishDate;

    @Column(name="PRICE")
    private Double price;

    @Column(name="TAGS")
    private String[] tags;

    private Book() {}

    public Book(String ISBN, String title, String author, String publisher, Integer stock, String publishDate, Double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.stock = stock;
        this.publishDate = publishDate;
        this.price = price;
    }
}
