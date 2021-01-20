/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2019
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.client.gui;

import buildcraft.api.mj.MjAPI;
import mods.railcraft.common.blocks.single.TileEngineSteam;
import mods.railcraft.common.gui.containers.ContainerEngineSteam;
import net.minecraft.entity.player.InventoryPlayer;

import java.text.DecimalFormat;

public class GuiEngineSteam extends GuiTitled {

    private static final String OUTPUT = "%d MJ";
    private final TileEngineSteam tile;

    public GuiEngineSteam(InventoryPlayer inv, TileEngineSteam tile) {
        super(tile, new ContainerEngineSteam(inv, tile), "gui_engine_steam.png");
        this.tile = tile;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
        fontRenderer.drawString(String.format(OUTPUT, tile.getCurrentOutput() / MjAPI.MJ), 120, 40, 0x404040);
    }
}
