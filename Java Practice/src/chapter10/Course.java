package chapter10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student){
		/*if the number of students is bigger than the string size it will create a new string which is 
		2 times of the number of students, then it copies everything in the original string to the new string
		after that, the original string will refer the new string as its new refer*/
		if(numberOfStudents > students.length){
			String [] temp = new String[numberOfStudents * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents(){
		return students;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	public String getCourseName(){
		return courseName;
	}
	
	public String[] dropStudents(String student,String[] students){
		//Left as an exercise in Exercise 10.9
		for(int i = 0;i < students.length ;i++ ){
			if(students[i] == "Peter Jones"){
				students[i] = null;
				numberOfStudents--;
			}
			else{
				
			}			
		}
		return students;
	}
	public void clear(){
		//remove all the students
		for(int i = 0;i < students.length;i++){
			students[i] = null;
			numberOfStudents = 0;
		}
	}
}
