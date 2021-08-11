package springaop;

public class Advice {
public Advice() {

}

public void before() {
	System.out.println("before exe");
}
public void after() {
	System.out.println("after exe");
}

public void afterThrowing() {
	System.out.println("afterThreowing exe");
}
public void afterReturning() {
	System.out.println("afterReturning exe");
}

}
