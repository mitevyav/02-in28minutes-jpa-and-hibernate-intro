package com.in28minutes.in28minutesjpaandhibernateintro.course.springdatajpa;

import com.in28minutes.in28minutesjpaandhibernateintro.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringCourseDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> findByAuthor(String author);

    List<Course> findByName(String author);
}
