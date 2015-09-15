package characters;

import java.util.Random;

public class Creature {
	public String nick;
	public int hp;
	public float def;
	
	public Creature(String nick, float def){
		this.nick = nick;
		this.def = def;
	}
	
	public static Creature setCreature(){
		Creature kentaur = new Creature("V�r��f", 15);
		Creature ogr = new Creature("Ogre", 25);
		Creature zaba = new Creature("Zabak Rabak", 10);
		
		Creature[] creatures = {kentaur, ogr, zaba};
		Creature randomC = (creatures[new Random().nextInt(creatures.length)]);
		return randomC;
	}
}