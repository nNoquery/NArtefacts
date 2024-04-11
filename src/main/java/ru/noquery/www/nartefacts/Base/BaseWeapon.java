package ru.noquery.www.nartefacts.Base;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import ru.noquery.www.nartefacts.NArtefacts;

import java.util.List;

public abstract class BaseWeapon implements Listener {

    protected int damage;
    protected int durability;
    protected int statTrack;
    protected NamespacedKey key;
    protected ItemStack item;
    protected List<Component> lore;


    public BaseWeapon(int damage, int durability, int statTrack, NamespacedKey key, Material material, Component name, List<Component> lore) {
        this.damage = damage;
        this.durability = durability;
        this.statTrack = statTrack;
        this.key = key;
        this.lore = lore;
        buildItem(material, name, lore);
        NArtefacts.instance.getServer().getPluginManager().registerEvents(this, NArtefacts.instance);
    }

    private void buildItem(Material material, Component name, List<? extends Component> lore){
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.lore(lore);
        itemMeta.displayName(name);
        itemMeta.getPersistentDataContainer().set(key, PersistentDataType.BOOLEAN, true);
        itemStack.setItemMeta(itemMeta);
        itemStack.setDurability((short) durability);
        item = itemStack;
    }

    public ItemStack getItem() {
        return item;
    }

    public int getDamage() {
        return  damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDurability(int durability){
        this.durability = durability;
    }
    public int getDurability() {
        return  durability;
    }
    public int getStatTrack(){
        return statTrack;
    }
    public void setStatTrack(int statTrack){
        this.statTrack = statTrack;
    }
    public void updateKillCount(ItemStack item) {
        String m =  ((TextComponent)lore.get(0)).content();
        lore.set(0, Component.text(m.replace(statTrack-1+"", statTrack+"")));
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.lore(lore);
        item.setItemMeta(itemMeta);

    }
    public NamespacedKey getKey() {
       return key;
    }

}
