package com.ironman.item;

import com.ironman.block.IMBlock;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


import cpw.mods.fml.common.registry.GameRegistry;

public class IMCraftingRegistry {


    public static void addAll(){
        addCraftingRecipies();
        addSmeltingRecipies();
    }

	public static void addCraftingRecipies() {
		// Shaped Recipie
			GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.goldtitaniumalloy,3), new Object[]{"GGG","GTG","GGG",'G',Items.gold_ingot,'T', IMItemRegistryOld.titaniumalloy,
					});
			GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.ironplate,2), new Object[]{"   ","II ","II ",'I',Items.iron_ingot,
			});
			GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.titaniumplate,2), new Object[]{"TTT","TTT","TTT",'T', IMItemRegistryOld.titaniumalloy,
			});
			GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.rocket,1), new Object[]{"   ","FTF","FTF",'F',Items.flint_and_steel,'T', IMItemRegistryOld.titaniumingot,
			});
			GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.repulsor,1), new Object[]{"GCG","CGC","GCG",'G',Items.gunpowder,'C', IMItemRegistryOld.copperwire,
			});
		 	GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.titaniumalloy,4), new Object[]{"TTT","TTT","TTT",'T', IMItemRegistryOld.titaniumingot,
         			});
		 	GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.copperwire,1), new Object[]{"   ","CCC","   ",'C', IMItemRegistryOld.copperingot,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.microchip,1), new Object[]{"III","CCC","III",'C', IMItemRegistryOld.copperwire,'I',Items.iron_ingot,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.voicechip,1), new Object[]{"CCC","IMI","CCC",'C', IMItemRegistryOld.copperwire,'I',Items.iron_ingot,'M', IMItemRegistryOld.microchip,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.JARVISchip,1), new Object[]{"CCC","IVI","CCC",'C', IMItemRegistryOld.copperwire,'I',Items.iron_ingot,'V', IMItemRegistryOld.voicechip,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.screen,1), new Object[]{"GGG","GGG","GGG",'G',Blocks.stained_glass_pane,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.booster,1), new Object[]{"   ","R R","T T",'R', IMItemRegistryOld.rocket,'T', IMItemRegistryOld.titaniumingot,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.palladiumcore,1), new Object[]{"FFF","DFD","FFF",'F', IMItemRegistryOld.palladiumfragment,'D',Items.diamond,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.vibraniumcore,1), new Object[]{"VVV","VVV","VVV",'V', IMItemRegistryOld.vibraniummolecule,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.vibraniumarc,1), new Object[]{"VVV","VAV","VVV",'V', IMItemRegistryOld.vibraniummolecule,'A', IMItemRegistryOld.vibraniumcore,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.palladiumarc,1), new Object[]{"FFF","FPF","FFF",'F', IMItemRegistryOld.palladiumfragment,'P', IMItemRegistryOld.palladiumcore,
		            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.advancedbooster,1), new Object[]{"   ","RGR","C C",'R', IMItemRegistryOld.rocket,'G', IMItemRegistryOld.goldtitaniumalloy,'C', IMItemRegistryOld.copperwire,
		            });
		    
		    //armor recipe
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark1Helmet,1), new Object[]{"III","I I","   ",'I', IMItemRegistryOld.ironplate
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark1Chestplate,1), new Object[]{"A A","APA","AAA",'A', IMItemRegistryOld.titaniumalloy,'P', IMItemRegistryOld.palladiumarc
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark1Leggings,1), new Object[]{"PPP","A A","A A",'P', IMItemRegistryOld.ironplate,'A', IMItemRegistryOld.titaniumalloy
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark1Boots,1), new Object[]{"   ","A A","R R",'A', IMItemRegistryOld.titaniumalloy,'R', IMItemRegistryOld.rocket
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark2Helmet,1), new Object[]{"PSP","ISI","J  ",'P', IMItemRegistryOld.titaniumplate,'I', IMItemRegistryOld.ironplate,'J', IMItemRegistryOld.JARVISchip,'S', IMItemRegistryOld.screen
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark2Chestplate,1), new Object[]{"P P","PAP","PPP",'A', IMItemRegistryOld.palladiumarc,'P', IMItemRegistryOld.titaniumplate
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark2Leggings,1), new Object[]{"PPP","A A","A A",'P', IMItemRegistryOld.titaniumplate,'A', IMItemRegistryOld.titaniumalloy
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark2Boots,1), new Object[]{"   ","A A","B B",'A', IMItemRegistryOld.titaniumalloy,'B', IMItemRegistryOld.booster
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark3Helmet,1), new Object[]{"PSP","PSP","J  ",'P', IMItemRegistryOld.titaniumplate,'S', IMItemRegistryOld.screen,'J', IMItemRegistryOld.JARVISchip
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark3Chestplate,1), new Object[]{"G G","GPG","GGG",'G', IMItemRegistryOld.goldtitaniumalloy,'P', IMItemRegistryOld.palladiumarc
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark3Leggings,1), new Object[]{"PPP","G G","G G",'P', IMItemRegistryOld.titaniumplate,'G', IMItemRegistryOld.goldtitaniumalloy
            });
		    GameRegistry.addRecipe(new ItemStack(IMItemRegistryOld.Mark3Boots,1), new Object[]{"   ","A A","B B",'A', IMItemRegistryOld.goldtitaniumalloy,'B', IMItemRegistryOld.advancedbooster});
		    
		//Shapeless Recipie
	}

	public static void addSmeltingRecipies() {
		 GameRegistry.addSmelting(IMBlock.titaniumore, new ItemStack(IMItemRegistryOld.titaniumingot, 1), 5F);
	        GameRegistry.addSmelting(IMBlock.copperore, new ItemStack(IMItemRegistryOld.copperingot, 1), 5F);
	        
	}
}