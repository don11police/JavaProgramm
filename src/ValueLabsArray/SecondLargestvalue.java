package ValueLabsArray;

public class SecondLargestvalue {
	
	public static void main(String[] args) {
		
		int arr [] =  {45,4,545,6,457,65,6,7,56,87,768,};
		
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		System.out.println(arr[1]);
	}

}
