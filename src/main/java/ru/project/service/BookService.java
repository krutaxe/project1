package ru.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.project.model.Book;
import ru.project.repositories.BookRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBook() {
        System.out.println("book service");
        return bookRepository.findAll();
    }

    @Transactional
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
