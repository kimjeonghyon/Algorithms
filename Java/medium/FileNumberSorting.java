package problem2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class FileNumberSorting {

	void settingNewFile(BufferedReader br) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		String line = "";
		
		try {
			while ((line = br.readLine()) != null)
			{	
					ts.add(Integer.parseInt(line));
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("/Users/jeonghyonkim/Documents/222.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		for (Integer i : ts) {
			try {
				bw.write(String.valueOf(i));
				if(i != ts.last()) bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		// 숫자들이 있는 파일을 읽어 들어 정렬하여 다른 파일에 저장한다. 
		
	    FileNumberSorting fns = new FileNumberSorting();
	    BufferedReader br =  null;
	    		
	    try {
			br = new BufferedReader(new FileReader("/Users/jeonghyonkim/Documents/111.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    fns.settingNewFile(br);
	    
	    try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}

}
