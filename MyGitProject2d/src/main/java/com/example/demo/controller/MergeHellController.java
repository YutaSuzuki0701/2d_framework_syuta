package com.example.demo.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;

@Controller
public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

	public static void kadaiB() {

		Random rand = new Random();

		int randomNumber = rand.nextInt(100) + 1;
		System.out.println("ランダムな数: " + randomNumber);
	}

}

package com.example.demo.controller;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

	}

	//ここに課題を書く。メソッド名変えてね。
	static void kadaiA() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i + "回目のループです。");

		}
	}

}
package com.example.demo.controller;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

	}

	//ここに課題を書く。メソッド名変えてね。
	static void kadaiA() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i + "回目のループです。");

		}
	}

}
