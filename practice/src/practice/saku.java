package practice;

public class saku {
	    public static void main(String []args){
	    	//int matrix[][]=new matrix[3][3];
	            int [][]matrix= {{1,2,3},
	    		   			{4,5,6},
	    		   			{7,8,9}};
	            int a[][]=new int[3][3];
	            int temp = 0;
	           // int b[][]=new int[3][3];
	    	int i,j;	   				
	        for(i=0;i<3;i++){
	            for(j=0;j<3;j++){
	                //int temp=matrix[i][j];
	                  a[i][j]=matrix[j][i];
	                   temp=a[i][j];
	                //matrix[j][i]=temp;
	            }
	        }
	        //int temp=a[i][j];
	        for(i=0;i<3;i++){
	            for(j=0;j<3;j++){
	                System.out.print(a[i][j]+" ");
	            }
	           System.out.println("");
	        }
	        System.out.println("now reverse:        "
	        		+ "");
	        for(i=0;i<3;i++){
	            for(j=0;j<3;j++){
	               a[i][j]=temp;
	               a[i][j]=a[3-j-1][i];
	            }
	         
	        }
	        for(i=0;i<3;i++){
	            for(j=0;j<3;j++){
	                System.out.print(a[i][j]+" ");
	            }
	           System.out.println("");
	        }
	       
	        
	        
	    }
	}
