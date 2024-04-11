package ru.noquery.www.nartefacts.Events;

import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ru.noquery.www.nartefacts.NArtefacts;

import java.util.ArrayList;
import java.util.List;

public class WeaponEventListener implements Listener {
    private final List<NamespacedKey> listWeapons = new ArrayList<>(){
        {
            add(new NamespacedKey(NArtefacts.instance, "ArthasSword"));
        }
    };

    private boolean hasKey(ItemStack itemStack){
        if (itemStack == null) return false;
        ItemMeta itemMeta = itemStack.getItemMeta();
        if(itemMeta==null) return false;
        for(NamespacedKey key: itemMeta.getPersistentDataContainer().getKeys()){
            if(listWeapons.contains(key)) return true;
        }
        return false;
    }

//    @EventHandler
//    public void onDamage(PlayerItemDamageEvent playerItemDamageEvent){
//        ItemStack itemStack = playerItemDamageEvent.getItem();
//        if (hasKey(itemStack)) {
//            playerItemDamageEvent.setDamage(((BaseWeapon)itemStack).getDamage());
//        }
//    }
//    @EventHandler
//    public void updateStatTrack(EntityDeathEvent entityDeathEvent){
//
//        var killer = entityDeathEvent.getEntity().getKiller();
//
//        if(killer==null) return;
//        killer.sendMessage("После return");
//        ItemStack itemStack = killer.getInventory().getItemInMainHand();
//        if (itemStack.getItemMeta().getPersistentDataContainer().has(key)) {
//            statTrack++;
//            killer.sendMessage("После st++");
//            updateKillCount(itemStack);
//        }
//
//    }

}
