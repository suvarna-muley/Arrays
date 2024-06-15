package arraycollection;

public class RemDupliA {
	public static void main(String[] args) {
		int[] x = {1,1,2,2,3,4,5,5};
 		int[] temp = new int[x.length];// EMPTY ARRAY
		int j = 0;
		for (int i =0;i<x.length-1;i++){
			if(x[i]!=x[i+1]) {
				
				//copy the value to temp
				temp[j] = x[i];
				j++;
		}
	}
		temp[j] = x[x.length-1]; 
		for(int i=0;i<x.length;i++) {
			System.out.println(temp[i]);
		}
	}
}
