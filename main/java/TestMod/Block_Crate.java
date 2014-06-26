package TestMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Block_Crate extends Block {

	protected Block_Crate(Material material) {
		super(material);
		setBlockName("Block_Crate");
		setBlockTextureName("TestMod:Template_Crate");
		setHardness(4.0F);
	}
	
	public Item itemDropped = null;
	private int quantityDropped = 0;
	
	@Override
	   public Item getItemDropped(int metadata, Random random, int fortune)
	   {     
	      switch(random.nextInt(28))
	      {
	      case 0: case 1: case 2: case 3: case 4: case 5:
	            itemDropped = Item.getItemFromBlock(Blocks.grass);
	            System.out.println("5 or under");
	         break;
	      case 6: case 7: case 8:case 9: case 10:
	          itemDropped = Item.getItemFromBlock(Blocks.cobblestone);
	          System.out.println("6 to 10");
	         break;
	      case 11: case 12: case 13:case 14: case 15:
	          itemDropped = Item.getItemFromBlock(Blocks.sandstone);
	          System.out.println("11 to 15");
	         break;
	      case 16: case 17: case 18: case 19: case 20:
	          itemDropped = Item.getItemFromBlock(Blocks.wool);
	          System.out.println("16 to 20");
	         break;
	      case 21: case 22: case 23: case 24: case 25:
	          itemDropped = Item.getItemFromBlock(Blocks.bookshelf);
	          System.out.println("21 to 25");
	         break;
	      case 26: case 27: case 28:
	         itemDropped = Item.getItemFromBlock(Blocks.diamond_block);
	         System.out.println("26 to 28");
	         break;
	      }
		return itemDropped;
		}
	
	@Override
    public int quantityDropped(int meta, int fortune, Random random)
{
	if(itemDropped == Item.getItemFromBlock(Blocks.grass))
	{
		quantityDropped = 1;
		
	} else {
		
		quantityDropped = 16;
		
	}
	return quantityDropped;
}	
	
}
