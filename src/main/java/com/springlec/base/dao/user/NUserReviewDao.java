package com.springlec.base.dao.user;

import java.util.List;

import com.springlec.base.model.user.NUserReviewDto;

public interface NUserReviewDao {
	public List<NUserReviewDto> reviewList(String pcode) throws Exception;
	public List<NUserReviewDto> reviewAdminList(String pcode) throws Exception;
	
	//review작성
	public void NDReviewWriteDao(int seq,String userid,int ordercode,String pcode,String content) throws Exception;
	public void NDWriteReviewUserDao(int seq, String userid, String pcode) throws Exception;
	
}
