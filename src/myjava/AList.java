package myjava;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(100);
		a.add("pol");
		
		System.out.println(a.size());
		
		System.out.println("-----------");
		
		for(Object e : a) {
			
			System.out.println(e);
		}
		
		
		System.out.println("-----------");
		
		
		ArrayList<String> emplist = new ArrayList<String>();
		
		emplist.add("vineeth");
		emplist.add("lavu");
		emplist.add("puppy");
		emplist.add("manu");
		
		System.out.println(emplist.size());
		
		System.out.println("-----------");
		
		
		for(int i =0; i<emplist.size(); i++) {
			
			System.out.println(emplist.get(i));
		}
		
		emplist.remove(3);
		emplist.add(3, "lavanya");
		
		
		System.out.println("-------------");
		
		for(String e : emplist) {
			
			System.out.println(e);
		}

	}

}
