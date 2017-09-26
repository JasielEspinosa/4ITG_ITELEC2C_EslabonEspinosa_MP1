package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public class A350 extends Aircraft {

	private Detail detail;
	
	@Override
	public String acID() {
		String text;
		text = "A350";
		return text;
	}

	@Override
	public String viewModel() {
		String text;
		text = "The Airbus A350";
		return text;
	}
	
	@Override
	public String viewImage() {
		String imagePath = "<img src='images/A350.jpg' class=\"image\"/>";
		return imagePath;
	}

	@Override
	public String viewDescription() {
		String text;
		text = "The Airbus A350 XWB is a family of long-range, twin-engine wide-body jet airliners "
				+ "developed by European aircraft manufacturer Airbus. "
				+ "The A350 is the first Airbus aircraft with both fuselage and wing structures "
				+ "made primarily of carbon-fibre-reinforced polymer. "
				+ "Its variants seat 280 to 366 passengers in typical three-class seating layouts. "
				+ "The A350 is positioned to succeed the A340, and compete with the Boeing 787 and 777. "
				+ "<br/><br/>The A350 was originally conceived in 2004 as a pairing of the A330's fuselage "
				+ "with new aerodynamics features and engines. In 2006, Airbus redesigned the aircraft "
				+ "in response to criticism from several major prospective customers "
				+ "and renamed it the A350 XWB (extra wide body). Development costs are estimated "
				+ "at €11 billion (US$15 billion or £9.5 billion). As of August 2017, Airbus had received "
				+ "848 orders for A350s from 46 customers worldwide. "
				+ "The prototype A350 first flew on 14 June 2013 from Toulouse, France. "
				+ "Type certification from the European Aviation Safety Agency was received in September 2014 "
				+ "and certification from the Federal Aviation Administration two months later. "
				+ "On 15 January 2015, the A350 entered service with Qatar Airways, the type's launch customer.";
		return text;
	}

	@Override
	public String viewSimilarModels() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>A350-941</li>" + "<li>A350-1041</li>" + "</ul>";
		return text;
	}

	@Override
	public String viewEngineTypes() {
		String text;
		text = "<ul style=\"list-style-type:disc\">" + "<li>Trent XWB-84</li>" + "<li>Trent XWB-97</li></ul>";
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
