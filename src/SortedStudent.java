import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedStudent {
	
	public static void main(String[] args) {
        
		List<Student> students = getStudentsFromUser(); 
		Collections.sort(students, Student.SCORE_ASCENDING_ORDER); 
		System.out.println(students);	
    }
	
	private static List<Student> getStudentsFromUser() { 
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numofstudents = input.nextInt();
        
        List<Student> students = new ArrayList<Student>(numofstudents);
        
        for(int i = 0; i < numofstudents; i++) {
        	Student student = new Student(); 
        	
            System.out.print("Enter the student's name: ");
            student.setName(input.next());
            
            System.out.print("Enter the student's score: ");
            student.setScore(input.nextInt());
            
            students.add(student);
        }
        
        input.close();
        
		return students;
	}
   
}
