package com.yaoyao.search.service;

import com.yaoyao.common.pojo.SearchResult;

public interface SearchService {
	
	SearchResult search(String queryString,int page,int rows) throws Exception;
}
