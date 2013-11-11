package io.github.GoDieBawb.Bizukkit;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PirateChat {
	
	String[]    PiratePrefixList;
	String[]    PirateSuffixList;
	
	public void PirateEnable(){
		   PiratePrefixList = new String[] { 
				   "Arrgg mateys  ", 
				   "Land Ho ",
				   "Aye Captain ",
				   "Shiver me Timbers! ",
				   "land lubbers ",
				   "Avast ye scurvy dogs  ",
				   "Aye sea dogs ",
				   "Ahoy mateys! ",
				   " ",
				   " ", 
				   " ", 
				   " ",
				   " ",
		   		   };
		   
		   PirateSuffixList = new String[] {
				   " or you'll be walkin' the plank!",
				   " before we set sail!",
				   " me hearties",
				   " matey",
				   " ye scurvy dog",
				   " or I'll have your booty",
				   " Starboard!",
				   " Port Side",
				   "swab the decks!  ",
				   " ",
				   " ",
				   " ",
				   
		   		   };
	}
	
	
	public void makePirate(Player player, String playerMessage, AsyncPlayerChatEvent event) {

		//Up Here We Write All the Words First So they aren't later replaced
		//With the Pirateish Grammar
		// Order things So they will not mess up words ex. Farmer before Farm
		

		
			//Most common words first so these are replaced before it continues
		
		
			playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b",			"the");
			playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", 		"Ahoy");
			playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", 		"shove off");
			playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", 			"havin' ");
			playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", 			" has ");
			playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", 			"that");
			playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", 			"this");
			playerMessage = playerMessage.replaceAll("(?i)\\bthere\\b", 		"thar");
			playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b",	 		"booty");
			playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", 			"is nary");
			playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", 		"is nary");
			playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", 			"Ship Shape");
			playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", 			"blasted");
			playerMessage = playerMessage.replaceAll("(?i)\\band\\b", 			" and ");
			playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", 		"treasure");
			playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", 		"Aye mate");
			playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", 		"walkin the plank");
			playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", 		"bartering");
			playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", 			"barter");
			playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", 			"heave ho");
			playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", 			"shiny");
			playerMessage = playerMessage.replaceAll("(?i)\\bany", 				" any ");
			playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", 			"Blow me down");
			playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", 			"blasted");
			playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", 			"booty rocks");
			playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", 		"order");
			playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", 			"Oi matey");
			
			//Cuss Words
			playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", 				"rubbish");
			playerMessage = playerMessage.replaceAll("(?i)\\bbitch\\b", 			"landlubber");
			playerMessage = playerMessage.replaceAll("(?i)\\bfuck off\\b", 			"walk the plank!");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucked\\b", 			"pillaged");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucking\\b", 			"bloody");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucker\\b", 			"landlubber");
			playerMessage = playerMessage.replaceAll("(?i)\\bfuck\\b", 				"boff");
			playerMessage = playerMessage.replaceAll("(?i)\\byour\\smom\\b", 		"yer wench of a mother");
			playerMessage = playerMessage.replaceAll("(?i)\\bdick\\bb", 			"mizzen mast");
			playerMessage = playerMessage.replaceAll("(?i)\\bpussy\\bb", 			"salty gash");
			
			//Common Phrases
			playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", 		"How is yer anchor hangin?");
			playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", 		"send him to Davy Jones");
			playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", 		"shovin off to");


			//Minecraft Related Terms you can be specific here
			playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", 			"have a game of fisticuffs");
			playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", 				"murder");
			playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", 			"pirate ship");
			playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", 			"plundered");
			playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", 			"plunder");
			playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", 				"booty");
			playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", 				"rich with booty");
			playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b",				"have tea and crumpets with");
			playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", 			"wind");
			playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", 			"crew");
			playerMessage = playerMessage.replaceAll("(?i)\\bwood\\b", 				"driftwood");
			
			//Food Items
			playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", 				"grog and seaweed");
			playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", 				"porkskins");
			playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b",			"biscuit");
			playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", 				"salted beef");
			
			
			//Personal Addressing
			playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", 		"landlubber ");
			playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", 		" mate ");
			playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", 	"ship whore");
			playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b",		"one of you salty dogs");
			playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", 		"mate");
			playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", 			" mother ");
			playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", 			" father ");
			playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", 		"wench");
			playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", 		" any of you buckos");
			
			//Pronouns
			playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", 			"wench");
			playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", 			"landlubber");
			playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", 			"that sea dog");
			playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b",		    "that wench ");
			playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", 			"that landlubber");
			playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ",		    "that wench");
			playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", 			"me");
			playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", 			"me");
			playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", 			"ye");
			playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", 		"yer");
			playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", 			"yer");
			
			//Places
			playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", 		 	"hide out");
			playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b",		 	"ship");
			playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b",	 	"landlubber");
			playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", 		 	"landlubbers land");
			playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", 		 	"the brig");
			playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b",      	"The seven seas");
			
			//Items
			playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", 		"cutlass");
			playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", 		"peg legs");
			playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", 		"doubloons");
			playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", 			"barnet");
			playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", 		"pirate hat");
			
			//Misc
			playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b",	"aye mate");			
			playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", 	"happening");				
			playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", 		"gibberish");				
			playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", 			"grog");				
			playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", 		"jig");
			playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", 		"soldiers");				
			playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", 		"lads");
			playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", 		"fifty and zero");
			playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", 		"sailing");			
		    playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b",		    "has"); 
			playerMessage = playerMessage.replaceAll("(?i)\\blord\\b",			"Captain");				
			playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", 			" olden ");
			playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", 		"Neptune");			
			playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", 		"Poseidon's beard");

		//Here we do Piratish Grammar we do this last to see if we can get any words not in the list above
		//but not to affect the above words

		    playerMessage = playerMessage.replaceAll("ing", "in'");
			
			//Set a random generic Prefix and Suffix for improved Piratefication
			
			Random generator = new Random();
			
			String prefix = PiratePrefixList[generator.nextInt(PiratePrefixList.length)];
			String suffix = PirateSuffixList[generator.nextInt(PirateSuffixList.length)];
			
			
			//Remove double spaces and Set the new Message

			playerMessage = playerMessage.replaceAll("  ", " ");
		    event.setMessage(prefix + playerMessage + suffix);
		
		
		
	}

}
