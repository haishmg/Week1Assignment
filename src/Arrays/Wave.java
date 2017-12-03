package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Wave {
	
	public ArrayList<Integer> wtave(ArrayList<Integer> a) {
	     ArrayList<Integer> result=new ArrayList<Integer>();
       Collections.sort(a);

       while(a.size()>2){
           Integer min=a.get(0);
           Integer next=a.get(1);
           a.remove(min);
           a.remove(next);

           result.add(next);
           result.add(min);
       }
       if(a.size()==1){
           result.add(a.get(0));
       }
       else{
           result.add(a.get(1));
           result.add(a.get(0));
       }

       return result;	    
	}

}
