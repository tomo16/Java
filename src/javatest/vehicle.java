package javatest;

interface iVehicle
{
	void show();
}
//�N���}�N���X
class Car implements iVehicle
{
	private int num;
	private double gas;
	
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̃N���}���쐬���܂���");
	}
	public void show()
	{
		System.out.println("�N���}�̃i���o�[��" + num + "�ł�");
		System.out.println("�K�\�����ʂ�" + gas + "�ł�");
	}
}
//��s�@�N���X
class Plane implements iVehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("��" + flight + "�̔�s�@���쐬���܂���");
	}
	public void show()
	{
		System.out.println("��s�@�̕ւ�" + flight + "�ł�");
	}
}
class Sample1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		iVehicle[] ivc = new iVehicle[2];
		ivc[0] = new Car(1234,20.5);
		ivc[1] = new Plane(232);
		
		for(int i=0;i < ivc.length; i++) {
			ivc[i].show();
		}
		
	}

}
