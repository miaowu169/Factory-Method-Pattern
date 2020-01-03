package com.practice.Client;

import com.practice.Hero.Hero;
import com.practice.HeroFactory.HeroFactory;

public class Client {
	public static void main(String [] args) {
		Hero hero;
		HeroFactory factory;
		factory = (HeroFactory) XMLUtilHero.getHeroFactory();
		hero = factory.produceHero();
		hero.display();
	}
}
