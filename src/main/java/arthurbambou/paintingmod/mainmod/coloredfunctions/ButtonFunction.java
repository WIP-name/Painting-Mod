package arthurbambou.paintingmod.mainmod.coloredfunctions;

import arthurbambou.paintingmod.mainmod.api.ColoredFunction;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.coloredblocks.ColoredButton;
import arthurbambou.paintingmod.mainmod.coloredblocks.ColoredFenceGate;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ButtonFunction extends ColoredFunction {
    public ButtonFunction(Identifier identifier) {
        super(identifier);
    }

    @Override
    public void paint(ItemUsageContext var1, ColoredObject coloredObject) {
        BlockPos pos = var1.getBlockPos();
        World worldIn = var1.getWorld();
        PlayerEntity player = var1.getPlayer();
        BlockState blockState = worldIn.getBlockState(pos);
        if (coloredObject instanceof ColoredButton
                && worldIn.getBlockState(pos).getBlock() == coloredObject.replace) {
            for (int a = 0; a < coloredObject.getArrayList().size(); a++) {
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PAINTBRUSHES.get(a + 1)) {
                    worldIn.setBlockState(pos, coloredObject.getArrayList().get(a).getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.field_11177, blockState.get(HorizontalFacingBlock.field_11177))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
            }
        }
    }

    @Override
    public void unPaint(ItemUsageContext var1, ColoredObject coloredObject) {
        BlockPos pos = var1.getBlockPos();
        World worldIn = var1.getWorld();
        PlayerEntity player = var1.getPlayer();
        BlockState blockState = worldIn.getBlockState(pos);
        if (coloredObject instanceof ColoredButton) {
            for (int b = 0; b < coloredObject.getArrayList().size(); b++) {
                if (worldIn.getBlockState(pos).getBlock() == coloredObject.getArrayList().get(b)) {
                    worldIn.setBlockState(pos, coloredObject.replace.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.field_11177, blockState.get(HorizontalFacingBlock.field_11177))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    heatgun(player.getStackInHand(Hand.MAIN));
                }
            }
        }
    }
}
