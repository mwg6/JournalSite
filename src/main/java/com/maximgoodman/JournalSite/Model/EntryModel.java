package com.maximgoodman.JournalSite.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;


@Entity
@Table(name = "entries")
public class EntryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("content")
    private String content;
    @JsonProperty("owner_id")
    private int owner_id;

    @JsonProperty("date")
    private Date date;

    public EntryModel(){

    }

    public EntryModel(int id, String content, int owner_id, Date date){
        this.id=id;
        this.content=content;
        this.owner_id=owner_id;
        this.date=date;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.content);
        hash = 79 * hash + owner_id;
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
        final EntryModel other = (EntryModel) obj;
        if (this.owner_id != other.owner_id) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", owner_id='").append(owner_id).append('\'');
        sb.append(", date=").append(date.toString()).append('\'');
        sb.append(", content=").append(content);

        sb.append('}');
        return sb.toString();
    }


}
