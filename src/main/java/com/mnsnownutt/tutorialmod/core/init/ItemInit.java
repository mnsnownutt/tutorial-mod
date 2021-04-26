package com.mnsnownutt.tutorialmod.core.init;

import com.mnsnownutt.tutorialmod.TutorialModMain;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, TutorialModMain.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register(
            "wrench", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    //block items
    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register(
            "bismuth", ()-> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(),new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

}
