import java.util.*;
class Smallest
{
	public static void main(String[] args) {
		int arr[]={2,4,1,3,7,8,9};
		int samll=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<samll)
			{
				samll=arr[i];
			}
		}
		System.out.print(samll);
	}
}