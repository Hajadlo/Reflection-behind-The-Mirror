package characters;

public class Mage extends Character{
	
	public Mage(String nick){
		super(nick);
		this.hp = 30;
		this.maxHP = 30;
		this.baseStr = 10;
		this.baseInt = 25;
		this.attack = 0;
		this.def = 0;
		this.prof = "Kouzelnik";
	}
}