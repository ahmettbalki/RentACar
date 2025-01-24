package com.ahmetbalki.rentACar.business.abstracts;

import java.util.List;

import com.ahmetbalki.rentACar.business.requests.CreateBrandRequest;
import com.ahmetbalki.rentACar.business.requests.UpdateBrandRequest;
import com.ahmetbalki.rentACar.business.responses.GetAllBrandsResponse;
import com.ahmetbalki.rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
}
