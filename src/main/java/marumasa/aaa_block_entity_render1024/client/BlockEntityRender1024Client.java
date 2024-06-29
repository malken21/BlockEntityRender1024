package marumasa.aaa_block_entity_render1024.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.*;

import static net.minecraft.client.render.block.entity.BlockEntityRendererFactories.register;
import static marumasa.aaa_block_entity_render1024.client.RendererList.*;

public class BlockEntityRender1024Client implements ClientModInitializer {

    /**
     * static {}
     * <p>
     * {@link BlockEntityRendererFactories}
     */
    @Override
    public void onInitializeClient() {
        register(BlockEntityType.SIGN, SignBlockEntityCustom::new);
        register(BlockEntityType.HANGING_SIGN, HangingSignBlockEntityCustom::new);
        register(BlockEntityType.MOB_SPAWNER, MobSpawnerBlockEntityCustom::new);
        register(BlockEntityType.PISTON, PistonBlockEntityCustom::new);
        register(BlockEntityType.CHEST, ChestBlockEntityCustom::new);
        register(BlockEntityType.ENDER_CHEST, EnderChestBlockEntityCustom::new);
        register(BlockEntityType.TRAPPED_CHEST, ChestBlockEntityCustom::new);
        register(BlockEntityType.ENCHANTING_TABLE, EnchantingTableBlockEntityCustom::new);
        register(BlockEntityType.LECTERN, LecternBlockEntityCustom::new);
        register(BlockEntityType.END_PORTAL, EndPortalBlockEntityCustom::new);
        register(BlockEntityType.END_GATEWAY, EndGatewayBlockEntityCustom::new);
        register(BlockEntityType.BEACON, BeaconBlockEntityCustom::new);
        register(BlockEntityType.SKULL, SkullBlockEntityCustom::new);
        register(BlockEntityType.BANNER, BannerBlockEntityCustom::new);
        register(BlockEntityType.STRUCTURE_BLOCK, StructureBlockBlockEntityCustom::new);
        register(BlockEntityType.SHULKER_BOX, ShulkerBoxBlockEntityCustom::new);
        register(BlockEntityType.BED, BedBlockEntityCustom::new);
        register(BlockEntityType.CONDUIT, ConduitBlockEntityCustom::new);
        register(BlockEntityType.BELL, BellBlockEntityCustom::new);
        register(BlockEntityType.CAMPFIRE, CampfireBlockEntityCustom::new);
        register(BlockEntityType.BRUSHABLE_BLOCK, BrushableBlockEntityCustom::new);
        register(BlockEntityType.DECORATED_POT, DecoratedPotBlockEntityCustom::new);
        register(BlockEntityType.TRIAL_SPAWNER, TrialSpawnerBlockEntityCustom::new);
        register(BlockEntityType.VAULT, VaultBlockEntityCustom::new);
    }
}
