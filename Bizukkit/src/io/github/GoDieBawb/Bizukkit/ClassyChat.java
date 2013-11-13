package io.github.GoDieBawb.Bizukkit;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ClassyChat {
	
	String[]    ClassyPrefixList;
	String[]    ClassySuffixList;
	
	public void ClassyEnable(){
		   ClassyPrefixList = new String[] { 
				   "Tell my accountant  ", 
				   "The market is up and ", 
				   "Excuse me Sir, ",
				   "Fetch me my yacht and ",
				   "Good day sir  ",
				   "Hello my good man, ",
				   "",
				   " ",
				   " ", 
				   " ", 
				   " ",
				   " ",
		   		   };
		   
		   ClassySuffixList = new String[] {
				   " and send one million to the railroad",
				   " and a glass of champagne",
				   " then purchase me a poor person",
				   " and sell my stocks",
				   " and fire my employees",
				   " and check my portfolio",
				   " my good man",
				   " then call my broker",
				   " then a round of polo",
				   " ",
				   " ",
				   " ",
				   
		   		   };
	}
	
	
	public void makeClassy(Player player, String playerMessage, AsyncPlayerChatEvent event) {

		//Up Here We Write All the Words First So they aren't later replaced
		//With the Classyish Grammar
		// Order things So they will not mess up words ex. Farmer before Farm
		

		
			//Most common words first so these are replaced before it continues
		
		
			playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b",			"the");
			playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", 		"salutations");
			playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", 		"farewell");
			playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", 			"possess");
			playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", 			" has ");
			playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", 			"that");
			playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", 			"this");
			playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b",	 		"object");
			playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", 			"is not");
			playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", 		"are not");
			playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", 			"refined");
			playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", 			"unsuitable");
			playerMessage = playerMessage.replaceAll("(?i)\\band\\b", 			"and furthermore ");
			playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", 		"stocks");
			playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b",	"I apologize");
			playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", 		"alright");
			playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", 		"quandary");
			playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", 		"trading");
			playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", 			"trade");
			playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", 			"invest");
			playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", 		"how to");
			playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", 			"modern");
			playerMessage = playerMessage.replaceAll("(?i)\\bany", 				" any");
			playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", 			"marvelous");
			playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", 			"curses");
			playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", 			"raw materials");
			playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", 		"inform");
			playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", 			"greetings");
			
			//Cuss Words
			playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", 				"rubbish");
			playerMessage = playerMessage.replaceAll("(?i)\\bbitch\\b", 			"classy escort");
			playerMessage = playerMessage.replaceAll("(?i)\\bfuck off\\b", 			"youre fired");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucked\\b", 			"boffed");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucking\\b", 			"bloody");
			playerMessage = playerMessage.replaceAll("(?i)\\bfucker\\b", 			"impoverished individual");
			playerMessage = playerMessage.replaceAll("(?i)\\bfuck\\b", 				"fancily fuck");
			playerMessage = playerMessage.replaceAll("(?i)\\byour\\smom\\b", 		"your working-class mother");
			playerMessage = playerMessage.replaceAll("(?i)\\bdick\\bb", 			"assistant");
			playerMessage = playerMessage.replaceAll("(?i)\\bpussy\\bb", 			"coitus");
			
			//Common Phrases
			playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", 		"How are you my good man?");
			playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", 		"put him out of business");
			playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", 		"going to");
			playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", 			"you");
			playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", 		"are you");
			playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b",		 	"Ill pay you to");
			playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b",			"how does");

			//Minecraft Related Terms you can be specific here
			playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", 			"have a game of fisticuffs");
			playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", 				"fire");
			playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", 			"limosine");
			playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", 			"liquidated");
			playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", 			"have a gentlemen's argument");
			playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", 				"pocket change");
			playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", 				"wealthy");
			playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b",				"have champagne and cavier");
			playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", 			"wealth");
			playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", 			"corporation");
			
			//Food Items
			playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", 				"entree");
			playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", 				"pork and lobster");
			playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b",			"chicken a la mode");
			playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", 				"steak");
			
			
			//Personal Addressing
			playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", 		"laborer");
			playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", 		"peasant");
			playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", 	"mistress");
			playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b",		"some ugly twit");
			playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", 		"board member");
			playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", 			"mother");
			playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", 			"father");
			playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", 		"escort");
			playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", 		"any of you common people");
			
			//Pronouns
			playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", 			"lady");
			playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", 			"gentleman");
			playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", 			"the gentleman");
			playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b",		    "the lady");
			playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", 			"him");
			playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ",		    "her");
			playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", 			"my");
			playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", 			"me");
			playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", 			"you");
			playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", 		"you, my good man, are");
			playerMessage = playerMessage.replaceAll("(?i)\\byours\\b", 		"mine");
			playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", 			"my");
			
			//Places
			playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", 		 	"Wall Street");
			playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b",		 	"mansion");
			playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b",	 	"laborer");
			playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", 		 	"estate");
			playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", 		 	"vacation home");
			playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b",      	"my portfolio");
			
			//Items
			playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", 		"sabre");
			playerMessage = playerMessage.replaceAll("(?i)\\bboot\\b", 			"loafer");
			playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", 		"currency");
			playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", 			"locks");
			playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", 		"tophat");
			
			//Misc
			playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b",	"very good sir");			
			playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", 	"happening");				
			playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", 		"quote");				
			playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", 			"champagne");				
			playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", 		"waltz");
			playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", 		"subordinates");				
			playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", 		"lads");
			playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", 		"fifty and zero");
			playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", 		"strolling");			
		    playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b",		    "in possession"); 
			playerMessage = playerMessage.replaceAll("(?i)\\blord\\b",			"Hedgefund Manager");				
			playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", 			"antique");
			playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", 		"CEO");			
			playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", 		"Money");

		//Here we do Classyish Grammar we do this last to see if we can get any words not in the list above
		//but not to affect the above words

		   // playerMessage = playerMessage.replaceAll("ing", "in'");
			
			//Set a random generic Prefix and Suffix for improved Classyfication
			
			Random generator = new Random();
			
			String prefix = ClassyPrefixList[generator.nextInt(ClassyPrefixList.length)];
			String suffix = ClassySuffixList[generator.nextInt(ClassySuffixList.length)];
			
			
			//Remove double spaces and Set the new Message

			playerMessage = playerMessage.replaceAll("  ", " ");
		    event.setMessage(prefix + playerMessage + suffix);
		
		
		
	}

}
