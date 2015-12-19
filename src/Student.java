import java.util.Comparator;

public class Student {
	
	private String name; 
	private int score; 
	
	public Student() { 
		this.name = null; 
		this.score = 0;
	}
	
	public Student(final String name, final int score) { 
		this.name = name; 
		this.score = score;
	}
	
	public void setName(String name) { 
		this.name = name; 
	}
	
	public void setScore(int score) { 
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %d", name, score); 	
	}
	
	public static final Comparator<Student> SCORE_ASCENDING_ORDER = 
			new Comparator<Student>() { 
		
		public int compare(Student o1, Student o2) {
			return o1.score - o2.score;
		}
	};
}
