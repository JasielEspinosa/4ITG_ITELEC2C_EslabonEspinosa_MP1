package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class B747 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "B747";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Boeing 747-400";
		return text;
	}

	@Override
	public String viewImage() {
		String imagePath = "<img src='images/B747 PAL.jpg' class=\"image\"/>"
				+ "<img src='images/B747 PAL_OLD01.jpg' class=\"image\"/>"
				+ "<img src='images/B747 PAL_OLD02.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Boeing 747 is an American wide-body commercial jet airliner and cargo aircraft, "
				+ "often referred to by its original nickname, \"Jumbo Jet\". Its distinctive \"hump\" "
				+ "upper deck along the forward part of the aircraft makes it among the world's most recognizable aircraft, "
				+ "and it was the first wide-body produced. Manufactured by Boeing's Commercial Airplane unit in the United States, "
				+ "the original version of the 747 was envisioned to have 150 percent greater capacity than the Boeing 707, "
				+ "one of the common large commercial aircraft of the 1960s. First flown commercially in 1970, "
				+ "the 747 held the passenger capacity record for 37 years.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>747-100	</li>" + "<li>747-100B	</li>"
				+ "<li>747-100SR	</li>" + "<li>747-200B	</li>" + "<li>747-200C	</li>" + "<li>747-200F	</li>"
				+ "<li>747-200M	</li>" + "<li>747 E-4A	</li>" + "<li>747-E4B	</li>" + "<li>747-300	</li>"
				+ "<li>747-300M	</li>" + "<li>747-300SR	</li>" + "<li>747-400	</li>" + "<li>747-400ER	</li>"
				+ "<li>747-400ERF</li>" + "<li>747-400F	</li>" + "<li>747-400M	</li>" + "<li>747-400D	</li>"
				+ "<li>747-8I	</li>" + "<li>747-8F	</li>" + "<li>747SP     </li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>CF6                   </li>"
				+ "<li>GE CF6	            </li>" + "<li>GEnx-2B67             </li>"
				+ "<li>Pratt & Whitney JT9D-7</li>" + "<li>PW4000                </li>"
				+ "<li>RB211                 </li>" + "<li>Rolls-Royce RB211-524 </li></ul>";
		return text;
	}

	@Override
	public double acPrice() {
		double amount;
		amount = 78500000.0;
		return amount;
	}
	
	@Override
	public String displayStatus() {
		String text;
		text = "Phasing Out";
		return text;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Detail getDetail() {
		return detail;
	}

}
