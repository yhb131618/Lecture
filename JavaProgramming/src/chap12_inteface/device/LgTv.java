package chap12_inteface.device;


public class LgTv extends ElectonicDevice implements Tv, Mother2, Father2 {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 소리가 들린다.");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 화면을 보여준다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LgTv " + channel + "로 채널을 변경한다.");
	}

}
