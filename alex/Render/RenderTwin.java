/*    */ package tutorial.alex.Render;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBiped;
/*    */ import net.minecraft.client.renderer.entity.RenderBiped;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ public class RenderTwin extends RenderBiped
/*    */ {
/* 11 */   private static final ResourceLocation textureLocation = new ResourceLocation("alexmodid:textures/models/twinbuilder.png");
/*    */ 
/*    */   public RenderTwin(ModelBiped model, float shadowSize) {
/* 14 */     super(model, shadowSize);
/*    */   }
/*    */ 
/*    */   protected ResourceLocation getEntityTexture(Entity par1Entity)
/*    */   {
/* 20 */     return textureLocation;
/*    */   }
/*    */ }

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Render.RenderTwin
 * JD-Core Version:    0.6.0
 */