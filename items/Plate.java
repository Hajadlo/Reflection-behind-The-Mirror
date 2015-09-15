package items;


public class Plate extends Armor{
	public Plate(String nick) {
		super(nick);
		this.forProf = "Rytir";
		this.attack = 0;
		this.def = 15;
		this.bonusStr = 10;
		this.bonusInt = 0;
		this.prize = 20;
	}
}