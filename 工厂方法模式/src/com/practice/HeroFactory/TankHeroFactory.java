package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.TankHero;

public class TankHeroFactory implements HeroFactory {	
	public Hero produceHero() {
		System.out.println("����ѡ��Ϊ:̹��");
		return new TankHero();
	}
}
