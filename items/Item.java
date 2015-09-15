package items;

import java.util.Random;

public abstract class Item implements ItemInterface{
	protected String nick;
	
	protected int prize;
	protected int slot;
	
	protected float attack;
	protected float def;
	protected float bonusInt;
	protected float bonusStr;
	
	public String forProf;
	
	public Item(String nick){
		this.nick = nick;
	}
	public float[] returnStats(){
		float[] stats = {this.attack, this.def, this.bonusInt, this.bonusStr};
		return stats;
	}

	public int returnPrize() {
		return this.prize;
	}

	public String returnNick() {
		return this.nick;
	}
	
	public int returnSlot(){
		return this.slot;
	}
	
	public static Item setItem(){
		Item hulka = new Staff("Cool staff");
		Item kape = new Cape("Cool cape");
		Item mecak = new Sword("Cool sword");
		Item krouzkovka = new Plate("Cool plate");
		
		Item[] items = {hulka, kape, mecak, krouzkovka};
		Item randomItem = (items[new Random().nextInt(items.length)]);
		return randomItem;
	}
}