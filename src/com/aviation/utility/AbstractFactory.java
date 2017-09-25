package com.aviation.utility;

import com.aviation.model.aircraft.*;
import com.aviation.model.details.*;

public interface AbstractFactory {
	
	Aircraft getAircraft(String input);
	Detail getDetail(String name);

}
