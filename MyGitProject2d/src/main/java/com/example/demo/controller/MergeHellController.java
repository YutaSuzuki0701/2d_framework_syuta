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