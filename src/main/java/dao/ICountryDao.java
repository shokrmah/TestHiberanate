package dao;

import org.springframework.stereotype.Repository;

import Model.Country;

@Repository
public interface ICountryDao extends IBaseDao<Country, String>{

}
