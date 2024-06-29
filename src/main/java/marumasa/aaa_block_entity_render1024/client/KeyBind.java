package marumasa.aaa_block_entity_render1024.client;

import marumasa.aaa_block_entity_render1024.BlockEntityRender1024;
import marumasa.aaa_block_entity_render1024.Utils;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

import static marumasa.aaa_block_entity_render1024.client.RendererList.*;


public class KeyBind {
    public static void register() {
        // キーバインド登録
        KeyBinding binding1 = KeyBindingHelper.registerKeyBinding(
                Utils.createKeyBinding("change_distance", GLFW.GLFW_KEY_V)
        );

        // クライアントティックイベントにキーバインドの処理を登録
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;
            // もしキーが押されたら
            while (binding1.wasPressed()) {
                if (Distance < 0) {
                    final Text text = Text.translatable("text." + BlockEntityRender1024.MOD_ID + ".change_distance.1024");
                    client.player.sendMessage(text, false);
                    Distance = 1024;
                } else {
                    final Text text = Text.translatable("text." + BlockEntityRender1024.MOD_ID + ".change_distance.default");
                    client.player.sendMessage(text, false);
                    Distance = -1;
                }
            }
        });
    }
}
