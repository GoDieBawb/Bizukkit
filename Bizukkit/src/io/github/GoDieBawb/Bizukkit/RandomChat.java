package io.github.GoDieBawb.Bizukkit;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class RandomChat {
	
	String[]    RandomPrefixList;
	String[]    RandomSuffixList;
	
	public void RandomEnable(){
		   RandomPrefixList = new String[] { 
				   "Fiddle Faddle Bitch ", 
				   "Monkey Bats ", 
				   "GO DIE ",
				   "LISTEN UP ",
				   "I have a drinking problem and ",
				   "Sometimes I ",
				   "I CAN'T STOP ",
				   "SOCK IT TO ME ",
				   "sometimes I ",
				   "because you always ", 
				   "if not then ", 
				   "can I really ",
				   "my favorite STD is ",
		   		   };
		   
		   RandomSuffixList = new String[] {
				   " I'd eat it",
				   " KEEP IT",
				   " ITS FREE",
				   " it's hard sometimes",
				   " because it keeps me off drugs",
				   " is how I got AIDS",
				   " since you HAD to know",
				   " whoah buddy... quit hittin on me",
				   " only if you wer black though",
				   " is my main fantasy",
		   		   };
	}
	
	
	public void makeRandom(Player player, String playerMessage, AsyncPlayerChatEvent event) {

		//Up Here We Write All the Words First So they aren't later replaced
		//With the Ebonic Grammar
		// Order things So they will not mess up words ex. Farmer before Farm
		

		
			//Most common words first so these are replaced before it continues
		playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b",			"wiggle");
		playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", 		"beanie baby");
		playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", 		"R&B Music");
		playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", 			"not sure but");
		playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", 			" NOPE ");
		playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", 			"WHO?");
		playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", 			"that's my slave");
		playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b",	 		"the state department");
		playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", 			"paranoia");
		playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", 		"kingdom");
		playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", 			"Jesus");
		playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", 			"A Catholic Priest");
		playerMessage = playerMessage.replaceAll("(?i)\\band\\b", 			"Whenever I");
		playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", 		"candy bars");
		playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b",	"putin");
		playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", 			"USSR");
		playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", 		"communism");
		playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", 		"dinosaur");
		playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", 		"overweight women");
		playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", 			"feeling");
		playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", 			"balls");
		playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", 		"I need you");
		playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", 			"I may be gay");
		playerMessage = playerMessage.replaceAll("(?i)\\bany", 				" super bear");
		playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", 			"probably suicide");
		playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", 			"I'm dying");
		playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", 			"cowboys and more cowboys");
		playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", 		"fairy");
		playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", 			"why talk?");
		
		//Common Phrases
		playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", 		"fatty");
		playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shimself\\b", 	"  felony assault");
		playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", 		" deserved ot ");
		playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", 		"nothing");
		playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", 			"god did it first");
		playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", 		" darwinism of the");
		playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b",		 	"dont feed the");
		playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b",			"narrator");

		//Minecraft Related Terms you can be specific here
		playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", 			"fishing");
		playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", 				"people");
		playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", 			"overweight woman");
		playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", 			"pumped");
		playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", 			"feelings release");
		playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", 				"syrup");
		playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", 				"bear food");
		playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b",				"bear murder");
		playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", 			"forestry");
		playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", 			"healthcare");
		playerMessage = playerMessage.replaceAll("(?i)\\bwood\\b", 				"Obama");
		playerMessage = playerMessage.replaceAll("(?i)\\bsapling\\b", 			"Soviet");
		
		//Food Items
		playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", 				"junk trousers");
		playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", 				"chinaman");
		playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b",			"random dwarf");
		playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", 				"I get it");
		
		
		//Personal Addressing
		playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", 		"sunburn ");
		playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", 		" candle");
		playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", 	"wax me");
		playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b",		"I guess");
		playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", 		"Polish");
		playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", 			"Frenh ");
		playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", 			"poor ");
		playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", 		"just stop");
		playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", 		" pennies lots of pennies");
		
		//Pronouns
		playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", 			"grenade");
		playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", 			"weaponry");
		playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", 			"fantastic");
		playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b",		    "bad haircut ");
		playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", 			"disbelief");
		playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ",		    "if you");
		playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", 			"I won't");
		playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", 			"he will");
		playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", 			"although");
		playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", 		"on a boat");
		playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", 			"next to a boat");
		
		//Places
		playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", 		 	"ghosts you say?");
		playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b",		 	"feelings");
		playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b",	 	"no way");
		playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", 		 	"messy theatre");
		playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", 		 	"clean that up");
		playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b",      	"cling clang");
		
		//Items
		playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", 		"strap");
		playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", 		"jordans");
		playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", 		"stacks");
		playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", 			"weave");
		playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", 		"snapback");
		
		//Misc
		playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", 			"bootstrap");
		playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b",	"solidified");			
		playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", 	"Han Solo");				
		playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", 		"Gorgon");				
		playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", 			"Tom Cruise");				
		playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", 		"green bear");
		playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", 		"godzilla");				
		playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", 		"yes, yes I am");
		playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", 		"that is correct");
		playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", 		"can't see");			
	    playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b",		    "haven't seen her"); 
		playerMessage = playerMessage.replaceAll("(?i)\\blord\\b",			 "trusting kittycat");
		playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", 			" earthworm? Bake");
		playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", 		"outstanding");			
		playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", 		"full moon");

		//Here we do Randomish Grammar we do this last to see if we can get any words not in the list above
		//but not to affect the above words

		    playerMessage = playerMessage.replaceAll("ing", "izzleing'");
		
		    playerMessage = playerMessage.replaceAll("oth", "izoth");
			
			//Set a random generic Prefix and Suffix for improved Randomfication
			
			Random generator = new Random();
			
			String prefix = RandomPrefixList[generator.nextInt(RandomPrefixList.length)];
			String suffix = RandomSuffixList[generator.nextInt(RandomSuffixList.length)];
			
			
			//Remove double spaces and Set the new Message

			playerMessage = playerMessage.replaceAll("  ", " ");
		    event.setMessage(prefix + playerMessage + suffix);
		
		
		
	}

}