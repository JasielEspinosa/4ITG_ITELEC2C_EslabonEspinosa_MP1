package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A380 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A380";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A380";
		return text;
	}

	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A380 UAE.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A380 is a double-deck, wide-body, four-engine jet airliner manufactured by European manufacturer Airbus. "
				+ "It is the world's largest passenger airliner, and the airports at which it operates have upgraded facilities "
				+ "to accommodate it. It was initially named Airbus A3XX and designed to challenge Boeing's monopoly in the "
				+ "large-aircraft market. The A380 made its first flight on 27 April 2005 and entered commercial service on "
				+ "25 October 2007 with Singapore Airlines. An improved version, the A380plus, is under development. <br/><br/>"
				+ "The A380's upper deck extends along the entire length of the fuselage, "
				+ "with a width equivalent to a wide-body aircraft. This gives the A380-800's cabin 550 square metres "
				+ "(5,920 sq ft) of usable floor space, 40% more than the next largest airliner, the Boeing 747-8, and "
				+ "provides seating for 525 people in a typical three-class configuration or up to 853 people in an all-economy "
				+ "class configuration. The A380-800 has a design range of 8,500 nautical miles (15,700 km), "
				+ "serving the second - and third-longest non-stop scheduled flights in the world (as of February 2017), "
				+ "and a cruising speed of Mach 0.85 (about 900 km/h, 560 mph or 490 kt at cruising altitude).";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A380-841</li>" + "<li>A380-842</li>" + "<li>A380-861</li>"
				+ "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>Trent 970-84/970B-84  </li>"
				+ "<li>Trent 972-84/972B-84  </li>" + "<li>Engine Alliance GP7270</li></ul>";
		return text;
	}

	@Override
	public double acPrice() {
		double amount;
		amount = 100000000.0;
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
