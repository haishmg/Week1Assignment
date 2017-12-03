package Arrays;

import java.util.List;

public class ContinuousSubArray {
	
	public int maxSubArray(final List<Integer> a) {
      	int arr[] = new int[a.size()];
	    arr[0] = a.get(0);
	    int max = a.get(0);
	    for(int i=1 ; i<a.size() ; i++){
	        arr[i] = Math.max(a.get(i),a.get(i)+arr[i-1]);
	        max = Math.max(max,arr[i]);
	    }
	    return max;
	}

}
