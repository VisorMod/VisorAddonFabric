package me.phoenixra.visorexample.client;

import me.phoenixra.visor.api.VisorAPI;
import me.phoenixra.visor.api.common.addon.VisorAddon;
import me.phoenixra.visorexample.common.VisorExample;
import me.phoenixra.visorexample.client.overlays.VROverlayExample;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ExampleAddonClient implements VisorAddon {
    @Override
    public void onAddonLoad() {
        VisorAPI.addonManager().getRegistries()
                .overlays()
                .registerElements(
                        List.of(
                                new VROverlayExample(
                                        this,
                                        VROverlayExample.ID
                                )
                        )
                );
    }

    @Override
    public @Nullable String getAddonPackagePath() {
        return "me.phoenixra.visorexample.client";
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
