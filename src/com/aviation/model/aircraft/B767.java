package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class B767 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "B767";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Boeing 767";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/B767 BAE.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Boeing 767 is a mid- to large-size, mid - to long-range, wide-body twin-engine jet airliner "
				+ "built by Boeing Commercial Airplanes. "
				+ "It was Boeing's first wide-body twinjet and its first airliner with a two-crew glass cockpit. "
				+ "The aircraft has two turbofan engines, a conventional tail, and, for reduced aerodynamic drag, "
				+ "a supercritical wing design. Designed as a smaller wide-body airliner than earlier aircraft such as the 747, "
				+ "the 767 has seating capacity for 181 to 375 people, and a design range of 3,850 to 6,385 nautical miles "
				+ "(7,130 to 11,825 km), depending on variant. Development of the 767 occurred in tandem with a narrow-body "
				+ "twinjet, the 757, resulting in shared design features which allow pilots to obtain a common type rating "
				+ "to operate both aircraft.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>767-200		</li>" + "<li>767-200ER		</li>"
				+ "<li>767-2C (KC-46)</li>" + "<li>767-300		</li>" + "<li>767-300ER		</li>"
				+ "<li>767-300F		</li>" + "<li>767-400ER     </li>" + "</ul>";

		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>GE CF6-80A      </li>" + "<li>GE CF6-80A2     </li>"
				+ "<li>GE CF6-80C2-B2  </li>" + "<li>GE CF6-80C2-B4  </li>" + "<li>GE CF6-800C2-B6 </li>"
				+ "<li>GE CF6-80C2-B8F </li>" + "<li>GE CF6-80C2-B7F1</li>" + "<li>GE CF6-80C2-B8F </li>"
				+ "<li>P&W JT9D-7R4    </li>" + "<li>P&W JT9D-7R4E   </li>" + "<li>P&W PW4052      </li>"
				+ "<li>P&W PW4056      </li>" + "<li>P&W PW4060      </li>" + "<li>P&W PW4062      </li>"
				+ "<li>RB211-524G      </li>" + "<li>RB211-524H      </li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 46400000.0;
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
