package com.kitri.hello1;

public class HelloMain {

	public static void main(String[] agrs) {
//		HelloServiceKor helloServiceKor = new HelloServiceKor();
//		String msg = helloServiceKor.hellokor("노정탁");
		
		HelloServiceEng helServiceEng = new HelloServiceEng();
		String msg = helServiceEng.helloEng("Tak");
		
		System.out.println(msg);
	}
}
