import java.util.Scanner;
public class ArraySwapAlternate {
	
void func(int[] a,int n) {
	for(int i=0;i<n;i+=2) {
		if(i+1<n) {
			a[i]=a[i]+a[i+1];
			a[i+1]=a[i]-a[i+1];
			a[i]=a[i]-a[i+1];
		}
	}
}

	public static void main(String[] args) {
		ArraySwapAlternate obj = new ArraySwapAlternate();
		int[] a= {6,9,5,8,7,4,3,2,1};
		obj.func(a,a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}