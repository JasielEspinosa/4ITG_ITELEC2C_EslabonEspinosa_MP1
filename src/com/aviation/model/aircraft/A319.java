package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A319 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A319";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A319";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A319 PAL.jpg' class=\"image\"/>"
				+ "<img src='images/A319 CEB.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A319 is a member of the Airbus A320 family of short - to medium-range, narrow-body, "
				+ "commercial passenger twin-engine jet airliners manufactured by Airbus. "
				+ "The A319 carries up to 160 passengers and has a maximum range of 3,700 nmi (6,900 km; 4,300 mi). "
				+ "The A319 is a shortened-fuselage variant of the Airbus A320 and entered service in April 1996 with Swissair, "
				+ "around two years after the stretched Airbus A321 and eight years after the original A320. "
				+ "The aircraft shares a common type rating with all other Airbus A320 family variants, "
				+ "allowing existing A320 family pilots to fly the aircraft without the need for further training.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A319-111</li>" + "<li>A319-112</li>" + "<li>A319-113</li>"
				+ "<li>A319-114</li>" + "<li>A319-115</li>" + "<li>A319-131</li>" + "<li>A319-132</li>"
				+ "<li>A319-133</li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>CFM56-5B5 or 5B5/P          </li>"
				+ "<li>CFM56-5B6 or 5B6/P or 5B6/2P</li>" + "<li>CFM56-5A4 or 5A4/F          </li>"
				+ "<li>CFM56-5A5 or 5A5/F          </li>" + "<li>CFM56-5B7 or 5B7/P          </li>"
				+ "<li>IAE Model V2522-A5          </li>" + "<li>IAE Model V2524-A5          </li>"
				+ "<li>IAE Model V2527M-A5         </li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 19250000.0;
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
