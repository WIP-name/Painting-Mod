package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.registery.ModItems;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.platform.GlStateManager;
import me.shedaniel.rei.api.IRecipeCategory;
import me.shedaniel.rei.gui.widget.IWidget;
import me.shedaniel.rei.gui.widget.ItemSlotWidget;
import me.shedaniel.rei.gui.widget.RecipeBaseWidget;
import me.shedaniel.rei.listeners.IMixinContainerGui;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GuiLighting;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.util.List;

public class CategoryHammer implements IRecipeCategory<DisplayHammer> {

    private static final Identifier DISPLAY_TEXTURE = new Identifier("paintingmod", "textures/gui/hammerdisplay.png");
    @Override
    public Identifier getIdentifier() {
        return PaintingModPlugin.HAMMER;
    }

    @Override
    public ItemStack getCategoryIcon() {
        return new ItemStack(ModItems.HAMMER);
    }

    @Override
    public String getCategoryName() {
        return I18n.translate("category.paintingmod.hammer");
    }

    @Override
    public List<IWidget> setupDisplay(IMixinContainerGui containerGui, DisplayHammer recipeDisplay, Rectangle bounds) {
        List<IWidget> widgets = Lists.newArrayList();
        Point startPoint = new Point((int) bounds.getCenterX() - 64, (int) bounds.getCenterY() - 32);
        widgets.add(new RecipeBaseWidget(bounds) {
            @Override
            public void draw(int mouseX, int mouseY, float partialTicks) {
                super.draw(mouseX, mouseY, partialTicks);
                GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
                GuiLighting.disable();
                MinecraftClient.getInstance().getTextureManager().bindTexture(DISPLAY_TEXTURE);
                drawTexturedRect(startPoint.x, startPoint.y, 0, 64, 128, 64);
            }
        });
        List<List<ItemStack>> input = recipeDisplay.getInput();
        widgets.add(new ItemSlotWidget(startPoint.x + 1, startPoint.y + 1, input.get(0), true, true, containerGui, true));
        widgets.add(new ItemSlotWidget(startPoint.x + 1, startPoint.y + 37, recipeDisplay.getFuel(), true, true, containerGui, true));
        widgets.add(new ItemSlotWidget(startPoint.x + 61, startPoint.y + 19, recipeDisplay.getOutput(), false, true, containerGui, true));
        return widgets;
    }
}
