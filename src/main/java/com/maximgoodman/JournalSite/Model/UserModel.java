package com.maximgoodman.JournalSite.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("uname")
    private String uname;
    @JsonProperty("hashpwF")
    private String hashpw;

    public UserModel() {
    }


    public UserModel(int id, String uname, String hashpw){
        this.id = id;
        this.uname = uname;
        this.hashpw = hashpw;
    }

    public int getId() {
        return id;
    }

    public String getHashpw() {
        return hashpw;
    }

    public void setHashpw(String hashpw) {
        this.hashpw = hashpw;
    }

    public String getuname() {
        return uname;
    }

    public void setuname(String uname) {
        this.uname = uname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.uname);
        hash = 79 * hash + Objects.hashCode(this.hashpw);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserModel other = (UserModel) obj;
        if (this.hashpw != other.hashpw) {
            return false;
        }
        if (!Objects.equals(this.uname, other.uname)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(uname).append('\'');
        sb.append(", hashedPW=").append(hashpw);
        sb.append('}');
        return sb.toString();
    }
}
