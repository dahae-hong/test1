package proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public class Main {

	public static void main(String[] args) {
		Print p=new APrint();
		
		//Print proxy=(Print)Proxy.newProxyInstance(arg0, arg1, arg2);
		Print proxy=(Print)Proxy.newProxyInstance(
				proxy.Print.class.getClassLoader(), 
				new Class[] {Print.class}, 
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//before
						System.out.println("before");
						//내가 실행할 객체의 함수
						Object result=method.invoke(p,args);
						//after
						System.out.println("after");
						return result;
					}
				});
		
		//before
				
		//내가 실행할 객체의 함수
		
		//after
		
		proxy.print();

	}

}
