package io.github.GoDieBawb.Bizukkit;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class BritChat {
	
	String[]    britPrefixList;
	String[]    britSuffixList;
	
	public void britEnable(){
		   britPrefixList = new String[] { 
				   "Cheerio poppins  ", 
				   "Oi mate ", 
				   "Sir, ",
				   " ",
				   "Oi Wankers ",
				   "Blimey  ",
				   "Tea and wot not ",
				   "save the queen mate and ",
				   " ",
				   " ", 
				   " ", 
				   " ",
				   " ",
		   		   };
		   
		   britSuffixList = new String[] {
				   " pip pip cherrio and wot not",
				   " for the queen",
				   " got it mate?",
				   " mate",
				   " bugger",
				   " pish posh and a cup of tea",
				   " roight bloke?",
				   " Monty Python",
				   "Aye Govna'  ",
				   " ",
				   " ",
				   " ",
				   
		   		   };
	}
	
	
	public void makeBrit(Player player, String playerMessage, AsyncPlayerChatEvent event) {

		//Up Here We Write All the Words First So they aren't later replaced
		//With the British Grammar
		// Order things So they will not mess up words ex. Farmer before Farm
		

		
			//Most common words first so these are replaced before it continues
		
		
			playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b",			"the");
			playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", 		"cheerio govna");
			playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", 		"toodle pip");
			playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", 			"have");
			playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", 			" has ");
			playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", 			"that");
			playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", 			"this");
			playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b",	 		"sticky wicket molly whopper");
			playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", 			"is nary");
			playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", 		"is nary");
			playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", 			"jolly well good");
			playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", 			"wankerish");
			playerMessage = playerMessage.replaceAll("(?i)\\band\\b", 			" and ");
			playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", 		"crumpet");
			playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b",	"I apologize");
			playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", 		"Aye mate");
			playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", 		"sticky wicket");
			playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", 		"peddling");
			playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", 			"peddle");
			playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", 			"toil");
			playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", 		"how the bloody hell to");
			playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", 			"fresh");
			playerMessage = playerMessage.replaceAll("(?i)\\bany", 				" any bloody");
			playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", 			"Cor blimey mate");
			playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", 			"Save the Queen");
			playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", 			"for the Queen");
			playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", 		"inform");
			playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", 			"oi");
			
			//Cuss Words
			playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", 				"rubbish");
			playerMessage = playerMessage.replaceAll("(?i)\\bbitch\\b", 			"cunt");
			playerMessage = playerMessage.replaceAll("(?i)\\bfuck off\\b", 			"on your bike");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucked\\b", 			"boffed");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucking\\b", 			"bloody");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucker\\b", 			"wanker");
			playerMessage = playerMessage.replaceAll("(?i)\\bfuck\\b", 				"boff");
			playerMessage = playerMessage.replaceAll("(?i)\\byour\\smom\\b", 		"the queen");
			playerMessage = playerMessage.replaceAll("(?i)\\bdick\\bb", 			"pecker");
			playerMessage = playerMessage.replaceAll("(?i)\\bpussy\\bb", 			"gash");
			
			//Common Phrases
			playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", 		"How are the crumpets mate?");
			playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", 		"stab that wanker");
			playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", 		"going to");
			playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", 			"Doth Thou");
			playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", 		" art thou");
			playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b",		 	"prithee");
			playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b",			"how doth");

			//Minecraft Related Terms you can be specific here
			playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", 			"have a game of fisticuffs");
			playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", 				"roundly defeat");
			playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", 			"motor car");
			playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", 			"roundly boffed");
			playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", 			"have a gentlemen's argument");
			playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", 				"the queens gold");
			playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", 				"wealthy");
			playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b",				"have tea and crumpets with");
			playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", 			"juice");
			playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", 			"round table");
			
			//Food Items
			playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", 				"tea and crumpets");
			playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", 				"Pork Crumpets");
			playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b",			"Tea and Chicken ");
			playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", 				"beef and crumpets");
			
			
			//Personal Addressing
			playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", 		"bloke ");
			playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", 		" peasant ");
			playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", 	"babys mamma");
			playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b",		"some ugly twit");
			playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", 		"mate");
			playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", 			" mum ");
			playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", 			" dad ");
			playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", 		"streetwalker");
			playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", 		" any of you bloody wankers");
			
			//Pronouns
			playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", 			"bird");
			playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", 			"bloke");
			playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", 			"that bloke");
			playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b",		    "that cunt ");
			playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", 			"that wanker");
			playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ",		    "that broad");
			playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", 			"me");
			playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", 			"me");
			playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", 			"thou");
			playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", 		"yor");
			playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", 			"yor");
			
			//Places
			playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", 		 	"Buckingham Palace");
			playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b",		 	"cottage");
			playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b",	 	"field peasant");
			playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", 		 	"lord's estate");
			playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", 		 	"the dungeon");
			playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b",      	"England");
			
			//Items
			playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", 		"British Stabber");
			playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", 		"buckled shoes");
			playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", 		"stacks");
			playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", 			"barnet");
			playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", 		"tophat");
			
			//Misc
			playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b",	"bloody well yes");			
			playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", 	"happening");				
			playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", 		"metric system and crumpets");				
			playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", 			"ale");				
			playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", 		"jig");
			playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", 		"bacon wankers");				
			playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", 		"lads");
			playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", 		"fifty and zero");
			playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", 		"Englishman Jogging");			
		    playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b",		    "hath"); 
			playerMessage = playerMessage.replaceAll("(?i)\\blord\\b",			"the Queen");				
			playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", 			" ye olde ");
			playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", 		"The Queen");			
			playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", 		"God Save the Queen");

		//Here we do British Grammar we do this last to see if we can get any words not in the list above
		//but not to affect the above words

		   // playerMessage = playerMessage.replaceAll("ing", "in'");
			
			//Set a random generic Prefix and Suffix for improved britfication
			
			Random generator = new Random();
			
			String prefix = britPrefixList[generator.nextInt(britPrefixList.length)];
			String suffix = britSuffixList[generator.nextInt(britSuffixList.length)];
			
			
			//Remove double spaces and Set the new Message

			playerMessage = playerMessage.replaceAll("  ", " ");
		    event.setMessage(prefix + playerMessage + suffix);
		
		
		
	}

}