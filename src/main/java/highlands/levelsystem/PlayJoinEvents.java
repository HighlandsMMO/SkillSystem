package highlands.levelsystem;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListTransducedAccessorImpl;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayJoinEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        if(event.getPlayer().isOp())
        {
            Player p = event.getPlayer();
            event.setJoinMessage( ChatColor.AQUA +  "The Big Boss Has Joined The Game " + ChatColor.RED + "Watch Out");
        }
    }



}
