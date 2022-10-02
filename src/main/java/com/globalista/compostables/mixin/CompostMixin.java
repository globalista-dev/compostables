package com.globalista.compostables.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static net.minecraft.item.Items.*;

@Mixin(ComposterBlock.class)
public class CompostMixin extends Block {
    public CompostMixin(Settings settings) {
        super(settings);
    }

    @Invoker
    private static void invokeRegisterCompostableItem(float levelIncreaseChance, ItemConvertible item)    {
        throw new NotImplementedException("The invoke failed.");
    }

    @Inject(at = @At("HEAD"), method = "registerDefaultCompostableItems()V")
    private static void injectCompostable(CallbackInfo info) {
        CompostMixin.invokeRegisterCompostableItem(0.3f, ROTTEN_FLESH);
        CompostMixin.invokeRegisterCompostableItem(0.3f, CHORUS_FRUIT);
        CompostMixin.invokeRegisterCompostableItem(0.5f, CHORUS_FLOWER);
        CompostMixin.invokeRegisterCompostableItem(0.5f, CHORUS_PLANT);
        CompostMixin.invokeRegisterCompostableItem(0.5f, SLIME_BALL);
        CompostMixin.invokeRegisterCompostableItem(0.5f, SCUTE);
        CompostMixin.invokeRegisterCompostableItem(0.5f, INK_SAC);
        CompostMixin.invokeRegisterCompostableItem(0.5f, GLOW_INK_SAC);
        CompostMixin.invokeRegisterCompostableItem(0.5f, FERMENTED_SPIDER_EYE);
        CompostMixin.invokeRegisterCompostableItem(0.5f, RABBIT_FOOT);
        CompostMixin.invokeRegisterCompostableItem(0.65f, EGG);
        CompostMixin.invokeRegisterCompostableItem(0.65f, TURTLE_EGG);
        CompostMixin.invokeRegisterCompostableItem(0.85f, POPPED_CHORUS_FRUIT);
        CompostMixin.invokeRegisterCompostableItem(0.85f, HONEYCOMB);
        CompostMixin.invokeRegisterCompostableItem(1f, GLISTERING_MELON_SLICE);
        CompostMixin.invokeRegisterCompostableItem(1f, GOLDEN_CARROT);
    }

}