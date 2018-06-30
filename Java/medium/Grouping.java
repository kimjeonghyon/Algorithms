package problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student {
	String id;
	String name;
	int score;
	String region;
	
	Student(String id, String name, int score, String region) {
	
		this.id = id;
		this.name = name;
		this.score = score;
		this.region = region;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	@Override
	public String toString() {
		
		return this.id + "\t" + this.name + "\t" + this.region + "\n";
	}
	
	
}

class Stat {
	int count = 0;
	int sum = 0;
	int min = 0;
	int max = 0;
	Stat (int count, int sum, int min, int max) {
		this.count = count;
		this.sum = sum;
		this.min = min;
		this.max = max;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
   
}

public class Grouping {

	void getGrouping(List<Student> studlist) {

        Map<String, Stat> sMap = new HashMap<String, Stat>();
        
        for(Student std : studlist) {
        	if (sMap.get(std.region) == null)
        		sMap.put(std.region, new Stat(1,std.score,std.score,std.score));
        	else {
        		int count = sMap.get(std.region).count + 1;
        		int sum = sMap.get(std.region).getSum() + std.score;
        		int min = sMap.get(std.region).getMin() > std.score? std.score:sMap.get(std.region).getMin();
        		int max = sMap.get(std.region).getMax() < std.score? std.score:sMap.get(std.region).getMax();
        		
        		sMap.get(std.region).setCount(count);
        		sMap.get(std.region).setSum(sum);
        		sMap.get(std.region).setMin(min);
        		sMap.get(std.region).setMax(max);
        		
        	}
        		
        }
        
        for(String region : sMap.keySet()) {
        	System.out.println(region + "\t" + sMap.get(region).count + "\t" + sMap.get(region).sum + "\t" + sMap.get(region).max +"\t"+ sMap.get(region).min);
        }
	}
	
	public static void main(String[] args) {
		List<Student> studlist = new ArrayList<Student>();
        studlist.add(new Student("1726", "John", 30, "New York"));
        studlist.add(new Student("4321", "Max", 20, "California"));
        studlist.add(new Student("2234", "Andrew", 100, "Los Angeles"));
        studlist.add(new Student("5223", "Hue",110, "Seoul"));
        studlist.add(new Student("7765", "Sam", 80, "California"));
        studlist.add(new Student("3442", "Mark",72, "New York"));

        // Group by region 의 결과,count(1), sum(score), max(score), min(score)에 해당하는 값을 구하라.
        Grouping gr = new Grouping();
        gr.getGrouping(studlist);
        
        
	}
}
