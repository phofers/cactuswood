package net.phofers.cactuswood.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static net.phofers.cactuswood.CactusWood.id;

public class ModItemTags {
    public static final TagKey<Item> YOUR_TAG = TagKey.create(Registries.ITEM, id("your_tag"));
}
