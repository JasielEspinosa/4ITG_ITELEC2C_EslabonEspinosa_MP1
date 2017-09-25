package com.aviation.model.aircraft;

import com.aviation.model.details.*;

public abstract class Aircraft {
	
	public abstract String viewModel();
	public abstract String viewDescription();
	public abstract String viewSimilarModels();
	public abstract String viewEngineTypes();
	public abstract void setDetail(Detail detail);
	public abstract Detail getDetail();
	public abstract String viewImage();

}
