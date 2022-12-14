package game;

public class Box {
	
	private final int BOX_SIZE;
	
	public Box(int size) {
		BOX_SIZE = size;
	}
	
	public boolean inHorizontalContact(int x) {
		return x <= 0 || x >= BOX_SIZE;
	}
	public boolean topContact(int y) {
		return y <= 0;
	}
	public boolean bottomContact(int y) {
		return y >= BOX_SIZE;
	}
	public boolean leftContact(int x) {
		return x <= 0;
	}
	public boolean rightContact(int x) {
		return x >= BOX_SIZE;
	}
	public boolean inVerticalContact(int y) {
		return y <= 0; //|| y >= BOX_SIZE; 추가시 아래 박스라인에서도 튕김
	}

	
	public int sizeOf() {
		return BOX_SIZE;
	}
}
