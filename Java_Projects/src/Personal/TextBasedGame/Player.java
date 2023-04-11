package Personal.TextBasedGame;

public class Player implements IDamageable {
    private int attackPower;
    private int currentHealth;
    private int maxHealth = 3;

    public Player(){
        this.currentHealth = maxHealth;
        this.attackPower = 1;
    }
    @Override
    public void TakeDamage(int amount){
        this.currentHealth -= amount;
    }

    @Override
    public String toString(){

        return "Player with health " + currentHealth + " and attack " + attackPower;
    }


}
