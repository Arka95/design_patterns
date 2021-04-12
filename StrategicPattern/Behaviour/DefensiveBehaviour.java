package StrategicPattern.Behaviour;

public class DefensiveBehaviour implements IBehaviour{
	public int moveCommand()
	{
		System.out.println("\tDefensive Behaviour: if find another robot attack it");
		return 1;
	}
}