package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class MD90 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "MD90";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "McDonnell Douglas MD-90";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/MD90 JAL.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The McDonnell Douglas MD-90 is a twin-engine, short- to medium-range, "
				+ "single-aisle commercial jet airliner. The MD-90 was developed from the MD-80 series. "
				+ "Differences from the MD-80 include more fuel-efficient International Aero Engines V2500 "
				+ "engines and a longer fuselage. The MD-90 has a seating capacity of up to 172 passengers "
				+ "and was introduced into service with Delta Air Lines in 1995. The MD-90 and the subsequent "
				+ "MD-95/Boeing 717 were derivatives of the MD-80, which itself was a derivative commercially "
				+ "introduced in 1980 from the DC-9.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>MD-90-30</li>" + "<li>MD-90-30ER</li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>IAE V2525-D5</li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 55400000.0;
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
