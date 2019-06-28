package com.ldh.algorithm;

/**
 * 其他算法类
 * @author Li Dehuan
 * @date 2019年6月28日
 *
 */
public class OtherAlgorithm {

	
	public static void main(String[] args) {
		
		// 1. 输入字符串，打印全部排列
		charArrangement("abcd");
	}
	
	
	/**
	 * 1. 输入字符串，打印全部排列
	 * @param str
	 */
	public static void charArrangement(String str){
		
		char[] chs = str.toCharArray();
		
		arrange(chs , 0, chs.length);
	}

	public static void arrange(char[] chs, int start, int len){
		if(start == len-1){
			for(int i=0; i<chs.length; ++i)
				System.out.print(chs[i]);
			System.out.println();
			return;
		}
		for(int i=start; i<len; i++){
			char temp = chs[start];
			chs[start] = chs[i];
			chs[i] = temp;
			arrange(chs, start+1, len);	//递归
			temp = chs[start];
			chs[start] = chs[i];
			chs[i] = temp;
		}
	}
}
