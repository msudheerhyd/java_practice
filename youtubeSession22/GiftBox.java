package com.practice.youtubeSession22;

import java.util.ArrayList;

public class GiftBox {
	private ArrayList<Biscuits> biscuitsSet;
	private ArrayList<Chocolate> chocolateSet;
	public double weight;
	public GiftBox(double[] biscuitsWeights, double[] chocolateWeights,
			String[] chocolateFlavours) {
		biscuitsSet = new ArrayList<Biscuits>();
		chocolateSet = new ArrayList<Chocolate>();
		for (int i = 0; i < biscuitsWeights.length; i++) {
			Biscuits pack = new Biscuits(biscuitsWeights[i]);
			biscuitsSet.add(pack);
			weight += pack.getWeight();
		}
		for (int i = 0; i < chocolateWeights.length; i++) {
			Chocolate pack = new Chocolate(chocolateWeights[i], chocolateFlavours[i]);
			chocolateSet.add(pack);
			weight += pack.getWeight();
		}
	}
	public int getNumBiscuits() {
		return biscuitsSet.size();
	} 
	public int getNumChocolate() {
		return chocolateSet.size();
	} 
	public double getWeight() {
		return weight;
	}
	public void showBiscuitsWeights() {
		for (Biscuits biscuit : biscuitsSet) {
			System.out.println(biscuit.getWeight() + " ");
		}
	}
	public void showChocolateWeights() {
		for (Chocolate chocolate : chocolateSet) {
			System.out.println(chocolate.getWeight() + " ");
		}
	}	
	public void showChocolateFlavours() {
		for (Chocolate chocolate : chocolateSet) {
			System.out.println(chocolate.getWeight() + " ");
		}
	}	
	
}
