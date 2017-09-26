package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class MD80 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "MD80";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The McDonnell Douglas MD80";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/MD80 AAL.jpg' class=\"image\"/>";
		return imagePath;
	}
	
	@Override
	public String viewDescription() {
		String text;
		text = "The McDonnell Douglas MD-80 is a series of twin-engine, short - to medium-range, "
				+ "single-aisle commercial jet airliners. It was lengthened and updated from the DC-9. "
				+ "This series can seat from 130 to 172 passengers depending on variant and seating configuration. "
				+ "The MD-80 series was introduced into commercial service on October 10, 1980 by Swissair. "
				+ "The series includes the MD-81, MD-82, MD-83, MD-87, and MD-88. "
				+ "These all have the same fuselage length except the shortened MD-87. "
				+ "The series was followed into service in modified form by the MD-90 in 1995 and the Boeing 717 "
				+ "(originally MD-95) in 1999.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">"
				+"<li>MD-81  </li>"
				+"<li>MD-82  </li>"
				+"<li>MD-82T </li>"
				+"<li>MD-83  </li>"
				+"<li>MD-87  </li>"
				+"<li>MD-88  </li>"
				+"</ul>";
		return text;
	}
	
	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">"
				+"<li>Pratt & Whitney JT8D-200 series</li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 50000000.0;
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
