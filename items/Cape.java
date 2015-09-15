package items;

public class Cape extends Armor{
	public Cape(String nick) {
		super(nick);
		this.forProf = "Kouzelnik";
		this.attack = 0;
		this.def = 10;
		this.bonusInt = 15;
		this.bonusStr = 0;
		this.prize = 10;
	}
}