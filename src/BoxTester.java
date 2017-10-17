
public class BoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Box box1 = new Box();
//		box1.x = 3;
//		box1.y = 4;
//		box1.z = 5;
//		
//		box1.height = 5;
//		box1.width = 5;
//		box1.depth = 5;
//		
//		System.out.println(box1.height);		
		
		Box box2 = new Box(3,4,5,10,10,10);
		System.out.println("the height of box2 is:" +box2.height);		
		
		System.out.println(box2.calculateVolume());
		System.out.println(box2.calculateSurfaceArea());
	}

}
