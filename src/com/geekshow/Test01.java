package com.geekshow;

public class Test01 {
	
	public static void main(String[] args) {
		
		//-Xms5m -Xmx20m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		//-XX:+PrintGCDetails
		//-XX:+PrintCommandLineFlags
		
		//-XX:+PrintGC -Xms5m -Xmx20m -XX:+UserSerialGC -XX:+PrintGCDetails 

		//查看GC信息
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());

		byte[] b1 = new byte[1024*1024*1];
		System.out.println("分配了1M");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		byte[] b2 = new byte[1024*1024*4];
		System.out.println("分配了4M");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		int a = 0x04400000;
		int b = 0x04610000;
		
		System.out.println("结果为：" + (b-a)/1024);
	}

}
