package be.shoktan.alliance.tranquille.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "RegisteredUser")
public class User {
    private @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Column(unique = true)
    private String name;

    private String mainAccount;

    @OneToMany(mappedBy = "author")
    private List<GuildLogComment> comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainAccount() {
        return mainAccount;
    }

    public void setMainAccount(String mainAccount) {
        this.mainAccount = mainAccount;
    }

    public List<GuildLogComment> getComments() {
        return comments;
    }

    public void setComments(List<GuildLogComment> comments) {
        this.comments = comments;
    }
}
