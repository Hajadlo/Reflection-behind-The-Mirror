package characters;

import items.Item;
import items.None;

import java.util.ArrayList;

import quest.Quest;

public abstract class Character implements CharInterface{
	protected String nick;
	protected String prof;
	protected int hp;
	protected int maxHP;
	protected int gold;
	public int level;
	protected int exp;
	protected int eng;
	protected int maxEng;
	
	protected float str;
	protected float baseStr;
	protected float intel;
	protected float baseInt;
	protected float attack;
	protected float def;
	
	public ArrayList<Item> items = new ArrayList<Item>();
	
	protected Item slot1;
	protected Item slot2;
	
	float[] policko = new float[4];
	float[] poleStatu = new float[4];
	
	public Character(String nick){
		this.nick = nick;
		this.gold = 20;
		this.level = 1;
		this.exp = 0;
		this.eng = 20;
		this.maxEng = 20;
		
		this.slot1 = this.noSlot();
		this.slot2 = this.noSlot();
		
		this.items.add(this.noSlot());
	}
	
	
	public String fight(Character enemy) {
		System.out.println(this.nick + " attack: " + (this.charStats()[2]));
		System.out.println("Obrane cislo " + enemy.nick + " je: " + enemy.charStats()[3]);
		
		if ((this.charStats()[2]) > enemy.charStats()[3]){
			if (enemy.level > this.level){
				this.hp -= this.level;
				this.gold += enemy.level;
				this.exp += enemy.level;
				enemy.hp -= this.level;
			}
			
			else {
				this.hp -= this.level;
				this.exp += this.level;
				enemy.hp -= enemy.level;
			}
			
			return ("Porazil jsem " + enemy.nick + "\n");
		}
		
		else{
			if (enemy.level > this.level){
				this.hp -= this.level;
				this.gold -= this.level;
				enemy.hp -= enemy.level;
				enemy.gold += this.level;	
			}
			
			else{
				this.hp -= enemy.level;
				this.gold -= enemy.level;
				enemy.hp -= enemy.level;
				enemy.gold += this.level;
			}
			
			return ("Porazil me " + enemy.nick + "\n");
		}
	}
	
	
	public String fight(Creature enemy) {
		System.out.println(this.nick + " attack: " + (this.charStats()[2]));
		System.out.println("Obrane cislo " + enemy.nick + " je: " + enemy.def);
		if ((this.charStats()[2]) > enemy.def){
			this.hp -= this.level;
			this.gold += this.level;
			this.exp += this.level;
			return("Porazil jsem " + enemy.nick + "\n");
		}
			this.hp -= this.level;
			this.gold -= this.level;
			return ("Porazil me " + enemy.nick + "\n");
	}
	
	
	public String heal(int gold){
		System.out.println(this.nick + " by se chtel vylecit z " + this.hp + " zivotu");
		if (gold > this.gold){
			return (this.nick + " nema dost penez");
		}
		if ((this.hp + gold) > this.maxHP){
			return(this.nick + " presahuje svoje maximum zivotu");
		}	
		this.hp += gold;
		return(this.nick + " byl dolecen o " + gold + " na " + (this.hp));
	}	
	
	
	public String sleep(int hours){
		System.out.println(this.nick + " by si chtel odpocinout na " + hours + " hodin");
		if (hours*2+this.eng > this.maxEng){
			return (this.nick + " presahuje svoje maximum eng");
		}
		this.eng += hours*2;
		return (this.nick + " odpocival " + hours + " hodin a docerpal " + (hours*2) + " eng.\n"
				+ "Aktualni eng: " + this.eng);
	}
	
	
	public String getItem(Item item){
		System.out.println(this.nick + " nasel " + item.returnNick());
		if (item.returnSlot() == 1 && (this.prof.equals(item.forProf) || item.forProf.equals("Oboje"))){
			slot1 = item;
			return (item.returnNick() + " byl pridan jako zbran\n");
		}
		else if(item.returnSlot() == 2 && (this.prof.equals(item.forProf) || item.forProf .equals("Oboje"))){
			slot2 = item;
			return (item.returnNick() + " byl pridan jako brneni\n");
		}
		else{
			this.items.add(item);
			return ("Predmet " + item.returnNick() + " nemuze pouzivat " + this.nick + ", a proto se ulozil do inventare\n");
		}
	}
	
	
	public void sellItem(Item item){
		while (item.returnNick().equals("Zadny predmet")){
		}
		System.out.println(items);
		this.gold += (item.returnPrize())/2;
		System.out.println(this.nick + " prodal " + item.returnNick() + " a ziskal " + (item.returnPrize()/2 + " zlatych\n"));
		items.remove(item);
	}

	
	public float[] charStats(){  // 0 = str, 1 = int, 2 = attack, 3 = def
		this.str = this.getStats(slot1)[3] + this.getStats(slot2)[3] + this.baseStr;
		this.intel = this.getStats(slot1)[2] + this.getStats(slot2)[2] + this.baseInt;
		if (this.prof == "Kouzelnik"){
			this.attack = this.getStats(slot1)[0] + this.intel;
		}
		else{
			this.attack = this.getStats(slot1)[0] + this.str;
		}
		this.def = this.getStats(slot2)[1];
		float[] statArray = {this.str, this.intel, this.attack, this.def, this.hp};
		return statArray;
	}
	
	
	public String activateQ(Quest quest, Creature enemy){
		System.out.println(this.nick + " se vydal na ukol: " + quest.nick);
		System.out.println(this.nick + " narazil na " + enemy.nick);
		if (quest.returnEnergy() >= this.eng){
			return (this.nick + " ma moc malo eng.\n");
		}
		System.out.println(fight(enemy));
		
		this.gold += this.level * quest.reward;
		this.exp += this.level * quest.reward;
		
		this.eng -= quest.returnEnergy();
		System.out.println(getItem(Item.setItem()));
		return (this.nick + " se vypravil na ukol a ziskal " + (this.level * quest.reward) + " zkusenosti a ztratil " + quest.returnEnergy() + " eng\n");
	}
	
	
	public String work(int hours){
		System.out.println(this.nick + " by si chtel pracovat " + hours + " hodin");
		if (hours > this.eng){
			return (this.nick + " nema dostatek eng na splneni prace");
		}
		this.gold += hours*2;
		this.eng -= hours;
		return (this.nick + " pracoval " + hours + " hodiny, vydelal si " + (hours*2) + " zlatych a ztratil " + hours + " eng");
	}
		
	
	public String levelUP(){
		this.level += 1;
		this.exp = 0;
		if (this.prof.equals("Kouzelnik")){
			this.intel += this.level;
		}
		else{
			this.str += this.level;
		}
		return(this.nick + " dosahnul dost zkusenosti a je ted level " + this.level+"\n");
	}
	
	
	public float[] getStats(Item item){
		float[] array = item.returnStats();
		return array;
	}
	
	
	public Item noSlot(){
		Item nothing = new None("Zadny predmet");
		return nothing;
	}
	
	
	public Item getSlot1(){
		return slot1;
	}


	public Item getSlot2(){
		return slot2;
	}
	
	
	public String info(){
		return ("\n" + this.prof + " " + this.nick + "\nHP: " + this.hp + "\nGold: "
				+ this.gold + "\nLevel: " + this.level + "\n" + "XP: " + this.exp +"\nEnergy: "
				+ this.eng + "\n" + "Strength: " + this.charStats()[0] + "\nIntelligence: " + this.charStats()[1]
				+ "\n" + "Attack: " + this.charStats()[2] + "\nDefense: " + this.charStats()[3] + "\nItems: " 
				+ slot1.returnNick() + ", " + slot2.returnNick()) +"\n";
	}
	
	
	public String inventory(){
		String itemes = "";
		for (Item i : items){
			itemes += i.returnNick() + " ";
		}
		return ("V " + this.nick + " inventari se nachazi: " + itemes + "\n");
	}
}
