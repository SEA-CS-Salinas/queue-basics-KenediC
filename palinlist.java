//(c) A+ Computer Science
//www.apluscompsci.com
/*The PalinList class utilizes two constructors (one Parameterized, the other non-parameterized),
and two methods setList(), and isPalin(). The setList() method adds each element of the given String 
to the queue. The isPalin() method utilizes if statements and a while loop to compare one element to the 
opposite index, in order to determine if the given queue is a palinlist.
@author Kenedi Carson*/

//Import needed utilities
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList{
	private Queue<String> queue; //Instance variable for Queue
	private Stack<String> stack; //Instance variable for Stack

    /*No-Argument Constructor- Called when no argument is provided in the constructor. Calls setList() method
     @param none*/
	public PalinList(){
	    queue = new LinkedList<String>();
	    stack = new Stack<String>();
		setList("");
	}
    
    /*Parameterized Constructor- Called when an argument is provided in constructor. Calls serList() method
    @param String list*/
	public PalinList(String list){
	    queue = new LinkedList<String>();
	    stack = new Stack<String>();
	    setList(list);
	}

    /*setList() method- Splits the given expression and adds it to the queue.
    @param String list
    @return none*/
	public void setList(String list){
	    queue.clear();
	   String[] temp = list.split(" ");
	   for(String o: temp){
	       queue.add(o);
	       stack.add(o);
	   } 
	}
    /*isPalin() method- Uses a Stack and Queue to compare the first and last 
    element of a given expression in order to determine if it is a palindrome.
    @param none
    @return boolean*/
	public boolean isPalin(){
	        while(!queue.isEmpty()){
	            if(queue.peek().equals(stack.lastElement())){
	                queue.remove();
	                stack.remove(stack.size()-1);
	                continue;
	            }
	            else{
	                return false;
	            }
	        }
	    
		return true;
	}

    /*toString() method- Outputs the resulting code in a readable manner.
    @param none
    @return String ans*/
	public String toString(){
	    String ans = "";
	    System.out.print(queue);
	    if(isPalin()){
	        ans += " is a palinlist.";
	    }
	    else{
	        ans += " is not a palinlist.";
	    }
	    return ans;
	}
}