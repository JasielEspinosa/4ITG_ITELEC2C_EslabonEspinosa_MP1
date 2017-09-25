package com.aviation.model.details;

public class Details_A320Family extends Detail {

	@Override
	public String displayManufacturer() {
		String text;
		text = "Airbus";
		return text;
	}

	@Override
	public String displayDetail() {
		String text;
		text = "The Airbus A320 family consists of short - to medium-range, narrow-body, "
				+ "commercial passenger twin-engine jet airliners manufactured by Airbus. "
				+ "The family includes the A318, A319, A320 and A321, as well as the ACJ business jet. "
				+ "The A320s are also named A320ceo (current engine option) after the introduction of the A320neo. "
				+ "Final assembly of the family takes place in Toulouse, France, and Hamburg, Germany. "
				+ "A plant in Tianjin, China, has also been producing aircraft for Chinese airlines since 2009, "
				+ "while a final assembly facility in Mobile, Alabama, United States, delivered its first A321 in April 2016. "
				+ "The aircraft family can accommodate up to 220 passengers "
				+ "and has a range of 3,100 to 12,000 km (1,700 to 6,500 nmi), depending on model.";
		return text;
	}

}
