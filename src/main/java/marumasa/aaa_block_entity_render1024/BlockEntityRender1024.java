package marumasa.aaa_block_entity_render1024;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class BlockEntityRender1024 implements ModInitializer {
    public static final String MOD_ID = "aaa_block_entity_render1024";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Start: " + MOD_ID);
    }
}
