package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * StudentController — handles HTTP requests and sends student
 * data to the view via Spring's Model object.
 */
@Controller
public class StudentController {

    @GetMapping("/student")
    public String showStudent(Model model) {

        // ── Step 1: Create Student Object ────────────────────────
        Student student = new Student();

        // ── Step 2: Set Basic Details ────────────────────────────
        student.setId(1001);
        student.setName("Rahul Sharma");
        student.setCourse("B.Tech Computer Science");
        student.setCollege("Pune Institute of Technology");

        // ── Step 3: Set Subject Names ────────────────────────────
        student.setSubjectNames(new String[]{
            "Mathematics",
            "Physics",
            "Data Structures",
            "Java Programming",
            "Database Management"
        });

        // ── Step 4: Set Marks for 5 Subjects ────────────────────
        student.setMarks(new int[]{ 88, 76, 92, 85, 79 });

        // ── Step 5: Perform Calculations ─────────────────────────
        student.calculateTotal();    // Sum of all marks
        student.calculateAverage();  // total / 5
        student.calculateGrade();    // Grade from average

        // ── Step 6: Add to Model (send to JSP view) ──────────────
        model.addAttribute("student", student);

        // Returns view name → maps to /WEB-INF/views/student.jsp
        return "student";
    }
}