package model.characters;
import java.util.ArrayList;

import  model.collectibles.Vaccine;
import model.collectibles.Supply;

public class Hero extends Character{
	private int actionsAvailable ;
	private int maxActions ;
	private boolean specialAction ;
	private ArrayList<Vaccine> vaccineInventory ;
	private ArrayList<Supply> supplyInventory ;
	
	public Hero(String name, int maxHp, int attackDmg, int maxActions) {
		super(name , maxHp , attackDmg);
		this.maxActions = maxActions ;
	}

	public int getMaxActions() {
		return maxActions;
	}

	public ArrayList<Vaccine> getVaccineInventory() {
		return vaccineInventory;
	}

	public ArrayList<Supply> getSupplyInventory() {
		return supplyInventory;
	}
	
}
