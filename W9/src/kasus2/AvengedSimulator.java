package kasus2;

public class AvengedSimulator {
	public static void main(String[] args) {
		SuperHero[] Heroes = new SuperHero[5];
		Heroes[0] = new ManRay(0, "Gennichiro");
		Heroes[1] = new FlyingDutchMan(225, "Shirai");
		Heroes[2] = new ManRay(553, "Gyoubu Masataka Oniwa");
		Heroes[3] = new DirtyBubble(666, "Arnastria");
		Heroes[4] = new FlyingDutchMan(36556, "Tatenari");
		
		for(int i=0; i < Heroes.length; i++) {
			Heroes[i].identity();
			Heroes[i].showPower();
			System.out.println();
		}
	}
}