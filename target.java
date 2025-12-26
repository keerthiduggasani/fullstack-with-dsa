import java.util.Arrays;
class Main {
	static void Combination( int[] a , int index  , int k , int target , String p ){
		if(k==0 &&target==0){
			System.out.println(p);
		}
		if (target<0){
			return ;
		}
		for (int i=index ; i<a.length ; i++ ){
		Combination(a,i+1,k-1,target-a[i],p+a[i]+ " ,");
	}
}
	public static void main (String[]args){
		int[] a={3,4,5,2,6,7,2};
		Arrays.sort(a);
		Combination(a,0,3,9," ");
	}
}