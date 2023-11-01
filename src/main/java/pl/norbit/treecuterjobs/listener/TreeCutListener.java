package pl.norbit.treecuterjobs.listener;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import pl.norbit.treecuter.api.listeners.TreeCutEvent;
import pl.norbit.treecuterjobs.jobs.JobsService;

import java.util.Set;

public class TreeCutListener implements Listener {

    @EventHandler
    public void onTreeCut(TreeCutEvent e) {
        Set<Block> blocks = e.getBlocks();
        blocks.forEach(b -> JobsService.updateJobs(e.getPlayer(), b));
    }
}
