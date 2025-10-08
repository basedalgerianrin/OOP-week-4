package ie.atu.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        List<Student> studentsList = new ArrayList<Student>();
        Student s1 = new Student();

        System.out.println("Enter number of students: ");
        int total = sc.nextInt();
        sc.nextInt();

        while (total > i) {

            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Email: ");
            String email = sc.nextLine();
            System.out.println("Enter Course: ");
            String course = sc.nextLine();
            System.out.println("Enter Student ID: ");
            String sid = sc.nextLine();

            Student s2 = new Student();
            s1.setName(name);
            s1.setEmail(email);
            s1.setCourse(course);
            s1.setID(sid);
            studentsList.add(s1);

            i++;
        }

        for(Student student:studentsList){
            System.out.println("Name: " + s1.getName() + "\nEmail: " + s1.getEmail() + "\nID: " + s1.getID() + "\nCourse: " + s1.getCourse());
        }


    }
}
