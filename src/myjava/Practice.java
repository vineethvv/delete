package myjava;

public class Practice {

	public static void main(String[] args) {
		
		
     int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		
		System.out.println("---------");
		
		int length = i.length;
		
		for (int k=0; k<length; k++) {
			
			System.out.println(i[k]);
			
			
		}
		
		System.out.println("---------");
		
		
		for (int p=length-1; p>=0; p--) {
			
			System.out.println(i[p]);
		}
		
		
		
	}

}
