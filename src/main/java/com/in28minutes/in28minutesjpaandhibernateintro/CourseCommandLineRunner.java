package com.in28minutes.in28minutesjpaandhibernateintro;

import com.in28minutes.in28minutesjpaandhibernateintro.course.Course;
import com.in28minutes.in28minutesjpaandhibernateintro.course.springdatajpa.SpringCourseDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;


    @Autowired
    private SpringCourseDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(2001, "Learn AWS Now!", "in28minutes"));
//        repository.insert(new Course(2002, "Learn Azure Now!", "in28minutes"));
//        repository.insert(new Course(2003, "Learn DevOps Now!", "in28minutes"));
//
//        repository.deleteById(2002);
//
//        System.out.println(repository.findById(2001));


        repository.save(new Course(2001, "Learn AWS Now!", "in28minutes"));
        repository.save(new Course(2002, "Learn Azure Now!", "in28minutes"));
        repository.save(new Course(2003, "Learn DevOps Now!", "in28minutes"));

        repository.deleteById(2002L);

        System.out.println(repository.findById(2001L));
        System.out.println(repository.findById(2003L));
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor("").size());

        System.out.println(repository.findByName("Learn DevOps Now!"));
        System.out.println(repository.findByName("Learn DevOps Now!").size());
    }
}
