package P2;

import p1.mike;
import p1.november;
import p1.papa;

public class zulu extends P1.mike{

	public static void main(String args[]){
	}
	
	new mike().methodPublic();
	new mike().methodProtected();
	new mike().methodDefault(); 
	new mike().methodPrivate();
	new november().methodPublic();
	new november().methodProtected();
	new november().methodDefault(); 
	new november().methodPrivate();
	new papa().methodPublic();
	new papa().methodProtected();
	new papa().methodDefault(); 
	new papa().methodPrivate();
	System.out.println("Value of int"+ new xray().v);
	System.out.println("Value of long"+ new xray().w);
	System.out.println("Value of float"+ new xray().s);
	System.out.println("Value of char"+ new xray().q);
}
