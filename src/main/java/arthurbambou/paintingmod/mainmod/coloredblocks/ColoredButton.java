package arthurbambou.paintingmod.mainmod.coloredblocks;

import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.minecraft.block.Block;

public abstract class ColoredButton extends ColoredObject {
    public ColoredButton(String name, Block replace, String modid) {
        super(name, replace, modid);
    }
}
