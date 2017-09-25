package com.aviation.utility;

import com.aviation.model.aircraft.*;
import com.aviation.model.details.*;

public class AircraftFactory implements AbstractFactory{
	
	public Aircraft getAircraft(String input){
		
		Aircraft aircraft = null;
		
		switch (input){
		
		case "A300":
			aircraft = new A300();
			break;
		case "A310":
			aircraft = new A310();
			break;
		case "A318":
			aircraft = new A318();
			break;
		case "A319":
			aircraft = new A319();
			break;
		case "A320":
			aircraft = new A320();
			break;
		case "A321":
			aircraft = new A321();
			break;
		case "A330":
			aircraft = new A330();
			break;
		case "A340":
			aircraft = new A340();
			break;
		case "A350":
			aircraft = new A350();
			break;
		case "A380":
			aircraft = new A380();
			break;
		case "B737":
			aircraft = new B737();
			break;
		case "B747":
			aircraft = new B747();
			break;
		case "B757":
			aircraft = new B757();
			break;
		case "B767":
			aircraft = new B767();
			break;
		case "B777":
			aircraft = new B777();
			break;
		case "B787":
			aircraft = new B787();
			break;
		case "DC8":
			aircraft = new DC8();
			break;
		case "DC9":
			aircraft = new DC9();
			break;
		case "DC10":
			aircraft = new DC10();
			break;
		case "MD80":
			aircraft = new MD80();
			break;
		case "MD90":
			aircraft = new MD90();
			break;
		case "MD11":
			aircraft = new MD11();
			break;
		}
		
		return aircraft;
	}

	@Override
	public Detail getDetail(String name) {
		return null;
	}

}
