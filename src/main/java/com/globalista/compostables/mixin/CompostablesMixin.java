package com.globalista.compostables.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import org.apache.commons.lang3.NotImplementedException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static net.minecraft.item.Items.*;

@Mixin(ComposterBlock.class)
public class CompostablesMixin extends Block {
    public CompostablesMixin(Settings settings) {
        super(settings);
    }

    @Invoker
    private static void invokeRegisterCompostableItem(float levelIncreaseChance, ItemConvertible item)    {
        throw new NotImplementedException("The invoke failed.");
    }

    @Inject(at = @At("HEAD"), method = "registerDefaultCompostableItems()V")
    private static void injectCompostable(CallbackInfo info) {
        CompostablesMixin.invokeRegisterCompostableItem(0.3f, ROTTEN_FLESH);
        CompostablesMixin.invokeRegisterCompostableItem(0.3f, CHORUS_FRUIT);
        CompostablesMixin.invokeRegisterCompostableItem(0.3f, CHORUS_FLOWER);
        CompostablesMixin.invokeRegisterCompostableItem(0.3f, CHORUS_PLANT);
        CompostablesMixin.invokeRegisterCompostableItem(0.5f, SLIME_BALL);
        CompostablesMixin.invokeRegisterCompostableItem(0.5f, SCUTE);
        CompostablesMixin.invokeRegisterCompostableItem(0.5f, INK_SAC);
        CompostablesMixin.invokeRegisterCompostableItem(0.5f, GLOW_INK_SAC);
        CompostablesMixin.invokeRegisterCompostableItem(0.5f, FERMENTED_SPIDER_EYE);
        CompostablesMixin.invokeRegisterCompostableItem(0.65f, RABBIT_FOOT);
        CompostablesMixin.invokeRegisterCompostableItem(0.65f, EGG);
        CompostablesMixin.invokeRegisterCompostableItem(0.65f, TURTLE_EGG);
        CompostablesMixin.invokeRegisterCompostableItem(0.85f, POPPED_CHORUS_FRUIT);
        CompostablesMixin.invokeRegisterCompostableItem(0.85f, HONEYCOMB);
        CompostablesMixin.invokeRegisterCompostableItem(1f, GLISTERING_MELON_SLICE);
        CompostablesMixin.invokeRegisterCompostableItem(1f, GOLDEN_CARROT);
    }

}