
    
public class Karunanidhi
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=9;
		for(int i=0;i<n;i++) {
		    //'K letter'
		    for(int j=0;j<n;j++) {
              if(j==0||i+j==(n-1)/2||i-j==(n-1)/2)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        } System.out.print("");
        //'A' Letter
        for(int j=0;j<n;j++) {
                if(i==0||j==0||i==(n-1)/2||j==(n-1)) 
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            } System.out.print("  "); 
		    
		    
		    //Letter 'R'
		    for(int j=0;j<n;j++) {
		        if(j==0||i==0&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<(n-1)/2||i==(n-1)/2&&j<(n-1)/2||i-j==(n-1)/2)
		        System.out.print("*");
		        else 
		        System.out.print(" ");
		}  //'U' Letter
		for(int j=0;j<n;j++) {
                if(j==0&&i<n-1||i==(n-1)&&j>0&&j<n-1||j==(n-1)&&i<n-1) 
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            } //letter 'N'
            System.out.print("  ");
            	for(int j=0;j<n;j++) {
                if(j==0||i==j||j==(n-1)) 
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            } //letter 'A'
            System.out.print("  ");
            for(int j=0;j<n;j++) {
                if(i==0||j==0||i==(n-1)/2||j==(n-1)) 
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            } System.out.print("  "); 
            //letter 'N'
            System.out.print("  ");
            	for(int j=0;j<n;j++) {
                if(j==0||i==j||j==(n-1)) 
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            } 
            System.out.print("  ");
		    //LETTER 'I'
            for(int j=0;j<n;j++) {
                if(j==(n-1)/2)
              {
                  System.out.print("*");
              }
              else {
                  System.out.print(" ");
              }
          
          } System.out.print(" ");
          //letter 'D'
          for(int j=0;j<n;j++) {
            if(i==0 && j<(n-1)/2 || j==0 || i==(n-1) && j<(n-1)/2 ||
             j==(n-1)/2 && i>0 && i<(n-1)) 
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        } System.out.print(" ");
        //letter 'H'
        for(int j=0;j<n;j++) {
            if(j==0||j==n-1||i==(n-1)/2) 
          {
              System.out.print("*");
          }
          else {
              System.out.print(" ");
          }
        
        } System.out.print(" ");
        //letter 'I'
        for(int j=0;j<n;j++) {
            if(j==(n-1)/2)
          {
              System.out.print("*");
          }
          else {
              System.out.print(" ");
          }
      
      } System.out.print(" ");
            
		
		
		System.out.println();
	}
	
  }

}
