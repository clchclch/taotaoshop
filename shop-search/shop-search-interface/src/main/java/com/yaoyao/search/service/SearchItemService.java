package com.yaoyao.search.service;

import com.yaoyao.common.pojo.ShopResult;

public interface SearchItemService {
	
	//将数据导入索引库
	ShopResult importItemsToIndex();

}
