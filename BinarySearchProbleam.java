public class BinarySearchProbleam {
	
	static int leftOcc(int[] a,int n,int key) {
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;
		int ans=-1;
		while(start<=end) {
			if(a[mid]==key) {
				ans=mid;
				end=mid-1;
			}
			else if(a[mid]<key) {
				start=mid+1;
			}
			else{
				end=mid-1;
			}
			mid=start+(end-start)/2;
		}
		return ans;
	}
	
	static int rightOcc(int[] a,int n,int key) {
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;
		int ans=-1;
		while(start<=end) {
			if(a[mid]==key) {
				ans=mid;
				start=mid+1;
			}
			else if(a[mid]<key) {
				start=mid+1;
			}
			else{
				end=mid-1;
			}
			mid=start+(end-start)/2;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] a= {0,0,1,2,2,2,3,3,4,4,4,4};
		int[] b=new int[2];
		b[0]=leftOcc(a,a.length,4);
		b[1]=rightOcc(a,a.length,4);
		for(int x:b) {
			System.out.println(x);
		}
		System.out.println("number of key in the array is : "+(b[1]-b[0]+1));
	}	
}