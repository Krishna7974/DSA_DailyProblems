public class DuplicateInArrayNinja {
	
int func(int[] a,int n) {
	int ans=0;
	for(int i=0;i<n;i++) {
		ans=ans^a[i];
	}
	for(int i=1;i<n;i++) {
		ans=ans^i;
	}
	return ans;
}

	public static void main(String[] args) {
		DuplicateInArrayNinja obj = new DuplicateInArrayNinja();
		int[] a= {2,4,3,1,4};
		System.out.println(obj.func(a,a.length));
	}
}