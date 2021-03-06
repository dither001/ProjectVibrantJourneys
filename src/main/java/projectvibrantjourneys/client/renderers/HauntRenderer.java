package projectvibrantjourneys.client.renderers;

import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import projectvibrantjourneys.client.models.AngryGhostModel;
import projectvibrantjourneys.common.entities.monster.HauntEntity;
import projectvibrantjourneys.core.ProjectVibrantJourneys;

@OnlyIn(Dist.CLIENT)
public class HauntRenderer extends BipedRenderer<HauntEntity, AngryGhostModel<HauntEntity>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(ProjectVibrantJourneys.MOD_ID, "textures/entity/ghost/haunt.png");
	
	public HauntRenderer(EntityRendererManager manager) {
		super(manager, new AngryGhostModel<>(), 0.0F);
	}
	
	@Override
	public ResourceLocation getEntityTexture(HauntEntity entity) {
		return TEXTURE;
	}
	
	@Override
	protected boolean isVisible(HauntEntity entity) {
		return false;
	}
}
