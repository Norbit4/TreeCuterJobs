package pl.norbit.treecuterjobs;

import org.bukkit.plugin.java.JavaPlugin;
import pl.norbit.treecuterjobs.listener.TreeCutListener;

public final class TreeCuterJobs extends JavaPlugin {

    private static TreeCuterJobs instance;
    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new TreeCutListener(), this);
    }

    public static TreeCuterJobs getInstance() {
        return instance;
    }
}
