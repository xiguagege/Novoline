package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiCustomizeWorldScreen;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenCustomizePresets$Info;
import net.minecraft.client.gui.GuiScreenCustomizePresets$ListPreset;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.ChunkProviderSettings$Factory;
import org.lwjgl.input.Keyboard;

public class GuiScreenCustomizePresets extends GuiScreen {
   private static final List field_175310_f = Lists.newArrayList();
   private GuiScreenCustomizePresets$ListPreset field_175311_g;
   private GuiButton field_175316_h;
   private GuiTextField field_175317_i;
   private GuiCustomizeWorldScreen field_175314_r;
   protected String field_175315_a = "Customize World Presets";
   private String field_175313_s;
   private String field_175312_t;

   public GuiScreenCustomizePresets(GuiCustomizeWorldScreen var1) {
      this.field_175314_r = var1;
   }

   public void initGui() {
      this.buttonList.clear();
      Keyboard.enableRepeatEvents(true);
      this.field_175315_a = I18n.format("createWorld.customize.custom.presets.title", new Object[0]);
      this.field_175313_s = I18n.format("createWorld.customize.presets.share", new Object[0]);
      this.field_175312_t = I18n.format("createWorld.customize.presets.list", new Object[0]);
      this.field_175317_i = new GuiTextField(2, this.fontRendererObj, 50, 40, this.width - 100, 20);
      this.field_175311_g = new GuiScreenCustomizePresets$ListPreset(this);
      this.field_175317_i.setMaxStringLength(2000);
      this.field_175317_i.setText(this.field_175314_r.func_175323_a());
      this.buttonList.add(this.field_175316_h = new GuiButton(0, this.width / 2 - 102, this.height - 27, 100, 20, I18n.format("createWorld.customize.presets.select", new Object[0])));
      this.buttonList.add(new GuiButton(1, this.width / 2 + 3, this.height - 27, 100, 20, I18n.format("gui.cancel", new Object[0])));
      this.func_175304_a();
   }

   public void handleMouseInput() throws IOException {
      super.handleMouseInput();
      this.field_175311_g.handleMouseInput();
   }

   public void onGuiClosed() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void mouseClicked(int var1, int var2, int var3) throws IOException {
      this.field_175317_i.mouseClicked(var1, var2, var3);
      super.mouseClicked(var1, var2, var3);
   }

   protected void keyTyped(char var1, int var2) throws IOException {
      if(!this.field_175317_i.textboxKeyTyped(var1, var2)) {
         super.keyTyped(var1, var2);
      }

   }

   protected void actionPerformed(GuiButton var1) throws IOException {
      switch(var1.id) {
      case 0:
         this.field_175314_r.func_175324_a(this.field_175317_i.getText());
         this.mc.displayGuiScreen(this.field_175314_r);
         break;
      case 1:
         this.mc.displayGuiScreen(this.field_175314_r);
      }

   }

   public void drawScreen(int var1, int var2, float var3) {
      this.drawDefaultBackground();
      this.field_175311_g.drawScreen(var1, var2, var3);
      this.drawCenteredString(this.fontRendererObj, this.field_175315_a, this.width / 2, 8, 16777215);
      this.drawString(this.fontRendererObj, this.field_175313_s, 50, 30, 10526880);
      this.drawString(this.fontRendererObj, this.field_175312_t, 50, 70, 10526880);
      this.field_175317_i.drawTextBox();
      super.drawScreen(var1, var2, var3);
   }

   public void updateScreen() {
      this.field_175317_i.updateCursorCounter();
      super.updateScreen();
   }

   public void func_175304_a() {
      this.field_175316_h.enabled = this.func_175305_g();
   }

   private boolean func_175305_g() {
      return this.field_175311_g.field_178053_u > -1 && this.field_175311_g.field_178053_u < field_175310_f.size() || this.field_175317_i.getText().length() > 1;
   }

   static List access$000() {
      return field_175310_f;
   }

   static GuiScreenCustomizePresets$ListPreset access$100(GuiScreenCustomizePresets var0) {
      return var0.field_175311_g;
   }

   static GuiTextField access$200(GuiScreenCustomizePresets var0) {
      return var0.field_175317_i;
   }

   static {
      ChunkProviderSettings$Factory var7 = ChunkProviderSettings$Factory.jsonToFactory("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
      ResourceLocation var8 = new ResourceLocation("textures/gui/presets/water.png");
      field_175310_f.add(new GuiScreenCustomizePresets$Info(I18n.format("createWorld.customize.custom.preset.waterWorld", new Object[0]), var8, var7));
      var7 = ChunkProviderSettings$Factory.jsonToFactory("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
      var8 = new ResourceLocation("textures/gui/presets/isles.png");
      field_175310_f.add(new GuiScreenCustomizePresets$Info(I18n.format("createWorld.customize.custom.preset.isleLand", new Object[0]), var8, var7));
      var7 = ChunkProviderSettings$Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
      var8 = new ResourceLocation("textures/gui/presets/delight.png");
      field_175310_f.add(new GuiScreenCustomizePresets$Info(I18n.format("createWorld.customize.custom.preset.caveDelight", new Object[0]), var8, var7));
      var7 = ChunkProviderSettings$Factory.jsonToFactory("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
      var8 = new ResourceLocation("textures/gui/presets/madness.png");
      field_175310_f.add(new GuiScreenCustomizePresets$Info(I18n.format("createWorld.customize.custom.preset.mountains", new Object[0]), var8, var7));
      var7 = ChunkProviderSettings$Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
      var8 = new ResourceLocation("textures/gui/presets/drought.png");
      field_175310_f.add(new GuiScreenCustomizePresets$Info(I18n.format("createWorld.customize.custom.preset.drought", new Object[0]), var8, var7));
      var7 = ChunkProviderSettings$Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
      var8 = new ResourceLocation("textures/gui/presets/chaos.png");
      field_175310_f.add(new GuiScreenCustomizePresets$Info(I18n.format("createWorld.customize.custom.preset.caveChaos", new Object[0]), var8, var7));
      var7 = ChunkProviderSettings$Factory.jsonToFactory("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
      var8 = new ResourceLocation("textures/gui/presets/luck.png");
      field_175310_f.add(new GuiScreenCustomizePresets$Info(I18n.format("createWorld.customize.custom.preset.goodLuck", new Object[0]), var8, var7));
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
