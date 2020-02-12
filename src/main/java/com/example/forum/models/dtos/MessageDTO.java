package com.example.forum.models.dtos;


import java.util.Date;

public class MessageDTO {

    private Long id;
    private Date date;
    private String contents;

    public MessageDTO(){};

    public MessageDTO(Long id, Date date, String contents) {
        this.id = id;
        this.date = date;
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
