package com.geekshow;

import java.util.HashMap;
import java.util.Map;

public class Test06 {

	public static void main(String[] args) {
		
		//参数：-Xms30m -Xmx30m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags -XX:PretenureSizeThreshold=1000
		//这种现象原因为：虚拟机对于体积不大的对象会优先把数据分配到TLAB区域中，因此失去了在老年代分配的机会
		//参数：-Xms30m -Xmx30m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
	
		Map<Integer, byte[]> m = new HashMap<>();
		for (int i = 0; i < 5*1024; i++) {
			byte[] b = new byte[1024];
			m.put(i, b);
		}
	}
}
