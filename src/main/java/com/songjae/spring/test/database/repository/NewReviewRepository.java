package com.songjae.spring.test.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.songjae.spring.test.database.domain.NewReview;


@Mapper
public interface NewReviewRepository {
	// storeID로 new_review테이블에서 해당 가게 리뷰 조회
	public List<NewReview> selectStoreReview(@Param("storeId") int storeId);
}
