package arraycollection;

public class SortintContinue {
	public static void main(String[] args) {
		int[] x = {24,14,32,36,5,20};
		int temp;
		for (int j=0;j<x.length-1;j++) {
			for (int i=0;i<x.length-1;i++)
			if(x[i]>x[i+1]) {
				temp = x[i+1];
				x[i+1]=x[i];
				x[i]=temp;
			}
		}
	
		for(int i=0;i<x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
	
//bubble sort tech

