package io.github.GoDieBawb.Bizukkit;


import java.util.HashSet;
import java.util.Set;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Bizukkit extends JavaPlugin implements Listener {
	
	Player      player;
	GhettoChat  ghettoClass   			  = new GhettoChat();
	LeetChat    leetClass                 = new LeetChat();
	BritChat    britClass    			  = new BritChat();
	RandomChat  randomClass   			  = new RandomChat();
	PirateChat  pirateClass 			  = new PirateChat();
	ClassyChat  classyClass 			  = new ClassyChat();
    SmileyChat  smileyClass               = new SmileyChat();
	
	Set<String> ghettoflaggedPlayers      = new HashSet<String>();
	Set<String> britFlaggedPlayers        = new HashSet<String>();
	Set<String> leetFlaggedPlayers        = new HashSet<String>();
	Set<String> pirateFlaggedPlayers      = new HashSet<String>();
	Set<String> randomFlaggedPlayers      = new HashSet<String>();
	Set<String> classyFlaggedPlayers      = new HashSet<String>();
    Set<String> smileyFlaggedPlayers      = new HashSet<String>();
	String      playerName;
	
	
	@Override
	public void onEnable() {		
		getServer().getPluginManager().registerEvents(this, this);
		ghettoClass.ghettoEnable();
		britClass.britEnable();
		pirateClass.PirateEnable();
		randomClass.RandomEnable();
		classyClass.ClassyEnable();
		
		
	}

	@Override
	public void onDisable() {
		
	}
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	
    	
    if(cmd.getName().equalsIgnoreCase("biz") && args.length > 0){
    	
    	if(args.length < 2){
    		playerName = sender.getName().toLowerCase();
    		
    		} else if (args.length > 3) {
    		sender.sendMessage("Too many arguments");

    		} else if (sender.hasPermission("bizukkit.other")) {
    		playerName = args[1].toLowerCase();

    		} else {
    		sender.sendMessage("You do not have permission to change another player's persona.");
    			
    		}
    	
    	if(args[0].equalsIgnoreCase("gangster") && sender.hasPermission("bizukkit.gangster")) {
    		
    		
    		if (ghettoflaggedPlayers.contains(playerName)){
    		  sender.sendMessage(playerName + " is no longer talking like a gangster!");
    		  ghettoflaggedPlayers.remove(playerName);

    		  } else {
              sender.sendMessage(playerName + " is now talking like a gangster!");
              ghettoflaggedPlayers.add(playerName);
    		  pirateFlaggedPlayers.remove(playerName);
    		  britFlaggedPlayers.remove(playerName);
    		  randomFlaggedPlayers.remove(playerName);
    		  leetFlaggedPlayers.remove(playerName);
    		  }

    		
  
    		} else if(args[0].equalsIgnoreCase("british") && sender.hasPermission("bizukkit.british")) {
        		
        		
        		if (britFlaggedPlayers.contains(playerName)){
        		  sender.sendMessage(playerName + " is no longer talking like you're British!");
        		  britFlaggedPlayers.remove(playerName);

        		  } else {
                  sender.sendMessage(playerName + " is now talking like you're British!");
                  britFlaggedPlayers.add(playerName);
                  ghettoflaggedPlayers.remove(playerName);
        		  pirateFlaggedPlayers.remove(playerName);
        		  randomFlaggedPlayers.remove(playerName);
        		  leetFlaggedPlayers.remove(playerName);
        		  }

        		  
 
    		} else if(args[0].equalsIgnoreCase("pirate") && sender.hasPermission("bizukkit.pirate")) {
        		
        		
        		if (pirateFlaggedPlayers.contains(playerName)){
        		  sender.sendMessage(playerName + " is no longer talking like a Pirate!");
        		  pirateFlaggedPlayers.remove(playerName);

        		  } else {
                  sender.sendMessage(playerName + " is now talking like a Pirate!");
                  pirateFlaggedPlayers.add(playerName);
                  ghettoflaggedPlayers.remove(playerName);
        		  britFlaggedPlayers.remove(playerName);
        		  randomFlaggedPlayers.remove(playerName);
        		  leetFlaggedPlayers.remove(playerName);
        		  classyFlaggedPlayers.remove(playerName);
        		  }
        		
        		  
        		  
    		} else if(args[0].equalsIgnoreCase("nonsense") && sender.hasPermission("bizukkit.nonsense")) {
        		
        		
        		if (randomFlaggedPlayers.contains(playerName)){
        		  sender.sendMessage(playerName + " is no longer talking nonsense");
        		  randomFlaggedPlayers.remove(playerName);

        		  } else {
                  sender.sendMessage(playerName + " is now talking nonsense");
                  randomFlaggedPlayers.add(playerName);
                  ghettoflaggedPlayers.remove(playerName);
        		  britFlaggedPlayers.remove(playerName);
        		  pirateFlaggedPlayers.remove(playerName);
        		  leetFlaggedPlayers.remove(playerName);
        		  classyFlaggedPlayers.remove(playerName);
        		  }
        		
        		  
    		} else if(args[0].equalsIgnoreCase("l33t") && sender.hasPermission("bizukkit.l33t")) {
        		
        		
        		if (leetFlaggedPlayers.contains(playerName)){
        		  sender.sendMessage(playerName + " is no longer speaking l33t!");
        		  leetFlaggedPlayers.remove(playerName);

        		  } else {
                  sender.sendMessage(playerName + " is now speaking l33t!");
                  leetFlaggedPlayers.add(playerName);
                  ghettoflaggedPlayers.remove(playerName);
        		  britFlaggedPlayers.remove(playerName);
        		  pirateFlaggedPlayers.remove(playerName);
        		  randomFlaggedPlayers.remove(playerName);
        		  classyFlaggedPlayers.remove(playerName);
        		  }

    		} else if(args[0].equalsIgnoreCase("rich") && sender.hasPermission("bizukkit.rich")) {
        		
        		
        		if (classyFlaggedPlayers.contains(playerName)){
        		  sender.sendMessage(playerName + " is no longer speaking like a rich guy!");
        		  classyFlaggedPlayers.remove(playerName);

        		  } else {
                  sender.sendMessage(playerName + " is now speaking like a rich guy!");
                  classyFlaggedPlayers.add(playerName);
                  ghettoflaggedPlayers.remove(playerName);
        		  britFlaggedPlayers.remove(playerName);
        		  pirateFlaggedPlayers.remove(playerName);
        		  randomFlaggedPlayers.remove(playerName);
        		  leetFlaggedPlayers.remove(playerName);
        		  }

    		} else if(args[0].equalsIgnoreCase("smiley") && sender.hasPermission("bizukkit.smiley")) {
        		
        		
        		if (smileyFlaggedPlayers.contains(playerName)){
        		  sender.sendMessage(playerName + " no longer has mega smiley!");
        		  smileyFlaggedPlayers.remove(playerName);

        		  } else {
                  sender.sendMessage(playerName + " now has mega smileys!");
                  smileyFlaggedPlayers.add(playerName);
                  classyFlaggedPlayers.remove(playerName);
                  ghettoflaggedPlayers.remove(playerName);
        		  britFlaggedPlayers.remove(playerName);
        		  pirateFlaggedPlayers.remove(playerName);
        		  randomFlaggedPlayers.remove(playerName);
        		  leetFlaggedPlayers.remove(playerName);
        		  }
        		  
        		
        		  //If Player doesn't have Permission
    			  } else {
    			  sender.sendMessage("You don't have permission to do that!");
    			
    			  }
		  		  return true;
		  		  
    			  } else {
    				//This Is Biz with No Arguments!!!  
    			  }
    
    
    			  return false; 		
       			  }
    
    
    


	
	@EventHandler
		public void onPlayerChat(AsyncPlayerChatEvent event){
		
		player = event.getPlayer();
		playerName = player.getName().toLowerCase();
		String playerMessage = event.getMessage();
		
		if (ghettoflaggedPlayers.contains(playerName)) {
			ghettoClass.makeGhetto(player, playerMessage, event);
			
			} else if (britFlaggedPlayers.contains(playerName)){
			britClass.makeBrit(player, playerMessage, event);
				
			} else if (pirateFlaggedPlayers.contains(playerName)){
			pirateClass.makePirate(player, playerMessage, event);
				
			} else if (randomFlaggedPlayers.contains(playerName)){
			randomClass.makeRandom(player, playerMessage, event);
				
			} else if (leetFlaggedPlayers.contains(playerName)){
			leetClass.makeLeet(player, playerMessage, event);
			
			} else if (classyFlaggedPlayers.contains(playerName)){
			classyClass.makeClassy(player, playerMessage, event);
			
			} else if (smileyFlaggedPlayers.contains(playerName)){
			smileyClass.makeSmiley(player, playerMessage, event);
			
			}		    
				
	}
		
}
		
