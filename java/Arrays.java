package com.array.java;

import com.constructor.java.StudentInfo;

public class Arrays {
    public static void main(String[] args) {

        // declaration of array

//        byte[] ages;
//        ages = new byte[5];

        // array declaration
        int[] students = new int[5];
        System.out.println(students[0]);

        // array declaration

        students[0] = 1234;
        students[1] = 233222;
        students[2] = 2323233;
        students[3] = 2232732;
        students[4] = 23227366;

        // for each loop for accessing the data but nod used for manipulating the data

        for (int student : students) {

            //students[student] += 5;
            //here the data will not manipulating using for each loop

            System.out.println("the values are:" + student);

        }

        // shortcut for creating array

        byte[] customers = {1,3,32,45,33,23};

        // used for data manipulating

        for (byte index = 0 ; index < customers.length; index ++){

            customers[index] +=10;

            // here the data will manipulating using for loop

            System.out.println(customers[index]);
        }





    }
}