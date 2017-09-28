package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public abstract class Aircraft {

	private static double budget = 500000000;

	private int orderCount;

	private double finalPrice;

	@SuppressWarnings("unused")
	private double currentBudget;

	public abstract String acID();

	public abstract String viewImage();

	public abstract String viewModel();

	public abstract String viewDescription();

	public abstract String viewSimilarModels();

	public abstract String viewEngineTypes();

	public abstract void setDetail(Detail detail);

	public abstract Detail getDetail();

	public abstract String displayStatus();

	public abstract double acPrice();

	public static double getBudget() {
		return budget;
	}

	public static void setBudget(double budget) {
		Aircraft.budget = budget;
	}

	public double getCurrentBudget() {
		return budget;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

}
