package com.ict.edu01;

interface I {
	public void play();
}

class K_land {
	void autoPlay(I i) {
		i.play();
	}
}

class Bumper_Car implements I {
	@Override
	public void play() {
		System.out.println("범퍼카");
	}
}

class Baseball implements I {
	@Override
	public void play() {
		System.out.println("야구게임");
	}
}

public class Ex09 {
	public static void main(String[] args) {
		K_land k_land = new K_land();
		k_land.autoPlay(new I() {

			@Override
			public void play() {
				System.out.println("회전목마");
			}
		});
		System.out.println("====================");
		int k = 1;
		I i = null;
		if (k == 1) {
			i = new Bumper_Car();
		} else if (k == 2) {
			i = new Baseball();
		}
		k_land.autoPlay(i);

	}
}
