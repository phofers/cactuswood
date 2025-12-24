package net.phofers.cactuswood;

import net.blay09.mods.balm.platform.config.reflection.Comment;
import net.blay09.mods.balm.platform.config.reflection.Config;
import net.blay09.mods.balm.platform.config.reflection.NestedType;

import java.util.List;

@Config(CactusWood.MOD_ID)
public class CactusWoodConfig {

    @Comment("This is an example int property")
    public int exampleInt = 1234;

    @NestedType(String.class)
    @Comment("This is an example string list property")
    public List<String> exampleStringList = List.of("Hello", "World");
}
