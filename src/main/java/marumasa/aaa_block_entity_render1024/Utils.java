package marumasa.aaa_block_entity_render1024;

import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class Utils {
    // キーバインド 作成
    public static KeyBinding createKeyBinding(String name, int code) {
        return new KeyBinding(
                // ID作成
                "key." + BlockEntityRender1024.MOD_ID + "." + name,

                // どのキーか設定
                InputUtil.Type.KEYSYM, code,

                // カテゴリ設定
                "key.categories." + BlockEntityRender1024.MOD_ID
        );
    }
}
