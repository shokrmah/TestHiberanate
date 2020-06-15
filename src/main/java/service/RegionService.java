package service;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Region;
import dao.IBaseDao;
import dao.IRegionDao;

public class RegionService extends BaseService<Region, Integer> implements IRegionService{

	@Autowired
	private IRegionDao regionDao;
	
	@Override
	public IBaseDao<Region, Integer> getBaseDao() {
		// TODO Auto-generated method stub
		return regionDao;
	}

}
