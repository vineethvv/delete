package myjava;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[2] =30;
		i[3]= 40;
		
		System.out.println(i.length);
		
		for(int k =0; k<i.length; k++) {
			
			System.out.println(i[k]);
		}
		
		System.out.println("------------");
		
		for(int e :i) {
			
			System.out.println(e);
							
			}
		
		
		System.out.println("----------");
		
		Object emp[] = new Object[3];
		
		emp[0] = 1;
		emp[1]= 'M';
		emp[2]= "vineeth";
		
		for(Object e : emp) {
			
			System.out.println(e);
			
			if(e.equals('M')) {
				
				System.out.println("hello----");
				break;
			}
		}
				
	}

}
