package hwExt;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.setAttack(new Slash());
		saber.setMove(new Onward());
		saber.setDefend(new ShieldBlock());
		
		saber.attack();
		saber.move();
		saber.defend();
		
		System.out.println("=======================");
		
		archer.setAttack(new Shoot());
		archer.setMove(new Shift());
		archer.setDefend(new Dodge());
		
		archer.attack();
		archer.move();
		archer.defend();
	}

}
