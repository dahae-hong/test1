package springaop2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
GenericXmlApplicationContext ctx=
new GenericXmlApplicationContext("classpath:springaop2/aop-context.xml");
//Exe exe=(Exe)ctx.getBean("exe");
Exe exe=(Exe)ctx.getBean(springaop2.Exe.class);
exe.exe1();
exe.exe2();
exe.exe3();


	}

}
