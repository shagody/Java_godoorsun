
import java.util.Scanner;


class GeometricObject{
	
	public double getArea(){
		return 0;
	}
}     

class Circle extends GeometricObject{
	private double radius;
	
	
	public Circle(double radius) {
//		super();//?????
		this.radius = radius;
	}


	public double getArea(){
		return radius*radius*Math.PI;
	}
}

class Rectangle extends GeometricObject{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();//????
		this.width = width;
		this.height = height;
	}

	
	public double getArea(){
		return width*height;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			
			String s= scan.next();
			char c=s.charAt(0);
			
			//s.equals(c);
			if(c=='c'){
				Circle c1 = new Circle(scan.nextDouble());
				
				System.out.printf("%.2f\n",c1.getArea());
				//System.out.println(String.format("%.2f",c1.getArea()));
			}
			else if(c=='r'){
				Rectangle r1 = new Rectangle(scan.nextDouble(),scan.nextDouble());
				
				System.out.println(String.format("%.2f",r1.getArea()));
			}
		}
		scan.close();
	}
}
