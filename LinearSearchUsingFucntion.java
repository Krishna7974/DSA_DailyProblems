import java.util.Scanner;
class LinearSearchUsingFucntion {
	
	boolean search(int a[],int n,int key) {
		for(int i=0;i<n;i++) {
			if(a[i]==key)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		int a[]=new int[] {6,8,5,4,2};
		int key=x.nextInt();
		LinearSearchUsingFucntion o=new LinearSearchUsingFucntion();
		boolean p=o.search(a,5,key);
		if(p)
			System.out.println("true");
		else
			System.out.println("false");
	}

}