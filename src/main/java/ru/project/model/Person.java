package ru.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private int person_id;

    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 30, message = "Диапазон 2-30")
    private String name;

    @Min(value = 1, message = "Возраст не может быть меньше 0")
    private int age;
}
