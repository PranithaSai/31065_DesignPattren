package task;

public class ss implements Stat {
public void action(A a)
{
	System.out.println("Initial state is instantiated");
	a.setState(this);
}
public String toString(){
    return (" in the Initial State");
 }
public void action(Object a) {
	
	
}
}
