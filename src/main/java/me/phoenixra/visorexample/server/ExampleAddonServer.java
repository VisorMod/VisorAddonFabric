package me.phoenixra.visorexample.server;

import me.phoenixra.visor.api.common.addon.VisorAddon;
import me.phoenixra.visorexample.common.VisorExample;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExampleAddonServer implements VisorAddon {
    @Override
    public void onAddonLoad() {

    }

    @Override
    public @Nullable String getAddonPackagePath() {
        return "me.phoenixra.visorexample.server";
    }

    @Override
    public @NotNull String getAddonId() {
        return VisorExample.MOD_ID;
    }

    @Override
    public String getModId() {
        return VisorExample.MOD_ID;
    }
}
