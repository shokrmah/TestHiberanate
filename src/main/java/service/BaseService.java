package service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import dao.IBaseDao;


public abstract class BaseService<T extends Serializable, ID extends Serializable> 
implements IBaseService<T, ID> {

	
	public abstract IBaseDao<T, ID> getBaseDao();

	@Override
	public T getById(ID id) {
		Optional<T> optional = getBaseDao().findById(id);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	public List<T> getAll() {
		return getBaseDao().findAll();
	}

	@Override
	public T add(T entity) {
		return getBaseDao().save(entity);
	}

	@Override
	public T update(T entity) {
		return getBaseDao().save(entity);
	}


	@Override
	public void deleteById(ID id) {
		getBaseDao().deleteById(id);
	}

}
