import java.awt.Rectangle;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleTester_1 = new Rectangle(15,25,57,18);
		Rectangle rectangleTester_2 = new Rectangle(0,12,60,47);
		
		double Width_1 = rectangleTester_1.getWidth();
		double Width_2 = rectangleTester_2.getWidth();
		
		double Height_1 = rectangleTester_1.getHeight();
		double Height_2 = rectangleTester_2.getHeight();
		
		double Area_1 = Width_1 * Height_1;
		double Perimeter_1 = 2*(Width_1+Height_1);
		
		double Area_2 = Width_2 * Height_2;
		double Perimeter_2 = 2*(Width_2+Height_2);
		
		System.out.println(rectangleTester_1);
		System.out.println("Area ="+ Area_1);
		System.out.println("Perimeter ="+ Perimeter_1);
		System.out.println();
		System.out.println(rectangleTester_2);
		System.out.println("Area ="+ Area_2);
		System.out.println("Perimeter ="+ Perimeter_2);
		System.out.println();
		System.out.print("End of Output!");
		
	}

}
