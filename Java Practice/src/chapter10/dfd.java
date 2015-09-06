package chapter10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class dfd {
	String[] students = {"item1","item2","item3"};
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		dfd d = new dfd();
		d.drop("item2");
		for(int i = 0;i < d.students.length;i++){
			System.out.print(d.students[i]+",");
		}
	}
	public void drop(String student){
		for(int i = 0;i < students.length;i++ ){
			if(students[i] == student){
				ArrayList<String> list = new ArrayList<String>(Arrays.asList(students));
				list.remove(students[i]);
				students = list.toArray(new String[0]);
			}
		}
	}

}
