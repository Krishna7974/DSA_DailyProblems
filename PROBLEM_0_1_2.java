public class PROBLEM_0_1_2 {
	
	void display(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
	}
	void func(int[] a,int n) {
		int low=0,mid=0,high=n-1;
		while(mid<high) {
			if(a[mid]==0) {
				a[mid]=a[mid]+a[low];
				a[low]=a[mid]-a[low];
				a[mid]=a[mid]-a[low];
				mid++;
				low++;
			}
			else if(a[mid]==1) {
				mid++;
			}
			else {
				a[mid]=a[mid]+a[high];
				a[high]=a[mid]-a[high];
				a[mid]=a[mid]-a[high];
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a= {2,0,1,2,1,0,2,0,0};
		PROBLEM_0_1_2 x=new PROBLEM_0_1_2();
		x.func(a,a.length);
		x.display(a,a.length);
	}	
}