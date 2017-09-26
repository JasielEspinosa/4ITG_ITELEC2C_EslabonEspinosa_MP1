package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A310 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A310";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A310";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A310 FDX.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A310 is a medium - to long-range twin-engined wide-body jet airliner "
				+ "that was developed and manufactured by Airbus. Entering service in 1983, "
				+ "it was the second aircraft to enter production by Airbus, "
				+ "then a consortium of European aerospace manufacturers. "
				+ "The A310 is a smaller derivative of the Airbus A300, the first twin-engined widebody airliner.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">    " + "<li>General Electric CF6-80A3  </li>"
				+ "<li>General Electric CF6-80C2As</li>" + "<li>Pratt & Whitney JT9D-7R4s  </li>"
				+ "<li>Pratt & Whitney PW415s     </li>" + "</ul>                               ";
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
