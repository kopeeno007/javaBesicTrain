package com.spt.train;

import com.spt.train.domain.*;

public class Main {
	public static void main(String[] args){

		Fish fish = new Fish();
		fish.say();
		fish.swim();

		System.out.println("==========================");

		Animals fishMan = new Fish();
		fishMan.say();

		System.out.println("==========================");

		AquaticAnimals fishGirl = new Fish();
		fishGirl.swim();

	}
} 