package com.geekshow;

public class Test04 {
	
	//-Xss1m
	
	//堆调用深度
	private static int count;
	
	public static void recursion(){
		count++;
		recursion();
	}

	public static void main(String[] args) {
		try {
			recursion();
		} catch (Throwable e) {
			System.out.println("调用最大深度："+count);
			e.printStackTrace();
		}
	}
}
