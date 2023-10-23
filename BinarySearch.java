public class BinarySearch {
	
	int search(int[] a,int n,int key) {
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;
		while(start<=end) {
			if(a[mid] == key) {
				return mid;
			}
			else if(a[mid]<key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			mid=start+(end-start)/2;
		}
		return -1;
	}
	
	public static void main(String[] args) {	
		BinarySearch x=new BinarySearch();
		int[] a= {2,5,9,12,31,44,56};
		int ans=x.search(a, a.length, 44);
		System.out.println("Index of 44 is "+ans);
	}	
}