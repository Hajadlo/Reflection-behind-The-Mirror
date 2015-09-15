package characters;

import items.Item;
import quest.Quest;

public interface CharInterface{
	
	
	String fight(Character enemy);
	String fight(Creature enemy);
	String heal(int gold);
	String sleep(int hours);
	String getItem(Item item);
	float[] charStats();
	String activateQ(Quest quest, Creature enemy);
	String levelUP();
	float[] getStats(Item item);
	Item noSlot();
	Item getSlot1();
	Item getSlot2();
	String info();
	String inventory();
}