 import java.io.*;
 class Gravity
{
	public static void main(String args[])throws IOException
	{
	double t,v,d;
		double g=9.8;
		DataInputStream br= new DataInputStream(System.in);
		System.out.println("enter time");
		t=Double.parseDouble(br.readLine());
		v=g*t;
		d=((1.0*g*t*t)/2);
		System.out.println("the speed of object at"+" "+t+" "+"second after its release is"+" "+v+" "+" and the distance travelled is"+" "+d);
	}
}
