package chap12_inteface.device;

interface Tv extends Speaker, Display {

	void changeChannel(int channel);
}
