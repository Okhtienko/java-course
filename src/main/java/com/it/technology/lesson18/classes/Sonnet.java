package com.it.technology.lesson18.classes;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "sonnet")
@XmlType(propOrder = { "author", "title", "line" })
public class Sonnet {
    private Author author;
    private String type;
    private String title;
    private List<String> line;

    public Sonnet(Author author, String title, List<String> lines) {
        this.author = author;
        this.type = author.getLastName();
        this.title = title;
        this.line = lines;
    }

    public Sonnet() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElementWrapper(name = "lines")
    @XmlElement
    public List<String> getLine() {
        return line;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", text='" + line + '\'' +
                '}';
    }
}
