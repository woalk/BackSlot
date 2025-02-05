package net.backslot;

import net.backslot.client.key.SwitchKey;
import net.backslot.client.sprite.BackSlotSprites;
import net.backslot.network.SyncPacket;
import net.fabricmc.api.ClientModInitializer;

public class BackSlotClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BackSlotSprites.init();
        SyncPacket.init();
        SwitchKey.init();
    }

}