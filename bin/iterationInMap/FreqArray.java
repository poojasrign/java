package iterationInMap;

import java.util.HashMap;

public class FreqArray {
	public static void main(String[] args) {

		int arr[]=new int[256];//256 total ascii values

		String st="abac12";

		HashMap<Character,Integer> mp=new HashMap<>(); 

		for(char ch:st.toCharArray()) {

			arr[ch]++;   //Freq Array

		}

		for(int i=97;i<122;i++) { //97-lowercase a, 122-lowercase z

			System.out.println((char)i+" : "+arr[i]);

		}




		//for HashMap

		for(char ch:st.toCharArray()) {

			if(mp.containsKey(ch)) {

				mp.put(ch, mp.get(ch)+1);

			}

			else {

				mp.put(ch, 1);

			}

		}

		System.out.println("\n\nBy Map --> "+mp);

	}

}
