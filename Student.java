package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {

    public void studentName() {
        System.out.println("student Name is : RamKumar");
    }

    public void studentDept() {
        System.out.println("student Department is : BCA");
    }

    private void studentId() {
        System.out.println("Student ID is 14uca105");
    }

    public static void main(String[] args) {
        //method og grandparent class without extending it via department class and as an example of multilevel inheritance
        Student studentInfo = new Student();
        studentInfo.studentId();
        studentInfo.studentName();
        studentInfo.studentDept();
        studentInfo.collegeName();
        studentInfo.collegeCode();
        studentInfo.collegeRank();
        studentInfo.deptName("BCA,MCA,BBA,BCOM,MBA,mcom");
    }
}
