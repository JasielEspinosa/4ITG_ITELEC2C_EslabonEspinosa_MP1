package com.aviation.utility;

import com.aviation.model.aircraft.Aircraft;
import com.aviation.model.details.*;

public class DetailFactory implements AbstractFactory {

	public Detail getDetail(String input) {

		Detail detail = null;

		if (input.equalsIgnoreCase("A300")) {
			detail = new Details_Airbus();
		}
		else if (input.equalsIgnoreCase("A310")) {
			detail = new Details_Airbus();
		}
		else if (input.equalsIgnoreCase("A318")) {
			detail = new Details_A320Family();
		}
		else if (input.equalsIgnoreCase("A319")) {
			detail = new Details_A320Family();
		}
		else if (input.equalsIgnoreCase("A320")) {
			detail = new Details_A320Family();
		}
		else if (input.equalsIgnoreCase("A321")) {
			detail = new Details_A320Family();
		}
		else if (input.equalsIgnoreCase("A330")) {
			detail = new Details_Airbus();
		}
		else if (input.equalsIgnoreCase("A340")) {
			detail = new Details_Airbus();
		}
		else if (input.equalsIgnoreCase("A350")) {
			detail = new Details_Airbus();
		}
		else if (input.equalsIgnoreCase("A380")) {
			detail = new Details_Airbus();
		}
		else if (input.equalsIgnoreCase("B737")) {
			detail = new Details_Boeing();
		}
		else if (input.equalsIgnoreCase("B747")) {
			detail = new Details_Boeing();
		}
		else if (input.equalsIgnoreCase("B757")) {
			detail = new Details_Boeing();
		}
		else if (input.equalsIgnoreCase("B767")) {
			detail = new Details_Boeing();
		}
		else if (input.equalsIgnoreCase("B777")) {
			detail = new Details_Boeing();
		}
		else if (input.equalsIgnoreCase("B787")) {
			detail = new Details_Boeing();
		}
		else if (input.equalsIgnoreCase("DC8")) {
			detail = new Details_Douglas();
		}
		else if (input.equalsIgnoreCase("DC9")) {
			detail = new Details_Douglas();
		}
		else if (input.equalsIgnoreCase("DC10")) {
			detail = new Details_Douglas();
		}
		else if (input.equalsIgnoreCase("MD80")) {
			detail = new Details_Douglas();
		}
		else if (input.equalsIgnoreCase("MD90")) {
			detail = new Details_Douglas();
		}
		else if (input.equalsIgnoreCase("MD11")) {
			detail = new Details_Douglas();
		}
		

		return detail;
	}

	@Override
	public Aircraft getAircraft(String input) {
		return null;
	}


}
