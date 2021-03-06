package net;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import viaversion.viaversion.api.entities.EntityType;

public enum t4 implements EntityType {
   ENTITY(-1),
   DROPPED_ITEM(1, ENTITY),
   EXPERIENCE_ORB(2, ENTITY),
   LEASH_HITCH(8, ENTITY),
   PAINTING(9, ENTITY),
   ARROW(10, ENTITY),
   SNOWBALL(11, ENTITY),
   FIREBALL(12, ENTITY),
   SMALL_FIREBALL(13, ENTITY),
   ENDER_PEARL(14, ENTITY),
   ENDER_SIGNAL(15, ENTITY),
   THROWN_EXP_BOTTLE(17, ENTITY),
   ITEM_FRAME(18, ENTITY),
   WITHER_SKULL(19, ENTITY),
   PRIMED_TNT(20, ENTITY),
   FALLING_BLOCK(21, ENTITY),
   FIREWORK(22, ENTITY),
   TIPPED_ARROW(23, ARROW),
   SPECTRAL_ARROW(24, ARROW),
   SHULKER_BULLET(25, ENTITY),
   DRAGON_FIREBALL(26, FIREBALL),
   ENTITY_LIVING(-1, ENTITY),
   ENTITY_INSENTIENT(-1, ENTITY_LIVING),
   ENTITY_AGEABLE(-1, ENTITY_INSENTIENT),
   ENTITY_TAMEABLE_ANIMAL(-1, ENTITY_AGEABLE),
   ENTITY_HUMAN(-1, ENTITY_LIVING),
   ARMOR_STAND(30, ENTITY_LIVING),
   MINECART_ABSTRACT(-1, ENTITY),
   MINECART_COMMAND(40, MINECART_ABSTRACT),
   BOAT(41, ENTITY),
   MINECART_RIDEABLE(42, MINECART_ABSTRACT),
   MINECART_CHEST(43, MINECART_ABSTRACT),
   MINECART_FURNACE(44, MINECART_ABSTRACT),
   MINECART_TNT(45, MINECART_ABSTRACT),
   MINECART_HOPPER(46, MINECART_ABSTRACT),
   MINECART_MOB_SPAWNER(47, MINECART_ABSTRACT),
   CREEPER(50, ENTITY_INSENTIENT),
   SKELETON(51, ENTITY_INSENTIENT),
   SPIDER(52, ENTITY_INSENTIENT),
   GIANT(53, ENTITY_INSENTIENT),
   ZOMBIE(54, ENTITY_INSENTIENT),
   SLIME(55, ENTITY_INSENTIENT),
   GHAST(56, ENTITY_INSENTIENT),
   PIG_ZOMBIE(57, ZOMBIE),
   ENDERMAN(58, ENTITY_INSENTIENT),
   CAVE_SPIDER(59, SPIDER),
   SILVERFISH(60, ENTITY_INSENTIENT),
   BLAZE(61, ENTITY_INSENTIENT),
   MAGMA_CUBE(62, SLIME),
   ENDER_DRAGON(63, ENTITY_INSENTIENT),
   WITHER(64, ENTITY_INSENTIENT),
   BAT(65, ENTITY_INSENTIENT),
   WITCH(66, ENTITY_INSENTIENT),
   ENDERMITE(67, ENTITY_INSENTIENT),
   GUARDIAN(68, ENTITY_INSENTIENT),
   IRON_GOLEM(99, ENTITY_INSENTIENT),
   SHULKER(69, IRON_GOLEM),
   PIG(90, ENTITY_AGEABLE),
   SHEEP(91, ENTITY_AGEABLE),
   COW(92, ENTITY_AGEABLE),
   CHICKEN(93, ENTITY_AGEABLE),
   SQUID(94, ENTITY_INSENTIENT),
   WOLF(95, ENTITY_TAMEABLE_ANIMAL),
   MUSHROOM_COW(96, COW),
   SNOWMAN(97, IRON_GOLEM),
   OCELOT(98, ENTITY_TAMEABLE_ANIMAL),
   HORSE(100, ENTITY_AGEABLE),
   RABBIT(101, ENTITY_AGEABLE),
   POLAR_BEAR(102, ENTITY_AGEABLE),
   VILLAGER(120, ENTITY_AGEABLE),
   ENDER_CRYSTAL(200, ENTITY),
   SPLASH_POTION(-1, ENTITY),
   LINGERING_POTION(-1, SPLASH_POTION),
   AREA_EFFECT_CLOUD(-1, ENTITY),
   EGG(-1, ENTITY),
   FISHING_HOOK(-1, ENTITY),
   LIGHTNING(-1, ENTITY),
   WEATHER(-1, ENTITY),
   PLAYER(-1, ENTITY_HUMAN),
   COMPLEX_PART(-1, ENTITY);

   private static final Map d = new HashMap();
   private final int c;
   private final t4 a;
   private static final t4[] e = new t4[]{ENTITY, DROPPED_ITEM, EXPERIENCE_ORB, LEASH_HITCH, PAINTING, ARROW, SNOWBALL, FIREBALL, SMALL_FIREBALL, ENDER_PEARL, ENDER_SIGNAL, THROWN_EXP_BOTTLE, ITEM_FRAME, WITHER_SKULL, PRIMED_TNT, FALLING_BLOCK, FIREWORK, TIPPED_ARROW, SPECTRAL_ARROW, SHULKER_BULLET, DRAGON_FIREBALL, ENTITY_LIVING, ENTITY_INSENTIENT, ENTITY_AGEABLE, ENTITY_TAMEABLE_ANIMAL, ENTITY_HUMAN, ARMOR_STAND, MINECART_ABSTRACT, MINECART_COMMAND, BOAT, MINECART_RIDEABLE, MINECART_CHEST, MINECART_FURNACE, MINECART_TNT, MINECART_HOPPER, MINECART_MOB_SPAWNER, CREEPER, SKELETON, SPIDER, GIANT, ZOMBIE, SLIME, GHAST, PIG_ZOMBIE, ENDERMAN, CAVE_SPIDER, SILVERFISH, BLAZE, MAGMA_CUBE, ENDER_DRAGON, WITHER, BAT, WITCH, ENDERMITE, GUARDIAN, IRON_GOLEM, SHULKER, PIG, SHEEP, COW, CHICKEN, SQUID, WOLF, MUSHROOM_COW, SNOWMAN, OCELOT, HORSE, RABBIT, POLAR_BEAR, VILLAGER, ENDER_CRYSTAL, SPLASH_POTION, LINGERING_POTION, AREA_EFFECT_CLOUD, EGG, FISHING_HOOK, LIGHTNING, WEATHER, PLAYER, COMPLEX_PART};
   private static boolean b;

   private t4(int var3) {
      this.c = var3;
      this.a = null;
   }

   private t4(int var3, t4 var4) {
      this.c = var3;
      this.a = var4;
   }

   public static Optional a(int var0) {
      return var0 == -1?Optional.empty():Optional.ofNullable(d.get(Integer.valueOf(var0)));
   }

   public int getId() {
      return this.c;
   }

   public t4 a() {
      return this.a;
   }

   static {
      b(true);

      for(t4 var11 : values()) {
         d.put(Integer.valueOf(var11.c), var11);
      }

   }

   public static void b(boolean var0) {
      b = var0;
   }

   public static boolean d() {
      return b;
   }

   public static boolean c() {
      boolean var0 = d();
      return true;
   }
}
