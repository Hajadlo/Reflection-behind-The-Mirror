package characters;

public class Knight extends Character{
	
	public Knight(String nick) {
		super(nick);
		this.hp = 50;
		this.maxHP = 50;
		this.baseStr = 15;
		this.baseInt = 10;
		this.attack = 0;
		this.def = 0;
		this.prof = "Rytir";
	}
}