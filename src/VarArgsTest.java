class Var {
	void sub(int... v) {
		System.out.println("�μ��� ���� : " + v.length);
		for(int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
}
public class VarArgsTest {
	public static void main(String[] args) {
		Var c = new Var();
		c.sub(1, 2, 3, 4, 5);
		c.sub(1, 2, 3);
		c.sub();

	}

}
