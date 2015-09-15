package items;

public abstract class Armor extends Item{
	public Armor(String nick) {
		super(nick);
		this.slot = 2;
	}
}