//package ru.project.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import ru.project.model.Book;
//import ru.project.model.Person;
//import ru.project.repositories.BookRepository;
//import ru.project.repositories.PersonRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Transactional
//public class PersonService {
//    private final PersonRepository repository;
//    private final BookRepository bookRepository;
//
//    @Autowired
//    public PersonService(PersonRepository repository, BookRepository bookRepository) {
//        this.repository = repository;
//        this.bookRepository = bookRepository;
//    }
//
//    public List<Person> getAllPerson() {
//        return repository.findAll();
//    }
//
//    public void savePerson(Person person) {
//        repository.save(person);
//    }
//
//    public Optional<Person> show(String name) {
//        return repository.findByName(name);
//    }
//
//    public Optional<Person> show(int id) {
//        return repository.findById(id);
//    }
//
//    public void update(int id, Person updatePerson) {
//        updatePerson.setPerson_id(id);
//        repository.save(updatePerson);
//    }
//
//    public void delete(int id) {
//        repository.deleteById(id);
//    }
//
//    public List<Book> getBook(int id) {
//        return bookRepository.findByPersonPerson_id(id);
//    }
//}
