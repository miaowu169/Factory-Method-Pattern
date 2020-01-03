package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.TankHero;

public class TankHeroFactory implements HeroFactory {	
	public Hero produceHero() {
		System.out.println("您的选择为:坦克");
		return new TankHero();
	}
}
