package chapter10;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCourse {

	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course1: "+course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0;i < course1.getNumberOfStudents();i++){
			System.out.print(students[i] + ",");
		}
		
		System.out.println();
		System.out.println("Number of students in course2: "+course2.getNumberOfStudents());
		
		course1.dropStudents("Peter Jones", students);
		for(int i = 0;i < course1.getNumberOfStudents();i++){			
			System.out.print(students[i] + ",");			
		}
		System.out.println("Number of students in course1 after drop: "+course1.getNumberOfStudents());
	}
	public static String[] dropStudents(String student,String[] students){
		//Left as an exercise in Exercise 10.9
		for(int i = 0;i < students.length ;i++ ){
			if(students[i] == "Peter Jones"){
				//ArrayList<String> list = new ArrayList<String>(Arrays.asList(students));
				students[i] = null;
				System.out.println("deleted");
				//students = list.toArray(new String[0] );
				//numberOfStudents--;
			}
			else{
				
			}			
		}
		return students;
	}
}
