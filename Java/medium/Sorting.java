package problem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
		String id;
		String name;
		String region;
		
		Student(String id, String name,  String region) {
			this.id = id;
			this.name = name;
			this.region = region;
		}

		@Override
		public int compareTo(Student o) {	
			return o.region.compareTo(this.region);
		}

		@Override
		public String toString() {
			return this.id + "\t" + this.name + "\t" + this.region + "\n";
		}
}


public class Sorting {

		
	public static void main(String[] args) {
		List<Student> studlist = new ArrayList<Student>();
        studlist.add(new Student("1726", "John", "New York"));
        studlist.add(new Student("4321", "Max", "California"));
        studlist.add(new Student("2234", "Andrew",  "Los Angeles"));
        studlist.add(new Student("5223", "Michael", "New York"));
        studlist.add(new Student("7765", "Sam",  "California"));
        studlist.add(new Student("3442", "Mark", "New York"));

        //Code to group students by location
        /*  Output should be Like below
            ID : 1726   Name : John Location : New York
            ID : 5223   Name : Michael  Location : New York
            ID : 4321   Name : Max  Location : California
            ID : 7765   Name : Sam  Location : California    
         */
        
        Collections.sort(studlist);	        
        System.out.println(studlist);	   	        
	}
}
	
