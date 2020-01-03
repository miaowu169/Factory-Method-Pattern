package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.MagusHero;

public class MagusHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("您的选择为：法师");
		return new MagusHero();
	}
}
