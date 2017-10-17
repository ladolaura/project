
public class Box {

		int x;
		int y;
		int z;
		double height;
		double width;
		double depth;
		
		public Box(int x, int y, int z, double height, double width, double depth) {
			this.x = x;
			this.y = y;
			this.z = z;
			
			this.height = height;
			this.width = width;
			this.depth = depth;
		}
		
		public double calculateVolume() {
			return height*width*depth;
		}
		
		public double calculateSurfaceArea() {
			return 2 * ((height * width) + (height * depth) + (width * depth));
		}
}
