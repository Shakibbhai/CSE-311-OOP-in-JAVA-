package firsty;

public class bubblysort {
	public static void main(String[] args) {
		int a[] = {2,25,43,19,8,41,7};
		int temp,i,j;
		System.out.println("unsorted array is :");
		for(i=0;i<7;i++) {
			System.out.print(a[i]+" ");
			}
		
		for(i=0;i<7;i++) {
			for(j=0;j<6;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
						
				}
			}
		}
		System.out.print("\n");
		System.out.println("Sorted array is:");
		for(i=0;i<7;i++) {
			System.out.print(a[i]+"  ");
		}
	}

}
