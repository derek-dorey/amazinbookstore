package sysc4806.graduatingteam.amazinbookstore.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="USER")
public class User {

    @Id
    @Column(name="UID")
    private Integer uid;

    @Column(name="ADMIN")
    private boolean admin;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD")
    private String password;

    private User() {}

    public User(Integer uid, boolean admin, String username, String password) {
        this.uid = uid;
        this.admin = admin;
        this.username = username;
        this.password = password;
    }
}
