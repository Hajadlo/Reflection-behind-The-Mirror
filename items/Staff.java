package items;
;

public class Staff extends Weapon{
	public Staff(String nick) {
		super(nick);
		this.forProf = "Kouzelnik";
		this.attack = 10;
		this.def = 0;
		this.bonusInt = 15;
		this.bonusStr = 0;
		this.prize = 20;
	}
}