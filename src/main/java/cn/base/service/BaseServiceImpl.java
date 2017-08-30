package cn.base.service;

import cn.base.mapper.BaseCurdMapper;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;


public abstract class BaseServiceImpl<T> implements BaseService<T>{
	
	private BaseCurdMapper<T> mapper;
	
	@PostConstruct
	private void initMapper(){
		mapper = init();
	}
	
	public abstract BaseCurdMapper<T> init();


	public int add(T entity) {
		return this.mapper.insert(entity);
	}

	public int delete(T entity) {
		return this.mapper.deleteByPrimaryKey(entity);
	}

	public int modify(T entity) {
		return this.mapper.updateByPrimaryKey(entity);
	}

	public T findById(T id) {
		return this.mapper.selectByPrimaryKey(id);
	}

	public List<T> findByPage(Integer pageNo, Map<String, Object> params) {
		return this.mapper.selectByPage(pageNo,params);
	}

	public List<T> findByParam(Map<String, Object> params) {
		return this.mapper.selectByParams(params);
	}
}
