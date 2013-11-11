package io.github.GoDieBawb.Bizukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class LeetChat {
	
	
	
	public void makeLeet(Player player, String playerMessage, AsyncPlayerChatEvent event) {

		//Up Here We Write All the Words First So they aren't later replaced
		//With the Leetish Grammar
		// Order things So they will not mess up words ex. Farmer before Farm
		

		
			//Most common words first so these are replaced before it continues
		
		
			playerMessage = playerMessage.replaceAll("(?i)\\bfear\\b",			"phear");
			playerMessage = playerMessage.replaceAll("(?i)\\bat\\b",			"@");
			playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", 			"yoo");
			playerMessage = playerMessage.replaceAll("(?i)\\bhack\\b", 			"hax");
			playerMessage = playerMessage.replaceAll("(?i)\\bhi|hello\\b", 		"hai der");
			playerMessage = playerMessage.replaceAll("(?i)\\bto|two|too\\b", 	"2");;
			
			
			//Charactar Map

			playerMessage = playerMessage.replaceAll("(?i)a", 			"@");
			playerMessage = playerMessage.replaceAll("(?i)b", 			"13");
			playerMessage = playerMessage.replaceAll("(?i)c", 			"[");
			playerMessage = playerMessage.replaceAll("(?i)d", 			"[)");
			playerMessage = playerMessage.replaceAll("(?i)e", 			"3");
			playerMessage = playerMessage.replaceAll("(?i)f", 			"ph");
			playerMessage = playerMessage.replaceAll("(?i)g", 			"6");
			playerMessage = playerMessage.replaceAll("(?i)h",			"|-|");
			playerMessage = playerMessage.replaceAll("(?i)i", 			"1");
			playerMessage = playerMessage.replaceAll("(?i)j", 			"_/");
			playerMessage = playerMessage.replaceAll("(?i)k", 			"|<");
			playerMessage = playerMessage.replaceAll("(?i)l", 			"|_");
			playerMessage = playerMessage.replaceAll("(?i)m", 			"/\\\\/\\\\");
			playerMessage = playerMessage.replaceAll("(?i)n",			"/\\\\/");
			playerMessage = playerMessage.replaceAll("(?i)o", 			"0");
			playerMessage = playerMessage.replaceAll("(?i)p", 			"|>");
			playerMessage = playerMessage.replaceAll("(?i)q", 			"(,)");
			playerMessage = playerMessage.replaceAll("(?i)r", 			"r");
			playerMessage = playerMessage.replaceAll("(?i)s",			"z");
			playerMessage = playerMessage.replaceAll("(?i)t", 			"+");
			playerMessage = playerMessage.replaceAll("(?i)u", 			"\\\\_/");
			playerMessage = playerMessage.replaceAll("(?i)v", 			"\\\\/");
			playerMessage = playerMessage.replaceAll("(?i)w", 			"\\\\/\\\\/");
			playerMessage = playerMessage.replaceAll("(?i)x", 			"><");
			playerMessage = playerMessage.replaceAll("(?i)y", 			"¥");
			playerMessage = playerMessage.replaceAll("(?i)z", 			"z");

		//Here we do l33tish Grammar we do this last to see if we can get any words not in the list above
		//but not to affect the above words

			playerMessage = playerMessage.replaceAll("(?i)cks", 				"x");
			playerMessage = playerMessage.replaceAll("(?i)er", 					"zor");
			playerMessage = playerMessage.replaceAll("(?i)or", 					"xor");
			playerMessage = playerMessage.replaceAll("(?i)ur", 					"x0l0n1u$");
			
			
			//Remove double spaces and Set the new Message

			playerMessage = playerMessage.replaceAll("  ", " ");
		    event.setMessage(playerMessage);
		
		
		
	}

}