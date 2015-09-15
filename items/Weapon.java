package items;


public abstract class Weapon extends Item{
	public Weapon(String nick){
		super(nick);
		this.slot = 1;
	}
}