package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A321 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A321";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A321";
		return text;
	}

	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A321 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A321 is a member of the Airbus A320 family of short - to medium-range, "
				+ "narrow-body, commercial passenger twin-engine jet airliners manufactured by Airbus. "
				+ "It was the first derivative of the baseline Airbus A320 aircraft, "
				+ "and carries up to 236 passengers with a maximum range of 3,200 nmi (5,900 km; 3,700 mi). "
				+ "Final assembly of the aircraft takes place in Hamburg, Germany or Mobile, Alabama in the US. <br/><br/>"
				+ "The A321 is a stretched-fuselage variant of the Airbus A320 and entered service in 1994 with Lufthansa, "
				+ "around six years after the original A320. "
				+ "The aircraft shares a common type rating with all other Airbus A320 family variants, "
				+ "allowing existing A320 family pilots to fly the aircraft without the need for further training.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A321-111</li>" + "<li>A321-112</li>" + "<li>A321-131</li>"
				+ "<li>A321-211</li>" + "<li>A321-212</li>" + "<li>A321-213</li>" + "<li>A321-231</li>"
				+ "<li>A321-232</li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>CFM56-5B1 or 5B1/P or 5B1/2P</li>"
				+ "<li>CFM56-5B2 or 5B2/P          </li>" + "<li>IAE Model V2530-A5          </li>"
				+ "<li>CFM56-5B3 or 5B3/P or 5B3/2P</li>" + "<li>CFM56-5B1 or 5B1/P or 5B1/2P</li>"
				+ "<li>CFM56-5B2 or 5B2/P          </li>" + "<li>IAE Model V2533-A5          </li>"
				+ "<li>IAE Model V2530-A5          </li></ul>";
		return text;
	}

	@Override
	public double acPrice() {
		double amount;
		amount = 21450000.0;
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
