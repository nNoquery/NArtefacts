package ru.noquery.www.nartefacts.Base;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class BaseWeapon {

    protected int damage;
    protected int durability;
    protected int statTrack;
    protected NamespacedKey key;
    protected ItemStack item;


    public BaseWeapon(int damage, int durability, int statTrack, NamespacedKey key, Material material, Component name, List<Component> lore) {
        this.damage = damage;
        this.durability = durability;
        this.statTrack = statTrack;
        this.key = key;
        buildItem(material, name, lore);
    }


    public void doDamage(@NotNull LivingEntity entity) {
        entity.setHealth(entity.getHealth()-damage);
    }

    private void buildItem(Material material, Component name, List<? extends Component> lore){
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.lore(lore);
        itemMeta.displayName(name);
        itemStack.setItemMeta(itemMeta);
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
    public NamespacedKey getKey() {
       return key;
    }
}
