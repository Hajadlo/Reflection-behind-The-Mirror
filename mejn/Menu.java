package mejn;

import items.Item;
import characters.*;
import characters.Character;
import quest.Quest;

public class Menu { // OPRAVIT PRODEJ ITEMU A MAKAT NA XML

	public static void main(String[] args) {
		
		
		Character typek = new Knight("Konan");
		Character magic = new Mage("Mrakoplas");
		
		System.out.println(typek.fight(Creature.setCreature()));
		System.out.println(magic.fight(Creature.setCreature()));
		
		System.out.println(typek.fight(magic));
		System.out.println(magic.fight(typek));
		
		System.out.println(magic.getItem(Item.setItem()));
		System.out.println(magic.getItem(Item.setItem()));
		System.out.println(typek.getItem(Item.setItem()));
		System.out.println(typek.getItem(Item.setItem()));

		
		System.out.println(magic.fight(typek));
		System.out.println(typek.fight(magic));
		typek.heal(3);
		
		System.out.println(magic.info());
		System.out.println(typek.info());
		
		magic.levelUP();
		typek.levelUP();
		
		System.out.println(typek.activateQ(Quest.setQuest(), Creature.setCreature()));
		System.out.println(magic.activateQ(Quest.setQuest(), Creature.setCreature()));
		
		System.out.println(magic.info());
		
		System.out.println(magic.inventory());
		
		System.out.println(magic.sleep(3));
		
		magic.sellItem(magic.items.get(0));
		
		System.out.println(typek.work(2));
	}
}
