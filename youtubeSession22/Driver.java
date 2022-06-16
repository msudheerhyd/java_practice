package com.practice.youtubeSession22;

import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		ArrayList<GiftBox> boxes = new ArrayList<GiftBox>();
		double[] biscuitsWeights1 = {200.0, 100.0}; // 2 biscuit sets
		double[] chocolateWeights1 = {200.0, 100.0}; // 2 chocolate sets
		String[] chocolateFlavours1 = {"mint", "orange"};
		boxes.add(new GiftBox(biscuitsWeights1, chocolateWeights1,
				chocolateFlavours1));
		double[] biscuitsWeights2 = {300.0, 100.0, 100.0}; // 3 biscuit sets
		double[] chocolateWeights2 = {200.0, 100.0, 300.0}; // 2 chocolate sets
		String[] chocolateFlavours2 = {"milk", "vanilla", "coffee"};
		boxes.add(new GiftBox(biscuitsWeights2, chocolateWeights2,
				chocolateFlavours2));
		for(GiftBox box : boxes) {
			if (box.getWeight() > 1000.0) {
				System.out.println("The box with " + box.getNumBiscuits() + 
						" biscuits and " + box.getNumChocolate() + 
						" chocolates is overweight");
				System.out.println("The biscuit weights are: ");
				box.showBiscuitsWeights();
				System.out.println("The chocolate weights are: ");
				box.showChocolateWeights();
				System.out.println("The chocolate flavours are: ");
				box.showChocolateFlavours();
				System.out.println();
			}
		}
	}

}
