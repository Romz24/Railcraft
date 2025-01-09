/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/

package mods.railcraft.common.carts;

import mods.railcraft.common.plugins.ic2.IC2Plugin;
import mods.railcraft.common.plugins.misc.Mod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;

public final class EntityCartEnergyMFSU extends CartBaseEnergy {
    private static final int TIER = Mod.IC2_CLASSIC.isLoaded() ? 3 : 4;
    private static final int CAPACITY = Mod.IC2_CLASSIC.isLoaded() ? 10000000 : 40000000;
    private static final int TRANSFER = Mod.IC2_CLASSIC.isLoaded() ? 512 : 2048;

    public EntityCartEnergyMFSU(World world) {
        super(world);
    }

    public EntityCartEnergyMFSU(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

    @Override
    public int getTier() {
        return TIER;
    }

    @Override
    public IBlockState getDefaultDisplayTile() {
        return IC2Plugin.getBlockState("te", "mfsu");
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }

    @Override
    public int getTransferLimit() {
        return TRANSFER;
    }

    @Override
    public IRailcraftCartContainer getCartType() {
        return RailcraftCarts.ENERGY_MFSU;
    }

}
