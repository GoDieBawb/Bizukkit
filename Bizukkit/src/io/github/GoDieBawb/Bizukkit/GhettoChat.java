package io.github.GoDieBawb.Bizukkit;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class GhettoChat {
	
	String[]    ghettoPrefixList;
	String[]    ghettoSuffixList;
	
	public void ghettoEnable(){
		   ghettoPrefixList = new String[] { 
				   "What up ", 
				   "My niggahs ", 
				   "Yo bitches ",
				   "Aye niggahs ",
				   "Aye ",
				   "Yo pimps ",
				   "Hey ya'll ",
				   "Wut up yo ",
				   " ",
				   " ", 
				   " ", 
				   " ",
				   " ",
		   		   };
		   
		   ghettoSuffixList = new String[] {
				   " put dat on yo toast",
				   " muthah fuckah",
				   " in this bitch",
				   " my niggah",
				   " niggah",
				   " ya dig?",
				   " aight?",
				   " ",
				   " ",
				   " ",
		   		   };
	}
	
	
	public void makeGhetto(Player player, String playerMessage, AsyncPlayerChatEvent event) {

		//Up Here We Write All the Words First So they aren't later replaced
		//With the Ebonic Grammar
		// Order things So they will not mess up words ex. Farmer before Farm
		

		
			//Most common words first so these are replaced before it continues
		playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b",			"da");
		playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", 		"whats crackin");
		playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", 		"Cya");
		playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", 			"gotz");
		playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", 			" gotz ");
		playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", 			"dat");
		playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", 			"dis");
		playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b",	 		"thang");
		playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", 			"ain't");
		playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", 		"ain't");
		playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", 			"bomb");
		playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", 			"boo boo");
		playerMessage = playerMessage.replaceAll("(?i)\\band\\b", 			"'n'");
		playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", 		"shit");
		playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b",	"my bad");
		playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", 			"shiznit");
		playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", 		"Ight");
		playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", 		"beef");
		playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", 		"dealing");
		playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", 			"deal");
		playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", 			"pimp");
		playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", 		"how tha fuck to");
		playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", 			"pimped out");
		playerMessage = playerMessage.replaceAll("(?i)\\bany", 				" any muthah fuckin");
		playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", 			"holy mutha fuckin shit");
		playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", 			"dayum");
		playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", 			"mutha fuckin rocks");
		playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", 		"hollah at");
		playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", 			"yo");
		
		//Common Phrases
		playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", 		"whats crackin");
		playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shimself\\b", 	" peel his own cap back ");
		playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", 		" peel his cap back ");
		playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", 		"fitna");
		playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", 			"does you");
		playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", 		" is you");
		playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b",		 	"you's about to");
		playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b",			"how does");

		//Minecraft Related Terms you can be specific here
		playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", 			"catch a fade");
		playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", 				"drop");
		playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", 			"Pimpmobile");
		playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", 			"fucked up");
		playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", 			"drive by");
		playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", 				"bling");
		playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", 				"ballin'");
		playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b",				"give welfare to");
		playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", 			"juice");
		playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", 			"gang");
		playerMessage = playerMessage.replaceAll("(?i)\\bwood\\b", 				"treeshizzle");
		playerMessage = playerMessage.replaceAll("(?i)\\bsapling\\b", 			"tree baby");
		
		//Food Items
		playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", 				"cornbread and watermelon");
		playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", 				"hamhawkes");
		playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b",			"Kentucky mo fuckin' fried Chicken");
		playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", 				"beefshizzle");
		
		
		//Personal Addressing
		playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", 		"pimp ");
		playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", 		" play hata");
		playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", 	"babys mamma");
		playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b",		"some nigguh");
		playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", 		"homie");
		playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", 			" baby's mama ");
		playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", 			" baby's daddy ");
		playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", 		"ho");
		playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", 		" any of you dumb nigguhs");
		
		//Pronouns
		playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", 			"bitch");
		playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", 			"nigga");
		playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", 			"that nigga");
		playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b",		    "dis bitch ");
		playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", 			"dat nigguh");
		playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ",		    "dat biatch");
		playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", 			"this nigguh's");
		playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", 			"this nigguh's");
		playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", 			"y'all");
		playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", 		"yo'ass is");
		playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", 			"yo'");
		
		//Places
		playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", 		 	"hood");
		playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b",		 	"crib");
		playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b",	 	"SlaveOwner");
		playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", 		 	"plantation");
		playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", 		 	"the brick");
		playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b",      	"hood");
		
		//Items
		playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", 		"strap");
		playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", 		"jordans");
		playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", 		"stacks");
		playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", 			"weave");
		playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", 		"snapback");
		
		//Misc
		playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", 			"pimped out");
		playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b",	"hell yeah");			
		playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", 	"poppin' off");				
		playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", 		"digits");				
		playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", 			"Fo'ty");				
		playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", 		"twerk");
		playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", 		"PoPo");				
		playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", 		"churrin");
		playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", 		"fitty");
		playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", 		"bookin' it");			
	    playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b",		    "gotz"); 
		playerMessage = playerMessage.replaceAll("(?i)\\blord\\b",			 "lawdy");
		playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", 			" old-ass ");
		playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", 		"Black Jesus");			
		playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", 		"Oh Lawdy");

		//Here we do Ebonic Grammar we do this last to see if we can get any words not in the list above
		//but not to affect the above words

		    playerMessage = playerMessage.replaceAll("ing", "in'");
		
		    playerMessage = playerMessage.replaceAll("oth", "uth");
		    
		    playerMessage = playerMessage.replaceAll("er ", "ah ");
		    
		    playerMessage = playerMessage.replaceAll("ar ", "ah ");
		    
			playerMessage = playerMessage.replaceAll("ore ", "o' ");
			
			//Set a random generic Prefix and Suffix for improved ghettofication
			
			Random generator = new Random();
			
			String prefix = ghettoPrefixList[generator.nextInt(ghettoPrefixList.length)];
			String suffix = ghettoSuffixList[generator.nextInt(ghettoSuffixList.length)];
			
			
			//Remove double spaces and Set the new Message

			playerMessage = playerMessage.replaceAll("  ", " ");
		    event.setMessage(prefix + playerMessage + suffix);
		
		
		
	}

}
