package cn.itcast_07;

/*
 * 统计大串中小串出现的次数
 * 
 * 举例：
 * 		字符串：“woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”
 * 
 * 结果：
 * 		java出现了5次
 * 
 * 分析：
 * 	  	A 定义统计变量，初始值0
 * 		B 现在大串中查找一次，indexOf方法做
 * 			索引是-1，说明不存在
 * 			索引不是-1，统计变量++
 * 		C 刚才的索引加上小串长度作为开始截取的上次大串
 */

public class StringTest5 {
	public static void main(String[] args) {
		// 定义字符串
		String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String pattern = "java";

		/*// 定义统计变量
		int sum = 0;

		if (str.indexOf(pattern) == -1) {
			System.out.println("不存在这样的java");
		}

		while (true) {
			if (str.indexOf(pattern) == -1) {
				break;
			} else {
				sum++;
				str = str.substring(str.indexOf(pattern) + pattern.length());
			}
		}

		System.out.println(sum);*/
		
		int count = getCount(str, pattern);
		System.out.println(count);
		
	}
	
	
	public static int getCount(String str, String pattern){
		//定义统计变量
		int count = 0;
		
		/*//先查一次
		int index = str.indexOf(pattern);
		
		while(index !=-1 ){
			count++;
			//int startIndex = index + pattern.length();
			str = str.substring(index+pattern.length());
			
			index = str.indexOf(pattern);
		}*/
		
		int index;
		while((index=str.indexOf(pattern)) != -1){
			count++;
			str = str.substring(index+pattern.length());
			
		}
		
		return count;
	}
}
