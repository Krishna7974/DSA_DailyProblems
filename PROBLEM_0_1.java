public class PROBLEM_0_1 {
	
	void Display(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
	}
	void Func(int[] a,int n) {
		int i=0,j=n-1;
		while(i<j) {
			while(a[i]==0 && i<j) {
				i++;
			}
			while(a[j]==1 && i<j) {
				j--;
			}
			if(i<j) {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
			i++;
			j--;
		}		
	}
	
	public static void main(String[] args) {
		int[] a= {1,0,1,1,0,0,1,0,0};
		PROBLEM_0_1 x=new PROBLEM_0_1();
		x.Func(a,a.length);
		x.Display(a,a.length);
	}	
}
