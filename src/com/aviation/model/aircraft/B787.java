package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class B787 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "B787";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Boeing 787";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/B787.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Boeing 787 Dreamliner is an American long-haul, mid-size widebody, "
				+ "twin-engine jet airliner made by Boeing Commercial Airplanes. "
				+ "Its variants seat 242 to 335 passengers in typical three-class seating configurations. "
				+ "It is the first airliner with the use of composite materials as the primary material "
				+ "in the construction of its airframe. The 787 was designed to be 20% more fuel efficient "
				+ "than the Boeing 767, which it was intended to replace. "
				+ "The 787 Dreamliner's distinguishing features include mostly electrical flight systems, "
				+ "raked wingtips, and noise-reducing chevrons on its engine nacelles. "
				+ "It shares a common type rating with the larger Boeing 777 to allow qualified pilots to operate both models.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>787-8	</li>" + "<li>787-9	</li>" + "<li>787-10</li>"
				+ "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>General Electric GEnx-1B</li>"
				+ "<li>Rolls-Royce Trent 1000</li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 95100000.0;
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
