package com.array.java;

import com.constructor.java.StudentInfo;

public class ArrayReference {
    public static void main(String[] args) {

        // using constructor name and there data l
//        StudentInfo[] students;
//        students = new StudentInfo[3];
//        System.out.println(students[0]);
//        students[0] = new StudentInfo();
//        students[1] = new StudentInfo("Nishi", "9666462662", "nri", "ece");
//        students[2] = new StudentInfo("ravi", "9398180481", "nri", "ece");
//        for (StudentInfo student : students) {
//
//
//            student.basicInformation();
//
//        }
        StudentInfo[] students = {new StudentInfo(), new StudentInfo("Nishi", "9666462662", "nri", "ece"), new StudentInfo("ravi", "9398180481", "nri", "ece")};

        System.out.println(students.length);

        for (StudentInfo student : students) {


            student.basicInformation();
        }
    }

}
