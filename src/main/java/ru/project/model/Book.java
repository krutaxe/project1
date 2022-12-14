package ru.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;


    @NotEmpty(message = "Поле не может быть пустым")
    private String name;


    @NotEmpty(message = "Поле не может быть пустым")
    private String author;

    @Min(value = 1701, message = "Не может быть меньше 1700")
    private int year;

}
