package ru.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.project.model.Book;
import ru.project.model.Person;
import ru.project.service.BookService;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String index(Model model) {
        System.out.println("book controller");
        model.addAttribute("books", bookService.getAllBook());
        return "book/book";
    }

    @GetMapping("/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "book/new_book";
    }

    @PostMapping
    public String create(@ModelAttribute("book") @Valid Book book,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "book/new_book";
        }
        bookService.addBook(book);
        return "redirect:/book";
    }
//
//    @GetMapping("/{id}")
//    public String show(Model model, @PathVariable("id") int id, @ModelAttribute("person") Person person) {
//        model.addAttribute("book", bookDao.show(id));
//
//        Optional<Person> bookOwner = bookDao.getPersonWithBook(id);
//        if (bookOwner.isPresent()) {
//            model.addAttribute("owner", bookOwner.get());
//        } else {
//            model.addAttribute("people", personService.getAllPerson());
//        }
//        return "book/show";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) {
//        model.addAttribute("book", bookDao.show(id));
//        return "book/edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("book") @Valid Book book,
//                         BindingResult bindingResult,
//                         @PathVariable("id") int id) {
//        if (bindingResult.hasErrors()) {
//            return "book/edit";
//        }
//        bookDao.update(id, book);
//        return "redirect:/book";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") int id) {
//        bookDao.delete(id);
//        return "redirect:/book";
//    }
//
//    @PatchMapping("/{id}/release")
//    public String release(@PathVariable("id") int id) {
//        bookDao.release(id);
//        return "redirect:/book/" + id;
//    }
//
//    @PatchMapping("/{id}/assign")
//    public String assign(@PathVariable("id") int id, @ModelAttribute ("person") Person person) {
//        bookDao.assign(id, person);
//        return "redirect:/book/" + id;
//    }
}
