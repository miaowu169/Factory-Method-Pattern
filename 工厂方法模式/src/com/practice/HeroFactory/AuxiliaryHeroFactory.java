package com.practice.HeroFactory;

import com.practice.Hero.AuxiliaryHero;
import com.practice.Hero.Hero;

public class AuxiliaryHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("����ѡ��Ϊ������");
		return new AuxiliaryHero();
	}
}
