class Television {
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다. ");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChanner(int ch) {
		channel = ch;
	}
}
public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.setChanner(11);
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
	}

}
