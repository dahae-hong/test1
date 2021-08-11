package springaop;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
GenericXmlApplicationContext ctx=
new GenericXmlApplicationContext("classpath:springaop/aop-context.xml");
//System.out.println(ctx.getBean("advice"));
Exe exe=(Exe)ctx.getBean("exe");
exe.exe1();
//exe.exe2();
//exe.exe3();


	}

}
