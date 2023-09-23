package com.springlec.base.dao.main;

import com.springlec.base.model.user.NUserOrderDto;

public interface NDProductListDao {
	public NUserOrderDto productListDao(String pcode) throws Exception;
}
