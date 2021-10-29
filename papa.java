package P1;

public class papa {

public static void main(String args[]) {
	//System.out.println("The value of m = "+new mike().m); //cannot call a private int
	System.out.println("The value of o = "+new mike().o);
	System.out.println("The value of l = "+new mike().l);
	System.out.println("The value of dist = "+new november().dist);
	System.out.println("The value of age = "+new november().age);
	System.out.println("The value of factor = "+new november().factor);
	}
public void methodPublic() {
	System.out.println("Class papa: methodPublic");
}

protected void methodProtected() {
	System.out.println("Class papa: methodProtected");
	
}

void methodDefault() {
	System.out.println("Class papa: methodDefault");
}

private void methodPrivate() {
	System.out.println("Class papa: methodPrivate");
}
}
