package iterationInMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class FreqString {
	static LinkedHashMap<Character,Integer> freqChar(String st){
		LinkedHashMap<Character,Integer> mp=new LinkedHashMap<>();
		for(char ch:st.toCharArray()) { 
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}
			else {
				mp.put(ch, 1);
			}
		}
		return mp;
	}
	static String maxChar(String st) {
		LinkedHashMap<Character,Integer> op=freqChar(st);
		String str="";
		while(!op.isEmpty()) {
			int max=0;
			char c='\0';
			for(Map.Entry<Character, Integer> it:op.entrySet()) {
				if(it.getValue()>max) {
					max=it.getValue();
					c=it.getKey();
				}
			}
			op.remove(c);
			str=str+(c+"").repeat(max);
		}
		return str;
	}
	public static void main(String[] args) {
		String st="vellalar";
		String op=maxChar(st);
		System.out.println(op);
	}
}