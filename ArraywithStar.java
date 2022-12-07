package com.demo;

public class ArraywithStar {

	public static void main(String[] args) {
		ArraywithStar m=new ArraywithStar();
		m.m();
		m.a();
		m.n();
		m.i();
		m.k();
		m.a();
		m.n();
		m.d();
		m.a();
		m.n();
//		m.r();
//		m.j();
//		m.c();
//		
	}
	
	
	void m() {
		for(int i=0;i<7;i++) {
		    for(int j=0;j<7;j++) {
		    	if(j==0 || j==6 || i==1&&j==1 || i==2&&j==2 || i==3&&j==3 || i==2&&j==4 || i==1&&j==5) {
		    		System.out.print("* ");
		    		
		    	}
		    	else {
				     System.out.print("  ");
				    	  }
				    }
				    System.out.println();
				   }
		System.out.println("------------------");
	}
	
	void a() {
	for(int i=0;i<7;i++) {
	    for(int j=0;j<7;j++) {
	    	if(j==0 || j==6 || i==0 || i==3) {
	    		if(i==0 && j==0 || i==0 && j==6) {
	    			System.out.print("  ");
	    		}
	    		else {
	    		System.out.print("* ");
	    		}
	    	}
	    	else {
			     System.out.print("  ");
			    	  }
			    }
			    System.out.println();
			   }
	System.out.println("------------------");
	}
	
	void n() {
		for(int i=0;i<7;i++) {
		    for(int j=0;j<7;j++) {
		    	if(j==0 || j==6 || i==j) {
		    		System.out.print("* ");
		    	}
		    	else {
				     System.out.print("  ");
				    	  }
				    }
				    System.out.println();
				   }
		System.out.println("------------------");
	}
	void i() { 
		for(int i=0;i<7;i++) {
		    for(int j=0;j<7;j++) {
		    	  if(i==0 || i==6 || j==3) {
		    		  System.out.print("* ");
		    	  }
		    	  else {
		     System.out.print("  ");
		    	  }
		    }
		    System.out.println();
		   }
		System.out.println("------------------");	  
	}
	
	
	 void d() {
			for(int i=0;i<7;i++) {
			    for(int j=0;j<7;j++) {
			    	if(j==0 || j==6 || i==0 || i==6) {
			    		if(i==0 && j==6 || i==6 && j==6) { 
			    			System.out.print(" ");
			    			}
			    		else {
			    		System.out.print("* ");
			    		}
			    	
			    	}
			    	else {
					     System.out.print("  ");
					    	  }
					    }
					    System.out.println();
					   }
			System.out.println("------------------");
			}
	
	 void k() {
			for(int i=0;i<7;i++) {
			    for(int j=0;j<7;j++) {
			    	if(j==0 || i==3&&j==1 || i==3&&j==2 || i==2&&j==3 || i==1&&j==4 || i==0&&j==5 || i==4&&j==3 || i==5&&j==4 || i==6&&j==5 ) {
			    		System.out.print("* ");
			    	}
			    	else {
					     System.out.print("  ");
					    	  }
					    }
					    System.out.println();
					   }
			System.out.println("------------------");
		}
	 void r() {
			for(int i=0;i<7;i++) {
			    for(int j=0;j<7;j++) {
			    	if(j==0 || j==6 || i==0 || i==3) {
			    		if(i==0 && j==6 || i==3 && j==6) {
			    			System.out.print("  ");
			    		}
			    		else {
			    		System.out.print("* ");
			    		}
			    	}
			    	else {
					     System.out.print("  ");
					    	  }
					    }
					    System.out.println();
					   }
			System.out.println("------------------");
			}
	 
	 void j() { 
			for(int i=0;i<7;i++) {
			    for(int j=0;j<7;j++) {
			    	  if(i==0 || j==3 || i==6&&j==2 || i==6&&j==1|| i==5&&j==1) {
			    		  System.out.print("* ");
			    	  }
			    	  else {
			     System.out.print("  ");
			    	  }
			    }
			    System.out.println();
			   }
			System.out.println("------------------");
}
	 void c() {
		  for (int i = 0; i <7 ; i++) {
		   for (int j = 0; j <7; j++) {
		    if(i==0 ||i==6 || j==0) {
		     if(i==0 && j==0) {
		      System.out.print(" ");
		     } else if(i==6 && j==0) {
		      System.out.print(" ");
		     } else {
		      System.out.print("* ");
		     }
		    } else {
		     System.out.print("  ");
		    }
		   }
		   System.out.println();
		  }
		  System.out.println("------------------");
		 }
	 

}



