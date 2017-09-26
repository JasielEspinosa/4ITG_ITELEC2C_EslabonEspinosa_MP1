package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class B757 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "B757";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Boeing 757";
		return text;
	}

	@Override
	public String viewImage() {
		String imagePath = "<img src='images/B757 CEB.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Boeing 757 is a mid-size, narrow-body twin-engine jet airliner that was designed and built "
				+ "by Boeing Commercial Airplanes. It is the manufacturer's largest single-aisle passenger "
				+ "aircraft and was produced from 1981 to 2004. The twinjet has a two-crew member glass cockpit, "
				+ "turbofan engines of sufficient power to allow takeoffs from relatively short runways and higher altitudes, "
				+ "a conventional tail and, for reduced aerodynamic drag, a supercritical wing design. "
				+ "Intended to replace the smaller three-engine 727 on short and medium routes, "
				+ "the 757 can carry 200 to 295 passengers for a maximum of 3,150 to 4,100 nautical miles "
				+ "(5,830 to 7,590 km), depending on variant. The 757 was designed concurrently "
				+ "with a wide-body twinjet, the 767, and owing to shared features pilots can obtain a common type "
				+ "rating that allows them to operate both aircraft.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>757-200	</li>" + "<li>757-200M	</li>"
				+ "<li>757-200PF </li>" + "<li>757-300   </li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>Rolls-Royce RB211-535E4(B)</li>"
				+ "<li>Pratt & Whitney PW200037/40/43</li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 40750000.0;
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
