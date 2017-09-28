package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class DC8 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "DC8";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The McDonnell Douglas DC-8";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/DC8 PAL.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Douglas DC-8 (also known as the McDonnell Douglas DC-8) is a four-engine long-range narrow-body "
				+ "jet airliner built from 1958 to 1972 by the Douglas Aircraft Company. "
				+ "Launched after the competing Boeing 707, the DC-8 nevertheless kept Douglas "
				+ "in a strong position in the airliner market, and remained in production until 1972 "
				+ "when it began to be superseded by larger wide-body designs, including the Boeing 747, "
				+ "McDonnell Douglas DC-10 and Lockheed L-1011 TriStar. "
				+ "The DC-8's design allowed it a slightly larger cargo capacity than the 707 and some "
				+ "re-engined DC-8s are still in use as freighters.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>DC-8-10</li>" + "<li>DC-8-20</li>" + "<li>DC-8-30</li>"
				+ "<li>DC-8-40</li>" + "<li>DC-8-43</li>" + "<li>DC-8-50</li>" + "<li>DC-8-55</li>" + "<li>DC-8-61</li>"
				+ "<li>DC-8-62</li>" + "<li>DC-8-63</li>" + "<li>DC-8-71</li>" + "<li>DC-8-72</li>" + "<li>DC-8-73</li>"
				+ "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>CFM56-2    </li>" + "<li>P&W JT4A-3 </li>"
				+ "<li>P&W JT4A-5 </li>" + "<li>P&W JT4A-9 </li>" + "<li>P&W JT4A-10</li>" + "<li>P&W JT3C-6 </li>"
				+ "<li>P&W JT3D-3 </li>" + "<li>P&W JT3D-3B</li>" + "<li>RCo.12     </li></ul>";
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
