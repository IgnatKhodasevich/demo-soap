package com.example.soap;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CourseDetailsService {

    private static List<Course> courses = new ArrayList<>();

    static {
        Course course1 = new Course(1, "Spring", "in action");
        courses.add(course1);
        Course course2 = new Course(2, "Hibernate", "JPA impl");
        courses.add(course2);
        Course course3 = new Course(3, "MongoDB", "NOSQL Db");
        courses.add(course3);
        Course course4 = new Course(4, "Heroku", "deploy");
        courses.add(course4);
        Course course5 = new Course(5, "AWS", "web services");
        courses.add(course5);

        }

    public Course findById(int id) {

        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }

    public List<Course> findAll() {
        return courses;
    }

    public int deleteById(int id) {
        Iterator<Course> iterator = courses.iterator();

        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == id) {
                courses.remove(course);
                return 1;
            }
        }
        return 0;
    }

    }


