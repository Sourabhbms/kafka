package com.learnkafka.libraryeventsproducer.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class LibraryEvent {

    private Integer libraryEventId;
    private Book book;

    public Integer getLibraryEventId() {
        return libraryEventId;
    }

    public void setLibraryEventId(Integer libraryEventId) {
        this.libraryEventId = libraryEventId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LibraryEvent(Integer libraryEventId, Book book) {
        this.libraryEventId = libraryEventId;
        this.book = book;
    }

    public LibraryEvent() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryEvent)) return false;
        LibraryEvent that = (LibraryEvent) o;
        return Objects.equals(getLibraryEventId(), that.getLibraryEventId()) &&
                Objects.equals(getBook(), that.getBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLibraryEventId(), getBook());
    }

    @Override
    public String toString() {
        return "LibraryEvent{" +
                "libraryEventId=" + libraryEventId +
                ", book=" + book +
                '}';
    }
}
