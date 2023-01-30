public class pattern8
{
	public static void main(String[] args) {
		System.out.println("Print PW SKILLS");

      // PRINT 'PW SKILLS'  

		int n=11;
		for(int i=0;i<n;i++) {
		    
            for(int j=0;j<n;j++) {
              if(j==0||i==0&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<(n-1)/2||i==(n-1)/2&&j<(n-1)/2)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        }
        for(int j=0;j<n;j++) {
              if(j==0||j==n-1||i+j==n-1&&i>=j||i==j&&i+j>=(n-1))
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        } System.out.print("               ");
         for(int j=0;j<n;j++) {
              if(i==0&&j<(n-1)/2||j==0&&i>0&&i<(n-1)/2||i==(n-1)/2&&j>0&&j<(n-1)/2||
              j==(n-1)/2&&i>(n-1)/2||i==n-1&&j<(n-1)/2)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        }
        System.out.print("");
         for(int j=0;j<n;j++) {
              if(j==0||i+j==(n-1)/2||i-j==(n-1)/2)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        } System.out.print("");
        
         for(int j=0;j<n;j++) {
              if(j==0)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        } System.out.print("");
        
         for(int j=0;j<n;j++) {
              if(j==0||i==n-1)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        } System.out.print("  ");
        for(int j=0;j<n;j++) {
              if(j==0||i==n-1)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        } System.out.print("  ");
         for(int j=0;j<n;j++) {
              if(i==0&&j<(n-1)/2||j==0&&i>0&&i<(n-1)/2||i==(n-1)/2&&j>0&&j<(n-1)/2||
              j==(n-1)/2&&i>(n-1)/2||i==n-1&&j<(n-1)/2)
            {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        
        }
        
        
        System.out.println();
        
		}
	}
}
