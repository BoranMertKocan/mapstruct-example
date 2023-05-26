package com.bmk.mapstructexample.domain.dto.response;

import com.bmk.mapstructexample.domain.model.Library;

import java.util.List;

public class OrderResponse {
    private Long id;
    private Library library;
    private List<BookResponse> books;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Library getLibrary() {
        return library;
    }
    public void setLibrary(Library library) {
        this.library = library;
    }
    public List<BookResponse> getBooks() {
        return books;
    }
    public void setBooks(List<BookResponse> books) {
        this.books = books;
    }
}
