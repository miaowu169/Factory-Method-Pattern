package com.practice.HeroFactory;

import com.practice.Hero.Hero;
import com.practice.Hero.MagusHero;

public class MagusHeroFactory implements HeroFactory {
	public Hero produceHero() {
		System.out.println("����ѡ��Ϊ����ʦ");
		return new MagusHero();
	}
}
