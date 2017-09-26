package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A300 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A300";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A300";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A300 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A300 is a wide-body twin-engine jet airliner that was developed and manufactured by Airbus. "
				+ "Formally announced in 1969 and first flying in October 1972, "
				+ "it holds the distinction of being the world's first twin-engined widebody airliner; "
				+ "it was also the first product of Airbus Industrie, a consortium of European aerospace manufacturers, "
				+ "now a subsidiary of Airbus. The A300 can typically seat 266 passengers in a two-class layout, "
				+ "with a maximum range of 4,070 nautical miles (7,540 km) when fully loaded, depending on model.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A300B2-1A  </li>" + "<li>A300B2-1C  </li>"
				+ "<li>A300B2K-3C </li>" + "<li>A300B4-2C  </li>" + "<li>A300B4-103 </li>" + "<li>A300B4-120 </li>"
				+ "<li>A300B2-203 </li>" + "<li>A300B4-203 </li>" + "<li>A300B4-220 </li>" + "<li>A300B4-601 </li>"
				+ "<li>A300B4-603 </li>" + "<li>A300B4-620 </li>" + "<li>A300B4-622 </li>" + "<li>A300B4-605R</li>"
				+ "<li>A300B4-622R</li>" + "<li>A300F4-605R</li>" + "<li>A300F4-622R</li>" + "<li>A300C4-605R</li>"
				+ "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">"
				+"<li>General Electric CF6-50s 	 </li>"
				+"<li>General Electric CF6-80C2As</li>"
				+"<li>Pratt & Whitney JT9D-59s 	 </li>"
				+"<li>Pratt & Whitney JT9D-7R4H1 </li>"
				+"<li>Pratt & Whitney PW4158 </li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 0.0;
		return amount;
	}
	
	@Override
	public String displayStatus() {
		String text;
		text = "Not For Sale";
		return text;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Detail getDetail() {
		return detail;
	}

}
