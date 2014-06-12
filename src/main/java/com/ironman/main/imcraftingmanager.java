package com.ironman.main;

import com.ironman.block.imblock;
import com.ironman.main.item.imitem;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


import cpw.mods.fml.common.registry.GameRegistry;

public class imcraftingmanager {

	public static void mainclass() {
		addCraftingRecipies();
		addSmeltingRecipies();
	}

	public static void addCraftingRecipies() {
		// Shaped Recipie
			GameRegistry.addRecipe(new ItemStack(imitem.goldtitaniumalloy,3), new Object[]{"GGG","GTG","GGG",'G',Items.gold_ingot,'T',imitem.titaniumalloy,
					});
			GameRegistry.addRecipe(new ItemStack(imitem.ironplate,2), new Object[]{"   ","II ","II ",'I',Items.iron_ingot,
			});
			GameRegistry.addRecipe(new ItemStack(imitem.titaniumplate,2), new Object[]{"TTT","TTT","TTT",'T',imitem.titaniumalloy,
			});
			GameRegistry.addRecipe(new ItemStack(imitem.rocket,1), new Object[]{"   ","FTF","FTF",'F',Items.flint_and_steel,'T',imitem.titaniumingot,
			});
			GameRegistry.addRecipe(new ItemStack(imitem.repulsor,1), new Object[]{"GCG","CGC","GCG",'G',Items.gunpowder,'C',imitem.copperwire,
			});
		 	GameRegistry.addRecipe(new ItemStack(imitem.titaniumalloy,4), new Object[]{"TTT","TTT","TTT",'T',imitem.titaniumingot,
         			});
		 	GameRegistry.addRecipe(new ItemStack(imitem.copperwire,1), new Object[]{"   ","CCC","   ",'C',imitem.copperingot,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.microchip,1), new Object[]{"III","CCC","III",'C',imitem.copperwire,'I',Items.iron_ingot,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.voicechip,1), new Object[]{"CCC","IMI","CCC",'C',imitem.copperwire,'I',Items.iron_ingot,'M',imitem.microchip,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.JARVISchip,1), new Object[]{"CCC","IVI","CCC",'C',imitem.copperwire,'I',Items.iron_ingot,'V',imitem.voicechip,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.screen,1), new Object[]{"GGG","GGG","GGG",'G',Blocks.stained_glass_pane,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.booster,1), new Object[]{"   ","R R","T T",'R',imitem.rocket,'T',imitem.titaniumingot,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.palladiumcore,1), new Object[]{"FFF","DFD","FFF",'F',imitem.palladiumfragment,'D',Items.diamond,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.vibraniumcore,1), new Object[]{"VVV","VVV","VVV",'V',imitem.vibraniummolecule,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.vibraniumarc,1), new Object[]{"VVV","VAV","VVV",'V',imitem.vibraniummolecule,'A',imitem.vibraniumcore,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.palladiumarc,1), new Object[]{"FFF","FPF","FFF",'F',imitem.palladiumfragment,'P',imitem.palladiumcore,
		            });
		    GameRegistry.addRecipe(new ItemStack(imitem.advancedbooster,1), new Object[]{"   ","RGR","C C",'R',imitem.rocket,'G',imitem.goldtitaniumalloy,'C',imitem.copperwire,
		            });
		    
		    //armor recipe
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark1Helmet,1), new Object[]{"III","I I","   ",'I',imitem.ironplate
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark1Chestplate,1), new Object[]{"A A","APA","AAA",'A',imitem.titaniumalloy,'P', imitem.palladiumarc
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark1Leggings,1), new Object[]{"PPP","A A","A A",'P',imitem.ironplate,'A',imitem.titaniumalloy
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark1Boots,1), new Object[]{"   ","A A","R R",'A',imitem.titaniumalloy,'R',imitem.rocket
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark2Helmet,1), new Object[]{"PSP","ISI","J  ",'P',imitem.titaniumplate,'I',imitem.ironplate,'J',imitem.JARVISchip,'S',imitem.screen
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark2Chestplate,1), new Object[]{"P P","PAP","PPP",'A',imitem.palladiumarc,'P',imitem.titaniumplate
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark2Leggings,1), new Object[]{"PPP","A A","A A",'P',imitem.titaniumplate,'A',imitem.titaniumalloy
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark2Boots,1), new Object[]{"   ","A A","B B",'A',imitem.titaniumalloy,'B',imitem.booster
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark3Helmet,1), new Object[]{"PSP","PSP","J  ",'P',imitem.titaniumplate,'S',imitem.screen,'J',imitem.JARVISchip
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark3Chestplate,1), new Object[]{"G G","GPG","GGG",'G',imitem.goldtitaniumalloy,'P',imitem.palladiumarc
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark3Leggings,1), new Object[]{"PPP","G G","G G",'P',imitem.titaniumplate,'G',imitem.goldtitaniumalloy
            });
		    GameRegistry.addRecipe(new ItemStack(imitem.Mark3Boots,1), new Object[]{"   ","A A","B B",'A',imitem.goldtitaniumalloy,'B',imitem.advancedbooster
            });
		    
		//Shapeless Recipie
	}

	public static void addSmeltingRecipies() {
		 GameRegistry.addSmelting(imblock.titaniumore, new ItemStack(imitem.titaniumingot, 1), 5F);
	        GameRegistry.addSmelting(imblock.copperore, new ItemStack(imitem.copperingot, 1), 5F);
	        
	}
}