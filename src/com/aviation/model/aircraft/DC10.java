package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class DC10 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "DC10";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The McDonnell Douglas DC-10";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/DC10 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The McDonnell Douglas DC-10 is a three-engine wide-body jet airliner manufactured by McDonnell Douglas. "
				+ "It features two turbofan engines mounted on underwing pylons and a third engine at the base of the "
				+ "vertical stabilizer. The DC-10 has range for medium- to long-haul flights, capable of carrying a "
				+ "maximum of 380 passengers. <br/><br/>The DC-10 was intended as a successor to the McDonnell Douglas's "
				+ "DC-8 for long-range operations, using a wide-body layout to greatly increase the capacity of the aircraft. "
				+ "More powerful engines allowed it to be powered by three, the minimum allowed at that time for "
				+ "long overwater flights, which reduces maintenance costs relative to a four-engine design. "
				+ "Lockheed also saw this niche as an ideal place to reenter the commercial airliner market with their "
				+ "very similar L-1011 TriStar. Although the L-1011 was more technologically advanced, "
				+ "the DC-10 would go on to outsell the L-1011 by a significant margin, due to the L-1011's higher "
				+ "price and delayed entry in the market. The two designs split the market for sales, leaving both companies' "
				+ "commercial divisions unable to compete financially with Boeing and Airbus.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>DC-10-10</li>" + "<li>DC-10-15</li>" + "<li>DC-10-30</li>"
				+ "<li>DC-10-40</li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>GE CF6-6D   </li>" + "<li>GE CF6-50C2F</li>"
				+ "<li>GE CF6-50C  </li>" + "<li>PW JT9D-59A </li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 62000000.0;
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
