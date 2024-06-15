package arraycollection;

public class SortingA {
	
	public static void main(String[] args) {
		int[] x = {24,14,32,36,5,20};
		int temp;
		for (int i=0;i<x.length-1;i++) {
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
