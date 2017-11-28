package Arrays;
import java.util.ArrayList;

public class MaxNonNegativeSubarray {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    ArrayList<Integer> maxList = new ArrayList<Integer>();
	    ArrayList<Integer> sumList = new ArrayList<Integer>();
	    long max = 0;
	    int maxCnt = 0;
	    long sum = 0;
	    int sumCnt = 0;
	    
	    for (int i=0; i< a.size(); i++) {
	        if(a.get(i) >= 0) {
	            sumList.add(a.get(i));
	            sum += a.get(i);
	            sumCnt ++;
	            //System.out.println(sum+" "+max);
	        }
	        else if ((sum > max) || ((sum == max) && (sumCnt > maxCnt))){
	            //System.out.println("inside"+sumList.get(0));
	            maxList = new ArrayList<Integer>();
	            for(int j=0; j< sumList.size(); j++) {
	                maxList.add(sumList.get(j));
	            }
	            max = sum;
	            maxCnt = sumCnt;
	            sumList = new ArrayList<Integer>();
	            sum = 0;
	            sumCnt = 0;
	        }
	        else if(a.get(i) < 0) {
	            sumList = new ArrayList<Integer>();
	            sum = 0;
	            sumCnt = 0;
	        }
	        if((i == a.size()-1) &&  ((sum > max) || ((sum == max) && (sumCnt > maxCnt)))) {
	            maxList = new ArrayList<Integer>();
	            for(int j=0; j< sumList.size(); j++) {
	                maxList.add(sumList.get(j));
	            }
	            max = sum;
	            maxCnt = sumCnt;
	            sumList = new ArrayList<Integer>();
	            sum = 0;
	            sumCnt = 0;
	        } 
	    }
	    return maxList;
	}

}
