package com.example.modobf.mixin;

import com.example.modobf.init.ModItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemEntity.class)
public abstract class ExampleMixin extends Entity {
    public ExampleMixin(EntityType<?> p_19870_, Level p_19871_) {
        super(p_19870_, p_19871_);
    }

    @Shadow public abstract ItemStack getItem();

    @Shadow private int health;

    /**
     * @author example author
     */
    @Inject(at = @At("HEAD"), method = "hurt")
    public void hurt(DamageSource p_32013_, float p_32014_, CallbackInfoReturnable<Boolean> cir) {
        if (p_32013_.isFire() && getItem().getItem() == ModItems.EXPLODING_ITEM.get()) {
            level.explode(this, getX(), getY(), getZ(), 4f, Explosion.BlockInteraction.BREAK);
            cir.setReturnValue(false);
        }
    }
}
