package iterationInMap;
import java.util.LinkedHashMap;

public class StringsConcept {
	static	LinkedHashMap<Character,Integer> freqChar(String st){
		LinkedHashMap<Character,Integer> mp =new LinkedHashMap<>();
		for(char ch:st.toCharArray()) {
			if(mp.containsKey(ch)) {
				mp.put(ch,mp.get(ch)+1);
			}
			else {
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);
		return mp;
		 
	}
	static char maxChar(String st) {
		LinkedHashMap<Character,Integer> op=freqChar(st) ;
        int max=0;
        char c='\0';
       for(char ch:op.keySet()){        // for(Map.Entry<Character,Integer> it:op.entrySet()) { 
        	 int cVal=op.get(ch);       //if(it.getValue()>max) { 
        	 if(cVal>max){              //max=it.getValue();
        		max=cVal;               //c=it.getKey();
        		c=ch;                  //}         		
        	}                           //return c;                       
        }                                                             
		return c;                                        
	}                                                      
	public static void main(String[] args) {
		String st="velalar";
		char op=maxChar(st);
		System.out.println(op);
	}

}