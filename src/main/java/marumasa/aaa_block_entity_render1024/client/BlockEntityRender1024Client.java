package marumasa.aaa_block_entity_render1024.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

import static net.minecraft.client.render.block.entity.BlockEntityRendererFactories.register;

public class BlockEntityRender1024Client implements ClientModInitializer {

    /**
     * static {}
     * <p>
     * {@link BlockEntityRendererFactories}
     */
    @Override
    public void onInitializeClient() {
        register(BlockEntityType.SIGN, RendererList.SignBlockEntityCustom::new);
        register(BlockEntityType.HANGING_SIGN, RendererList.HangingSignBlockEntityCustom::new);
        register(BlockEntityType.MOB_SPAWNER, RendererList.MobSpawnerBlockEntityCustom::new);
        register(BlockEntityType.PISTON, RendererList.PistonBlockEntityCustom::new);
        register(BlockEntityType.CHEST, RendererList.ChestBlockEntityCustom::new);
        register(BlockEntityType.ENDER_CHEST, RendererList.EnderChestBlockEntityCustom::new);
        register(BlockEntityType.TRAPPED_CHEST, RendererList.ChestBlockEntityCustom::new);
        register(BlockEntityType.ENCHANTING_TABLE, RendererList.EnchantingTableBlockEntityCustom::new);
        register(BlockEntityType.LECTERN, RendererList.LecternBlockEntityCustom::new);
        register(BlockEntityType.END_PORTAL, RendererList.EndPortalBlockEntityCustom::new);
        register(BlockEntityType.END_GATEWAY, RendererList.EndGatewayBlockEntityCustom::new);
        register(BlockEntityType.BEACON, RendererList.BeaconBlockEntityCustom::new);
        register(BlockEntityType.SKULL, RendererList.SkullBlockEntityCustom::new);
        register(BlockEntityType.BANNER, RendererList.BannerBlockEntityCustom::new);
        register(BlockEntityType.STRUCTURE_BLOCK, RendererList.StructureBlockBlockEntityCustom::new);
        register(BlockEntityType.SHULKER_BOX, RendererList.ShulkerBoxBlockEntityCustom::new);
        register(BlockEntityType.BED, RendererList.BedBlockEntityCustom::new);
        register(BlockEntityType.CONDUIT, RendererList.ConduitBlockEntityCustom::new);
        register(BlockEntityType.BELL, RendererList.BellBlockEntityCustom::new);
        register(BlockEntityType.CAMPFIRE, RendererList.CampfireBlockEntityCustom::new);
        register(BlockEntityType.BRUSHABLE_BLOCK, RendererList.BrushableBlockEntityCustom::new);
        register(BlockEntityType.DECORATED_POT, RendererList.DecoratedPotBlockEntityCustom::new);
        register(BlockEntityType.TRIAL_SPAWNER, RendererList.TrialSpawnerBlockEntityCustom::new);
    }
}
