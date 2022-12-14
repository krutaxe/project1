//package ru.project.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import ru.project.model.Person;
//import ru.project.service.PersonService;
//import ru.project.util.PersonValidator;
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping("/person")
//public class PersonController {
//    private final PersonService personService;
//    private final PersonValidator validator;
//
//    @Autowired
//    public PersonController(PersonService personService, PersonValidator validator) {
//        this.personService = personService;
//        this.validator = validator;
//    }
//
//    @GetMapping
//    public String index(Model model) {
//        model.addAttribute("person", personService.getAllPerson());
//        return "person/person";
//    }
//
////    @GetMapping("/new")
////    public String newPerson(@ModelAttribute("person")Person person) {
////        return "person/new_person";
////    }
////
////    @PostMapping
////    public String create(@ModelAttribute("person") @Valid Person person,
////                         BindingResult bindingResult) {
////        validator.validate(person, bindingResult);
////        if (bindingResult.hasErrors()) {
////            return "person/new_person";
////        }
////        personDao.save(person);
////        return "redirect:/person";
////    }
////
////    @GetMapping("/{id}")
////    public String show(Model model, @PathVariable("id") int id) {
////        model.addAttribute("person", personDao.show(id));
////        model.addAttribute("books", personDao.getBook(id));
////        return "person/show";
////    }
////
////    @GetMapping("/{id}/edit")
////    public String edit(Model model, @PathVariable("id") int id) {
////        model.addAttribute("person", personDao.show(id));
////        return "person/edit";
////    }
////
////    @PatchMapping("/{id}")
////    public String update(@ModelAttribute("person") @Valid Person person,
////                         BindingResult bindingResult,
////                         @PathVariable("id") int id) {
////        validator.validate(person, bindingResult);
////        if (bindingResult.hasErrors()) {
////            return "person/edit";
////        }
////        personDao.update(id, person);
////        return "redirect:/person";
////    }
////
////    @DeleteMapping("/{id}")
////    public String delete(@PathVariable("id") int id) {
////        personDao.delete(id);
////        return "redirect:/person";
////    }
//}
