package aaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Reverse {

	void execute() {
		
		int [] a = {1,2,3,4,5};
		
		//Arrays.sort(a, Collections.reverseOrder());
//		Arrays.sort(a, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return Integer.compare(o1, o2);
//			}
//			
//		});
//		List<Integer> aaa = new ArrayList<>();
//		for (int i : a) {
//			aaa.add(i);
//		}
//		
//		Collections.sort(aaa, Collections.reverseOrder());
//		
//		for (int i : aaa) {
//			System.out.println(i);
//		}

//		List<Student> as = new ArrayList<>();
//		
//		as.add(new Student(1, 100));
//		as.add(new Student(2, 90));
//		as.add(new Student(3, 80));
//		as.add(new Student(4, 70));
//		
//		Collections.sort(as, Collections.reverseOrder());
//		
//		for (Student s : as) {
//			System.out.println("Id : " + s.getId() + " Point : " + s.getPoint());
//		}
		
		
        Map<String, String> ht = new LinkedHashMap<>();
		
		ht.put("1","22");
		ht.put("3","33");
		ht.put("4","11");
		ht.put("2","11");
		
		for (Map.Entry<String, String> entry : ht.entrySet()) {
			System.out.println("k:" + entry.getKey()+ " v:" + entry.getValue());
		}
		
		System.out.println("============");
		
		//key sort
		TreeMap<String, String> tm = new TreeMap<>(ht);
		
		for (Map.Entry<String, String> entry : tm.entrySet()) {
			System.out.println("k:" + entry.getKey()+ " v:" + entry.getValue());
		}
		
		
		System.out.println("===============");
		
		for (Map.Entry<String, String> entry : tm.descendingMap().entrySet()) {
			System.out.println("k:" + entry.getKey()+ " v:" + entry.getValue());
		}
		
		//value sort
		List<Entry<String,String>> li = new ArrayList<Entry<String,String>>(tm.entrySet());
		Collections.sort(li, new Comparator<Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});;
		
		Map<String,String> newMap = new LinkedHashMap<>();
		for(Entry<String,String> en : li) {
			newMap.put(en.getKey(), en.getValue());
		}
	
		System.out.println("===============");
		
		for (Map.Entry<String, String> entry : newMap.entrySet()) {
			System.out.println("k:" + entry.getKey()+ " v:" + entry.getValue());
		}
		
	}
	
	public static void main(String[] args) {

		Reverse r = new Reverse();
		
		r.execute();
		
	}

}

class Student implements Comparable<Student>{
	int id;
	int point;
	public Student(int id, int point) {
		super();
		this.id = id;
		this.point = point;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(o.id, this.id);
	}
	
	
	
}
