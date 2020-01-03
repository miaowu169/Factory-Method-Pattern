package com.practice.Client;

import com.practice.SimpleFactory.Hero;
import com.practice.SimpleFactory.HeroFactory;

public class Client {
	public static void main(String [] args) {
		try {
			Hero hero;
			String heroName = XMLUtilHero.getHeroName();
			hero = HeroFactory.getHeroInstance(heroName);
			hero.display();
		}catch(Exception e) {
			System.out.println("无法创建此英雄");
		}
	}
}
