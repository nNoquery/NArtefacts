package ru.noquery.www.nartefacts.Interfaces;

import org.bukkit.potion.PotionEffect;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public interface LuckyWeapon {

    Random random = new Random();
    Map<PotionEffect, Integer> modifiersAttack = new HashMap<>();

    void addModifierAttack();

}
