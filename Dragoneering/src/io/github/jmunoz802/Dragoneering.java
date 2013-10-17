package io.github.jmunoz802;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Dragoneering extends JavaPlugin {

	private FileConfiguration pconfig;
	
	@Override
    public void onEnable(){
		if(pconfig.equals(null))
			pconfig = getConfig();
		else{
			reloadConfig();
			pconfig = getConfig();
		}
        getLogger().info("Dragoneering has been enabled");
    }
 
    @Override
    public void onDisable() {
        this.saveConfig();
        getLogger().info("Dragoneering has been disabled");
    }
	
    public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args){
    	
    	if(sender instanceof Player && sender.hasPermission("warp.*")){
    		
    		if(cmd.getName().equalsIgnoreCase("warp") && sender.hasPermission("warp.use")){
    			if(args.length > 1 || args.length == 0){
    				sender.sendMessage("Incorrect usage of /warp cmd");
    				return false;
    			}
    				
    		}
    		
    		if(cmd.getName().equalsIgnoreCase("create") && sender.hasPermission("warp.create")){
    			if(args.length > 1 || args.length == 0){
    				sender.sendMessage("Incorrect usage of /create cmd");
    				return false;
    			}
    			
    		}
    		
    		if(cmd.getName().equalsIgnoreCase("delete")  && sender.hasPermission("warp.delete")){
    			if(args.length > 1 || args.length == 0){
    				sender.sendMessage("Incorrect usage of /delete cmd");
    				return false;
    			}
    			
    		}
    		
    		if(cmd.getName().equalsIgnoreCase("opcreate")  && sender.hasPermission("warp.opcreate")){
    			if(args.length > 1 || args.length == 0){
    				sender.sendMessage("Incorrect usage of /opcreate cmd");
    				return false;
    			}
    		}
    		
    		if(cmd.getName().equalsIgnoreCase("return") && sender.hasPermission("warp.return")){
    			if(args.length > 1){
    				sender.sendMessage("Incorrect usage of /return cmd");
    				return false;
    			}
    		}
    	
    	}
    	return false;
    }
    
}
