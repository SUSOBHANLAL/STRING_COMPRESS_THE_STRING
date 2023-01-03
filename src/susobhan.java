
public class susobhan {
	public static void main(String [] aargs) {
		
		String str ="xxxxxxabc";
		int n = str.length();
		
		
		int arr[] = new int [n*n];
		
		for(int i=0;i<n;i++) {
			arr[i]=str.charAt(i);
		}
		
		
		
		
		int count=1;
		for(int i=0;i<n;i++) {
			
			
			if(arr[i]==arr[i+1]) {
				count++;
				
				
				
			}
			else {
				
				System.out.print((char)arr[i]+""+count);
				count=1;
				
			}
			

			
		}
			
		
	}

}
