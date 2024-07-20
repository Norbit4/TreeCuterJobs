package pl.norbit.treecuterjobs.jobs;


import com.gamingmesh.jobs.Jobs;
import com.gamingmesh.jobs.actions.BlockActionInfo;
import com.gamingmesh.jobs.container.ActionType;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class JobsService {
    private JobsService() {
        throw new IllegalStateException("Utility class");
    }

    public static void updateJobs(Player p, Block block){
        if(p == null){
            return;
        }

        var jPlayer = Jobs.getPlayerManager().getJobsPlayer(p);
        if(jPlayer != null){
            Jobs.action(jPlayer, new BlockActionInfo(block, ActionType.BREAK), block);
        }
    }
}
