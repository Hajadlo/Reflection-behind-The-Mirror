package items;


public class Sword extends Weapon{
	public Sword(String nick) {
		super(nick);
		this.forProf = "Rytir";
		this.attack = 15;
		this.def = 0;
		this.bonusStr = 10;
		this.bonusInt = 0;
		this.prize = 10;
	}
}
