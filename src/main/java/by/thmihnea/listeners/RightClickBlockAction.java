package by.thmihnea.listeners;

import by.thmihnea.Util;
import by.thmihnea.item.AzaleaItem;
import com.cryptomorin.xseries.XMaterial;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class RightClickBlockAction implements Listener {

    @EventHandler
    public void onRightClickBlock(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (e.getAction() != Action.RIGHT_CLICK_BLOCK) return;
        ItemStack itemStack = player.getItemInHand();
        if (itemStack == null || itemStack.getType() == XMaterial.AIR.parseMaterial()) return;
        AzaleaItem azaleaItem = Util.getItem(itemStack);
        if (azaleaItem == null) return;
        azaleaItem.rightClickBlockAction(player, e);
    }

}
