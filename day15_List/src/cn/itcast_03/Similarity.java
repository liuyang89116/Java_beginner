package cn.itcast_03;

public class Similarity {
	public static void main(String[] args) {
		String s1 = "CCTGGATAGG";
		String s2 = "ACTGGGTCTT";
		
		int count =0;
		
		for (int i=0; i<s1.length();i++){
			if(s1.charAt(i)==s2.charAt(i)){
				count++;
			}
		}
		
		System.out.println("count: "+count);
	}
}
