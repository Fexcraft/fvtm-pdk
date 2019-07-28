package net.fexcraft.mod.addon.yourpack;

import net.fexcraft.mod.fvtm.data.addon.AddonClass;
import net.minecraftforge.fml.common.Mod;

@AddonClass(registryname = "fvtm:yourpack")
@Mod(modid = YourPackMainClass.MODID, name = YourPackMainClass.NAME, version = YourPackMainClass.VERSION, useMetadata = true, dependencies = "required-after:fcl;required-after:fvtm")
public class YourPackMainClass {
	
    public static final String MODID = "yourpack";
    public static final String NAME = "Your Pack Name Here";
    public static final String VERSION = "1.0";
    
    //This is actually registered as "Mod", as such you can, besides being an FVTM AddonPack, also do things normal mods do.
    
}
