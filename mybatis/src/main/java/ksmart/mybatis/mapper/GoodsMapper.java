package ksmart.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart.mybatis.dto.Goods;

@Mapper
public interface GoodsMapper {
	
	// 상품 등록
	public int addGoods(Goods goods);
	
	// 상품 목록 조회
	public List<Goods> getGoodsList(Map<String, Object> paramMap);
	
	
}
