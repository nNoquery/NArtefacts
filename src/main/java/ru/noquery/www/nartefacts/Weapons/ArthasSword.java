package ru.noquery.www.nartefacts.Weapons;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import ru.noquery.www.nartefacts.Base.BaseWeapon;
import ru.noquery.www.nartefacts.NArtefacts;
import java.util.ArrayList;
import java.util.List;

public class ArthasSword extends BaseWeapon  {
    public ArthasSword() {
        super(10,10,0, new NamespacedKey(NArtefacts.instance,
                        "ArthasSword"),
                Material.DIAMOND_SWORD,
                Component.text("АРТАС-УБИВАТОС!"), new ArrayList<>
                        (
                                List.of(Component.text("&6Счетчик убийств: 0"),
                                        Component.text("111"),
                                        Component.text("&611111"),
                                        Component.text("1111111"),
                                        Component.text("&6Лор"),
                                        Component.text("&6Лор")

                                )));
    }

}
