package pl.norbit.treecuterjobs.listener;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import pl.norbit.treecuter.api.listeners.TreeCutEvent;
import pl.norbit.treecuterjobs.jobs.JobsService;

import java.util.List;

public class TreeCutListener implements Listener {

    @EventHandler
    public void onTreeCut(TreeCutEvent e) {
        List<Block> blocks = e.getBlocks();
        blocks.forEach(b -> JobsService.updateJobs(e.getPlayer(), b));
    }
}
