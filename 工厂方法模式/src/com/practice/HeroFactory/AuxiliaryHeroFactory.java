package com.practice.HeroFactory;

import com.practice.Hero.AuxiliaryHero;
import com.practice.Hero.Hero;

public class AuxiliaryHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("ÄúµÄÑ¡ÔñÎª£º¸¨Öú");
		return new AuxiliaryHero();
	}
}
