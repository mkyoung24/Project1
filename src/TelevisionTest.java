class Television {
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�. ");
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
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
	}

}
