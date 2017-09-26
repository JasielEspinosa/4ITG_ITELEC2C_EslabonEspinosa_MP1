package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A318 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A318";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A318";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A318 AIB.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A318 is the smallest member of the Airbus A320 family of short - to medium-range, "
				+ "narrow-body, commercial passenger twin-engine jet airliners manufactured by Airbus. "
				+ "The A318 carries up to 132 passengers and has a maximum range of 3,100 nmi (5,700 km; 3,600 mi). "
				+ "It is intended primarily for short-range service. "
				+ "The aircraft shares a common type rating with all other Airbus A320 family variants, "
				+ "allowing existing A320 family pilots to fly the aircraft without the need for further training. "
				+ "It is the largest commercial aircraft certified by the European Aviation Safety Agency for steep approach operations.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A318-111</li>" + "<li>A318-112</li>" + "<li>A318-121</li>"
				+ "<li>A318-122</li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>CFM56-5B8/P</li>" + "<li>CFM56-5B9/P</li>"
				+ "<li>PW6122A    </li>" + "<li>PW6124A    </li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 18000000.0;
		return amount;
	}
	
	@Override
	public String displayStatus() {
		String text;
		text = "";
		return text;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Detail getDetail() {
		return detail;
	}

}
