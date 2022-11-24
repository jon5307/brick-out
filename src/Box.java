public class Box {
	
	private final int BOX_SIZE;
	
	public Box(int size) {
		BOX_SIZE = size;
	}
	
	public boolean inHorizontalContact(int x) {
		return x <= 0 || x >= BOX_SIZE;
	}
	
	public boolean inVerticalContact(int y) {
		return y <= 0 || y >= BOX_SIZE;
	}
	
	public int sizeOf() {
		return BOX_SIZE;
	}
}
