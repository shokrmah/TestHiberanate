package service;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T extends Serializable, ID extends Serializable> {

	T getById(ID id);
	
	List<T> getAll();

	T add(T entity);

	T update(T entity);

	void deleteById(ID id);
}
