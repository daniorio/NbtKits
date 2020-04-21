package ml.luxinfine;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Death implements Listener {

	public kits plugin;
	public Death(kits kits) {
		this.plugin = kits;
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent e) throws IOException {
		Player p = e.getPlayer();
		if(!p.hasPlayedBefore()) if(e.getPlayer().hasPermission("kits.starter")) InventoryNBTSer.getKit(p, plugin.folder, "starter", true);
	}
}
