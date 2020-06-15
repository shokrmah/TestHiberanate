package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import service.RegionService;
import web.BaseResponse;
import web.SuccessResponse;
import Model.Region;

@CrossOrigin
@RestController
@RequestMapping("/region")
public class RegionController {

	@Autowired
	private RegionService regionService;


	@RequestMapping(path = "", method = RequestMethod.GET)
	public BaseResponse getAll() {
		System.out.println("Get response");
		return new SuccessResponse<List<Region>>(regionService.getAll());
	}

	
	@RequestMapping(path = "", method = RequestMethod.POST)
	public BaseResponse add(@RequestBody Region region) {
		return new SuccessResponse<Region>(regionService.add(region));
	}
	
	@RequestMapping(path = "", method = RequestMethod.PUT)
	public BaseResponse update(@RequestBody Region region) {
		return new SuccessResponse<Region>(regionService.update(region));
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public BaseResponse getById(@PathVariable("id") Integer id) {
		return new SuccessResponse<Region>(regionService.getById(id));
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public BaseResponse deleteById(@PathVariable Integer id) {
		regionService.deleteById(id);
		return new SuccessResponse<>(null);
	}

	
}
