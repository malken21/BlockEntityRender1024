package marumasa.aaa_block_entity_render1024.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class BlockEntityRender1024Client implements ClientModInitializer {

    /**
     * static {}
     * <p>
     * {@link BlockEntityRendererFactories}
     */
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(BlockEntityType.SIGN, RendererList.SignBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.HANGING_SIGN, RendererList.HangingSignBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.MOB_SPAWNER, RendererList.MobSpawnerBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.PISTON, RendererList.PistonBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.CHEST, RendererList.ChestBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.ENDER_CHEST, RendererList.ChestBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.TRAPPED_CHEST, RendererList.ChestBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.ENCHANTING_TABLE, RendererList.EnchantingTableBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.LECTERN, RendererList.LecternBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.END_PORTAL, RendererList.EndPortalBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.END_GATEWAY, RendererList.EndGatewayBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.BEACON, RendererList.BeaconBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.SKULL, RendererList.SkullBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.BANNER, RendererList.BannerBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.STRUCTURE_BLOCK, RendererList.StructureBlockBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.SHULKER_BOX, RendererList.ShulkerBoxBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.BED, RendererList.BedBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.CONDUIT, RendererList.ConduitBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.BELL, RendererList.BellBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.CAMPFIRE, RendererList.CampfireBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.BRUSHABLE_BLOCK, RendererList.BrushableBlockEntityCustom::new);
        BlockEntityRendererFactories.register(BlockEntityType.DECORATED_POT, RendererList.DecoratedPotBlockEntityCustom::new);
    }
}
