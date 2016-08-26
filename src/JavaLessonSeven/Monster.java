package JavaLessonSeven;

public class Monster {
	
	public final String TOMBSTONE = "Here Lies a Dead Monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	@SuppressWarnings("unused")
	private int xPosition = 0;
	@SuppressWarnings("unused")
	private int yPosition = 0;
	@SuppressWarnings("unused")
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	public int getAttack()
	{
		return attack;
	}
	public int getMovement()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public void setHealth(double decrease)
	{
		int intDecreaseHealth = (int) decrease;
		health = health - intDecreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public Monster(int newHealth, int newAttack, int newMovement)
	{
		health = newHealth;
		attack = newAttack;
		movement = newMovement;
	}
	
	// Default Constructor
	public Monster()
	{
		
	}
	
	

}
