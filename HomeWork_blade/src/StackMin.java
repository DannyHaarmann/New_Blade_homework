import java.util.*;
public class StackMin 
{
	
	
	 public static void main(String[] args)
	    {
	        StackMin s = new StackMin();
	       
	          
	        s.push(3);
	        s.push(5);
	        s.getMin();
	        s.push(2);
	        s.push(1);
	        s.getMin();
	        s.pop();
	        s.getMin();
	        s.pop();
	    }
	Stack<Integer> stack;
	Integer smallman;
	StackMin() 
	{ 
		stack = new Stack<Integer>(); 
	}
	
	void pop()
    {
        if (stack.isEmpty()) 
        {
            System.out.println("Stack is empty");
            return;
        }
 
        System.out.print("Top Most Element Removed: ");
        Integer t = stack.pop();
 
     
        if (t < smallman) 
        {
            System.out.println(smallman);
            smallman = 2 * smallman - t;
        }
 
        else
            System.out.println(t);
    }
	
	 void push(Integer x)
	    {
	        if (stack.isEmpty()) 
	        {
	            smallman = x;
	            stack.push(x);
	            System.out.println("Number Inserted: " + x);
	            return;
	        }
	 
	        
	        if (x < smallman) 
	        {
	            stack.push(2 * x - smallman);
	            smallman = x;
	        }
	 
	        else
	            stack.push(x);
	 
	        System.out.println("Number Inserted: " + x);
	    }
	
	void getMin()
	
	    {
	        
	        if (stack.isEmpty())
	            System.out.println("Stack is empty");
	 
	       
	        else
	            System.out.println("Minimum Element in the " + " stack is: " + smallman);
	    }
	
	
}
