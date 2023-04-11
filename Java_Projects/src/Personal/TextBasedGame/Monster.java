package Personal.TextBasedGame;

public abstract class Monster implements IDamageable {
    protected int health;

    @Override
    public void TakeDamage(int amount){
        health -= amount;
    }
}
