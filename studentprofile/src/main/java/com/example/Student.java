package com.example;



/**
 * Student Model — holds all student data and performs calculations.
 */
public class Student {

    // ── Fields ──────────────────────────────────────────────────
    private int id;
    private String name;
    private String course;
    private String college;

    // Marks for 5 subjects
    private int[] marks = new int[5];
    private String[] subjectNames = new String[5];

    // Calculated fields
    private int totalMarks;
    private double average;
    private String grade;

    // ── Constructor ─────────────────────────────────────────────
    public Student() {}

    // ── Calculation Methods ─────────────────────────────────────

    /**
     * Calculates total marks by summing all 5 subject marks.
     */
    public void calculateTotal() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
    }

    /**
     * Calculates average = totalMarks / number of subjects (5).
     */
    public void calculateAverage() {
        average = (double) totalMarks / marks.length;
    }

    /**
     * Assigns grade based on average:
     *   A → average >= 90
     *   B → average >= 75
     *   C → average >= 60
     *   D → below 60
     */
    public void calculateGrade() {
        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }
    }

    // ── Getters & Setters ────────────────────────────────────────
    public int getId()                     { return id; }
    public void setId(int id)              { this.id = id; }

    public String getName()                { return name; }
    public void setName(String name)       { this.name = name; }

    public String getCourse()              { return course; }
    public void setCourse(String course)   { this.course = course; }

    public String getCollege()             { return college; }
    public void setCollege(String college) { this.college = college; }

    public int[] getMarks()                { return marks; }
    public void setMarks(int[] marks)      { this.marks = marks; }

    public String[] getSubjectNames()              { return subjectNames; }
    public void setSubjectNames(String[] names)    { this.subjectNames = names; }

    public int getTotalMarks()             { return totalMarks; }
    public double getAverage()             { return average; }
    public String getGrade()               { return grade; }
}