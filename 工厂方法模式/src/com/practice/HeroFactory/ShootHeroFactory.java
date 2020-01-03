package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.ShootHero;

public class ShootHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("您的选择为:射手");
		return new ShootHero();
	}
}
