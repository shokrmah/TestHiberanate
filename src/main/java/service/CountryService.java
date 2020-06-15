package service;

import org.springframework.beans.factory.annotation.Autowired;
import Model.Country;
import dao.IBaseDao;
import dao.ICountryDao;

public class CountryService extends BaseService<Country, String> implements ICountryService{

	@Autowired
	private ICountryDao countryDao;

	
	@Override
	public IBaseDao<Country, String> getBaseDao() {
		// TODO Auto-generated method stub
		return countryDao;
	}

	
}
