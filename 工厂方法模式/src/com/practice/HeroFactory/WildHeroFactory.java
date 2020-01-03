package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.WildHero;

public class WildHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("您的选择为：打野");
		return new WildHero();
	}

}
