package alekc.mods.steampunk.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class creativeTabs
{
   public static final CreativeTabs SPA_TAB = new CreativeTabs(reference.MOD_ID.toLowerCase())
   {
       @Override
       public Item getTabIconItem()
       {
           return Item.getItemFromBlock(blocks.copperOre);
       }
   };
}

