package com.geekshow;

import java.util.Vector;

public class Test03 {
	
	public static void main(String[] args) {
		
		//-Xms2m -Xmx2m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:/Test03.dump
		
		//堆内存溢出
		Vector<Byte[]> v = new Vector<>();
		
		//连续向系统申请10M内存
		for (int i = 0; i < 5; i++) {
			v.add(new Byte[1*1024*1024]);
		}
	}

}
