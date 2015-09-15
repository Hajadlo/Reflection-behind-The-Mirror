package quest;

import java.util.Random;

public class Quest {
	public String nick;
	protected int engNeeded;
	public int reward;
	
	public Quest(String nick, int engNeeded, int reward){
		this.nick = nick;
		this.engNeeded = engNeeded;
		this.reward = reward;
	}
	
	public int returnEnergy(){
		return this.engNeeded;
	}
	public static Quest setQuest(){
		
		Quest prvni = new Quest("Za horami", 5, 3);
		Quest druhy = new Quest("Blbustka", 8, 5);
		Quest treti = new Quest("Za horami", 15, 6);
		Quest ctvrty = new Quest("Za horami", 1, 1);
		Quest paty= new Quest("Za horami", 6, 4);
		Quest sesty = new Quest("Za horami", 3, 2);
		
		Quest[] quests = {prvni, druhy, treti, ctvrty, paty, sesty};
		Quest randomQ = (quests[new Random().nextInt(quests.length)]);
		return randomQ;
	}
	
	
}