package tutorial.alex.Entity.Attacks;

import net.minecraft.entity.Entity;

public abstract interface ITwinAttack
{
  public abstract void use(Entity paramEntity);

  public abstract int getTier();

  public abstract boolean isDone();
}

/* Location:           C:\Users\Cris\Desktop\MyMods\Minecraft\DTGMod\
 * Qualified Name:     tutorial.alex.Entity.Attacks.ITwinAttack
 * JD-Core Version:    0.6.0
 */