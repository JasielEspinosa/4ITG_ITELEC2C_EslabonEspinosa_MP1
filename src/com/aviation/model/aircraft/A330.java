package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A330 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A330";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A330";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A330 PAL.jpg' class=\"image\"/>"
				+ "<img src='images/A330 CEB.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A330 is a medium - to long-range wide-body twin-engine jet airliner made by Airbus. "
				+ "Versions of the A330 have a range of 5,000 to 13,430 kilometres (2,700 to 7,250 nmi; 3,110 to 8,350 mi) "
				+ "and can accommodate up to 335 passengers in a two-class layout or carry 70 tonnes (154,000 lb) of cargo. "
				+ "<br/><br/>The A330's origin dates to the mid-1970s as one of several conceived derivatives of Airbus's "
				+ "first airliner, the A300. The A330 was developed in parallel with the four-engine A340, "
				+ "which shared many common airframe components but differed in number of engines. "
				+ "Both airliners incorporated fly-by-wire flight control technology, first introduced "
				+ "on an Airbus aircraft with the A320, as well as the A320's six-display glass cockpit. "
				+ "In June 1987, after receiving orders from various customers, Airbus launched the A330 and A340. "
				+ "The A330 was Airbus's first airliner that offered a choice of three engines: "
				+ "General Electric CF6, Pratt & Whitney PW4000, and Rolls-Royce Trent 700.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A330-201 </li>" + "<li>A330-202 </li>"
				+ "<li>A330-203 </li>" + "<li>A330-223 </li>" + "<li>A330-223F</li>" + "<li>A330-243 </li>"
				+ "<li>A330-243F</li>" + "<li>A330-301 </li>" + "<li>A330-302 </li>" + "<li>A330-303 </li>"
				+ "<li>A330-321 </li>" + "<li>A330-322 </li>" + "<li>A330-323 </li>" + "<li>A330-341 </li>"
				+ "<li>A330-342 </li>" + "<li>A330-343 </li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>General Electric CF6-80E1A2          </li>"
				+ "<li>General Electric CF6-80E1A4          </li>" + "<li>General Electric CF6-80E1A3          </li>"
				+ "<li>Pratt & Whitney PW4168A/4170         </li>" + "<li>Pratt & Whitney PW4170 (Freighter)   </li>"
				+ "<li>Rolls-Royce Trent 772B/C-60          </li>" + "<li>Rolls-Royce Trent 772B-60 (Freighter)</li>"
				+ "<li>General Electric CF6-80E1A2          </li>" + "<li>General Electric CF6-80E1A4          </li>"
				+ "<li>General Electric CF6-80E1A3          </li>" + "<li>Pratt & Whitney PW4164               </li>"
				+ "<li>Pratt & Whitney PW4168               </li>" + "<li>Pratt & Whitney PW4168A/4170         </li>"
				+ "<li>Rolls-Royce Trent 768-60             </li>" + "<li>Rolls-Royce Trent 772-60             </li>"
				+ "<li>Rolls-Royce Trent 772B/C-60          </li></ul>";
		return text;
	}
	
	@Override
	public double acPrice() {
		double amount;
		amount = 32150000.0;
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
