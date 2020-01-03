package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.ShootHero;

public class ShootHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("����ѡ��Ϊ:����");
		return new ShootHero();
	}
}
