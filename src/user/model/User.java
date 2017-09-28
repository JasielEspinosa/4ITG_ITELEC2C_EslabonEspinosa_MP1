package user.model;

public class User {

	private double budget;

	public User() {
		setBudget(200000000000.0);
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

}
