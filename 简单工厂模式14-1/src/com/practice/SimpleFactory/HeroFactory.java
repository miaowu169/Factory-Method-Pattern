package com.practice.SimpleFactory;

public class HeroFactory {
	static Hero hero = null;
	public static Hero getHeroInstance(String heroTP) throws Exception {
		if(heroTP.equalsIgnoreCase("Tank")) {
			hero = new TankHero();
		}else if(heroTP.equalsIgnoreCase("Wild")) {
			hero = new WildHero();
		}else if(heroTP.equalsIgnoreCase("Magus")) {
			hero = new MagusHero();
		}else if(heroTP.equalsIgnoreCase("Shoot")) {
			hero = new ShootHero();
		}else if(heroTP.equalsIgnoreCase("Auxiliary")) {
			hero = new AuxiliaryHero();
		}else {
			throw new Exception();
		}
		return hero;
	}
}
