package io.github.GoDieBawb.Bizukkit;


import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class SmileyChat {
	

	
	
	public void makeSmiley(Player player, String playerMessage, AsyncPlayerChatEvent event) {

		//A list of simple and common smileys that we make awesome
		
		playerMessage = playerMessage.replaceAll("(?i)\\bD:\\b",			"(ㆆ▃ㆆ)");
		playerMessage = playerMessage.replaceAll("(?i)\\b(:\\b",			"＼(＾O＾)／");
		playerMessage = playerMessage.replaceAll("(?i)\\b):\\b",			"(╥﹏╥)");
		playerMessage = playerMessage.replaceAll("(?i)\\broyal baby\\b",	"⁽⁽ :-)[▓▓] ლ(ö◡ö ლ)");
		playerMessage = playerMessage.replaceAll("(?i)\\bdongers\\b",		"ヽ༼ຈل͜ຈ༽ﾉ");
		playerMessage = playerMessage.replaceAll("(?i)\\bddos\\b",			"(۶ૈ ᵒ̌ Дᵒ̌)۶ૈ=͟͟͞͞ ⌨");
		playerMessage = playerMessage.replaceAll("(?i)\\bdeal with it\\b",	"(•_•) ( •_•)>⌐■-■ (⌐■_■)");
		playerMessage = playerMessage.replaceAll("(?i)\\by u no\\b",		"ლ(ಠ益ಠლ)");
		playerMessage = playerMessage.replaceAll("(?i)\\bdisapprove\\b",	"ಠ_ಠ");
		playerMessage = playerMessage.replaceAll("(?i)\\bhappy table\\b",	"┻━┻ ︵ ლ(⌒-⌒ლ)");
		playerMessage = playerMessage.replaceAll("(?i)\\bPooh\\b",			"ʕ •́؈•̀)");
		playerMessage = playerMessage.replaceAll("(?i)\\bfish\\b",			"<º))))><");
		playerMessage = playerMessage.replaceAll("(?i)\\bnixon\\b",			"✌(-‿-)✌");
		playerMessage = playerMessage.replaceAll("(?i)\\bkoala\\b",			"ʕ •ᴥ•ʔ");
		playerMessage = playerMessage.replaceAll("(?i)\\balien finger\\b",	"┌∩┐(◣_◢)┌∩┐");
		playerMessage = playerMessage.replaceAll("(?i)\\bshrug\\b",			"¯\\_(ツ)_/¯");
		playerMessage = playerMessage.replaceAll("(?i)\\bbear table\\b",	"ʕノ•ᴥ•ʔノ ︵ ┻━┻");
		playerMessage = playerMessage.replaceAll("(?i)\\bbear table\\b",	"(/ .□.)\\ ︵╰(゜Д゜)╯︵ /(.□. \\)");
		playerMessage = playerMessage.replaceAll("(?i)\\bspy\\b",			"┬┴┬┴┤(･_├┬┴┬┴");
		playerMessage = playerMessage.replaceAll("(?i)\\bbro fist\\b",		"(ó ì_í)=óò=(ì_í ò)");
		playerMessage = playerMessage.replaceAll("(?i)\\bpropose\\b",		"(   ° ᴗ°)~ð  (/❛o❛\\)");
		playerMessage = playerMessage.replaceAll("(?i)\\btasty\\b",			"(っ˘ڡ˘ς)");
		playerMessage = playerMessage.replaceAll("(?i)\\bstunner\\b",		"(⌐■_■)");
		playerMessage = playerMessage.replaceAll("(?i)\\bsparklez\\b",		"☆.。.:*・°☆.。.:*・°☆.。.:*・°☆.。.:*・°☆");
		playerMessage = playerMessage.replaceAll("(?i)\\bgun\\b",			"︻デ═一");
		playerMessage = playerMessage.replaceAll("(?i)\\bfinger\\\b",		"( ︶︿︶)_╭∩╮");
		playerMessage = playerMessage.replaceAll("(?i)\\byour right\\b",	"(☞ﾟ∀ﾟ)☞");
		playerMessage = playerMessage.replaceAll("(?i)\\bjust saying\\b",	"¬_¬");
		playerMessage = playerMessage.replaceAll("(?i)\\bwizard\\b",		"(∩｀-´)⊃━☆ﾟ.*･｡ﾟ");
		playerMessage = playerMessage.replaceAll("(?i)\\bthink\\b",			"♒((⇀‸↼))♒");
		playerMessage = playerMessage.replaceAll("(?i)\\bnazi star\\b",		"（ -.-）ノ-=≡≡卍");
		playerMessage = playerMessage.replaceAll("(?i)\\bping pong\\b",		"ヽ(^o^)ρ┳┻┳°σ(^o^)/");
			
			//Set the New Message

			playerMessage = playerMessage.replaceAll("  ", " ");
		    event.setMessage(playerMessage);
		
		
		
	}

}