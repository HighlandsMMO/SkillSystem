package highlands.levelsystem;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LevelSystem extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new PlayJoinEvents(), this);


    }

    @Override
    public void onDisable() {



    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();

        System.out.println("Player : " + player.getName().toString());



    }


}
















