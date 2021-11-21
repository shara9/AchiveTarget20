
	import java.util.Arrays;
public class CountNumExistingInRange {
		public static void main(String[] args) {
			int temp=0;
			int duplicate=0;
			int[] a={1,1,2,3,5,12,5,1,4,5,34};
		Arrays.sort(a);
			for(int i : a){
			    if ( i>=0 && i<=5){   
			    	if(duplicate!=i){
				    		temp++; 
			    	}   
			    }
			    duplicate=i;
			}
			System.out.println(temp);
		}
	}