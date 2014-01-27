package com.spt.train.domain;

public class Fish extends Animals implements AquaticAnimals  {

	public Fish(){

	}

	public void say(){
		System.out.println("Boom Boom");
	}

	public void swim(){
		System.out.println("I can swim.");
	}

}