package com.springlec.base.service.main;

import com.springlec.base.model.user.NUserOrderDto;

public interface NDProductListService {
	public NUserOrderDto productListDao(String pcode) throws Exception;
}
