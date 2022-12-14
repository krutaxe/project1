//package ru.project.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//import ru.project.model.Book;
//import ru.project.model.Person;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class PersonDao {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public PersonDao(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Person> index() {
//        return jdbcTemplate.query("select * from Person order by name",
//                new BeanPropertyRowMapper<>(Person.class));
//    }
//
//    public void save(Person person) {
//        jdbcTemplate.update("insert into Person (name, age) values (?, ?)",
//                person.getName(), person.getAge());
//    }
//
//    public Optional<Person> show(String name) {
//        return jdbcTemplate.query("select * from person where name=?", new Object[]{name},
//                new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
//    }
//
//    public Person show(int id) {
//        return jdbcTemplate.query("select * from person where person_id=?", new Object[]{id},
//                new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
//    }
//
//    public void update(int id, Person person) {
//        jdbcTemplate.update("update person set name=?, age=? where person_id=?",
//                person.getName(), person.getAge(), id);
//    }
//
//    public void delete(int id) {
//        jdbcTemplate.update("delete from person where person_id=?", id);
//    }
//
//    public List<Book> getBook(int id) {
//        return jdbcTemplate.query("select b.name, b.author, b.year from person p join book b\n" +
//                "on p.person_id = b.person_id\n" +
//                "where p.person_id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Book.class));
//    }
//}
