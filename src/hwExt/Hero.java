package hwExt;

public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	private IAttackBehave AttckChose;
	private IDefendBehave DefendChose;
	private IMoveBehave MoveChose;
	
	public Hero() {
		
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void setAttack(IAttackBehave AttckChose) {
		this.AttckChose=AttckChose;
	}
	
	public void setMove(IMoveBehave MoveChose) {
		this.MoveChose=MoveChose;
	}
	
	public void setDefend(IDefendBehave DefendChose) {
		this.DefendChose=DefendChose;
	}
	
	
	
	
	protected void attack() {
		AttckChose.attack();
	}
	
	protected void move() {
		MoveChose.move();
	}
	
	protected void defend() {
		DefendChose.defend();
	}
	
}
