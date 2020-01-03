package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.WildHero;

public class WildHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("����ѡ��Ϊ����Ұ");
		return new WildHero();
	}

}
