package sysc4806.graduatingteam.amazinbookstore.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="TRANSACTION")
public class Transaction {

    @Id
    @Column(name="TRANSACTION_ID")
    private Integer transactionId;

    @Column(name="QUANTITY")
    private Integer quantity;

    @Column(name="UID")
    private Integer userId;

    @Column(name="ISBN")
    private String ISBN;

    private Transaction() {}

    public Transaction(Integer transactionId, Integer quantity, Integer uid, String isbn) {
        this.transactionId = transactionId;
        this.quantity = quantity;
        this.userId = uid;
        this.ISBN = isbn;
    }
}
