package com.atguigu.testgit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hello {
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("hello 2");
		System.out.println("hello 3");
		System.out.println("hello 4");
		System.out.println("w 5");
		System.out.println("这是第六次修改，从页面的修改 w 6");
		System.out.println("测试Egit同步功能");
		System.out.println("测试Egit比服务器版本新功能");
		System.out.println("测试冲突");
		System.out.println("w测试冲突");
	}
}

class TestList{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("before:  "+list.size());
		System.out.println("after:  "+DuplicateListDemo.dupDeal(list).size());
		list = DuplicateListDemo.dupDeal(list);
		for (Integer element : list){
			System.out.print(element+" ");
		}
		System.out.println();
		
	}
	
}

class DuplicateListDemo{
	public static List<Integer> dupDeal(List<Integer> list) {
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		list.clear();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			list.add(integer);
		}
		return list;
	}
}





class  smallT
{
	public static void  main(String args[])
	{
		smallT t  = new  smallT();
		int  b  =  t.get();
		System.out.println(b);
	}
	public int  get()
	{
		try
		{
			return 1 ;
		}
		finally
		{
			return 2 ;
		}
	}
}


class RunableThread{
	public static void main(String[] args) {
		
		Ticketssell th = new Ticketssell();
		new Thread(th).start();
		new Thread(th).start();
		new Thread(th).start();
	}
}


class Ticketssell implements Runnable{
	static int tickets = 120;
	static Object object = new Object();
	public void run() {
		while(true){
			synchronized (object) {
				if(tickets > 0){
					//System.out.printf("\n"+Thread.currentThread().getName()+"现在卖的第%d张票",tickets);
					System.out.println("\n"+Thread.currentThread().getName()+"现在卖的第"+tickets+"张票");
				}
				tickets--;
				if(tickets <= 0)
					break;
			}
		}
	}
}





