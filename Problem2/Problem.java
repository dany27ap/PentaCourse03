package com.dlegacy.course3.Problem2;

public class Problem {
    private Student student;
    private Problem problem;

    public Problem(Student student, Problem problem) {
        this.student = student;
        this.problem = problem;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

}
