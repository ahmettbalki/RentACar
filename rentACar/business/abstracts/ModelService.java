package com.ahmetbalki.rentACar.business.abstracts;

import java.util.List;

import com.ahmetbalki.rentACar.business.requests.CreateModelRequest;
import com.ahmetbalki.rentACar.business.responses.GetAllModelsResponse;

public interface ModelService {
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);
}
