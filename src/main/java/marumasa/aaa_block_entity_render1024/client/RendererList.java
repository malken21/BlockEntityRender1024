package marumasa.aaa_block_entity_render1024.client;

import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EndPortalBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.client.render.block.entity.*;

public class RendererList {

    final static int Distance = 1024;

    public static class SignBlockEntityCustom extends SignBlockEntityRenderer {
        public SignBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class HangingSignBlockEntityCustom extends HangingSignBlockEntityRenderer {
        public HangingSignBlockEntityCustom(BlockEntityRendererFactory.Context context) {
            super(context);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class MobSpawnerBlockEntityCustom extends MobSpawnerBlockEntityRenderer {
        public MobSpawnerBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class PistonBlockEntityCustom extends PistonBlockEntityRenderer {
        public PistonBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class ChestBlockEntityCustom extends ChestBlockEntityRenderer<ChestBlockEntity> {
        public ChestBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class EnderChestBlockEntityCustom extends ChestBlockEntityRenderer<EnderChestBlockEntity> {
        public EnderChestBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class EnchantingTableBlockEntityCustom extends EnchantingTableBlockEntityRenderer {
        public EnchantingTableBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class LecternBlockEntityCustom extends LecternBlockEntityRenderer {
        public LecternBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class EndPortalBlockEntityCustom extends EndPortalBlockEntityRenderer<EndPortalBlockEntity> {
        public EndPortalBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class EndGatewayBlockEntityCustom extends EndGatewayBlockEntityRenderer {
        public EndGatewayBlockEntityCustom(BlockEntityRendererFactory.Context context) {
            super(context);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class BeaconBlockEntityCustom extends BeaconBlockEntityRenderer {
        public BeaconBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class SkullBlockEntityCustom extends SkullBlockEntityRenderer {
        public SkullBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class BannerBlockEntityCustom extends BannerBlockEntityRenderer {
        public BannerBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class StructureBlockBlockEntityCustom extends StructureBlockBlockEntityRenderer {
        public StructureBlockBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class ShulkerBoxBlockEntityCustom extends ShulkerBoxBlockEntityRenderer {
        public ShulkerBoxBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class BedBlockEntityCustom extends BedBlockEntityRenderer {
        public BedBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class ConduitBlockEntityCustom extends ConduitBlockEntityRenderer {
        public ConduitBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class BellBlockEntityCustom extends BellBlockEntityRenderer {
        public BellBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class CampfireBlockEntityCustom extends CampfireBlockEntityRenderer {
        public CampfireBlockEntityCustom(BlockEntityRendererFactory.Context ctx) {
            super(ctx);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class BrushableBlockEntityCustom extends BrushableBlockEntityRenderer {
        public BrushableBlockEntityCustom(BlockEntityRendererFactory.Context context) {
            super(context);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }

    public static class DecoratedPotBlockEntityCustom extends DecoratedPotBlockEntityRenderer {
        public DecoratedPotBlockEntityCustom(BlockEntityRendererFactory.Context context) {
            super(context);
        }

        @Override
        public int getRenderDistance() {
            return Distance;
        }
    }
}
