package ksmart.mybatis.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart.mybatis.dto.Goods;
import ksmart.mybatis.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {

	private GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}
	
	public void addGoods(Goods goods) {
		goodsMapper.addGoods(goods);
		
	}
	
	public List<Goods> getGoodsList(Map<String, Object> paramMap){
		List<Goods> goodsList = goodsMapper.getGoodsList(paramMap);
		
		return goodsList;
	}
}
