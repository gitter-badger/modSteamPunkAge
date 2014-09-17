package alekc.mods.steampunk.blocks;

import alekc.mods.steampunk.handlers.logHandler;
import alekc.mods.steampunk.registry.creativeTabs;
import alekc.mods.steampunk.registry.reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class copperOre extends Block
{
    public String name = "copperOre";
    public copperOre()
    {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(creativeTabs.SPA_TAB);
        this.setHardness(3F);
        this.setResistance(5F);
        this.setHarvestLevel("pickaxe", 1);
        this.setBlockTextureName(reference.MOD_ID.toLowerCase() + ":" + name);
        logHandler.info("Block " + reference.MOD_ID + ":" + name);
    }

}