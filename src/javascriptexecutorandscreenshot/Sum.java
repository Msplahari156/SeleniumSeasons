package javascriptexecutorandscreenshot;

public class Sum {
	
	public void add(int x,int y)
	{
		
		System.out.println("Sum is   "+ (x+y));
		
	}
	
	 public void add(int x,int y,int z) {
	    	
	    	System.out.println("Sum is   "+ (x+y+z));
	    	
	    }
	 //varargs method
	 //... indicates a is an array of ints
	 public void add(int...a) {
		 int result=0;
		 
		 for(int i=0;i<a.length;i++) {
			 result=result+a[i];
			 
		 }
		 
		 System.out.println("Result is "+result);
	 }
		

}
