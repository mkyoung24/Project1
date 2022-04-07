class Box {
	int width;
	int length;
	int height;
	int volume;
	
	int getVolume() {
		return volume;
	}
	
	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = width * length * height;
	}
}
public class BoxTest {

	public static void main(String[] args) {
		Box b = new Box(20, 20, 30);
		System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");

	}

}
