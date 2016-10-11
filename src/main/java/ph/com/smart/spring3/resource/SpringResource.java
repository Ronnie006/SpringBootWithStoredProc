package ph.com.smart.spring3.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ph.com.smart.spring3.model.Branch;
import ph.com.smart.spring3.repository.BranchRepository;

@RestController
public class SpringResource {

	@Autowired
	BranchRepository branchRepository;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public List<Branch> getBranches(){
		List<Branch> branches = branchRepository.getBranches();
//		for(Branch branch: branches){
//			System.out.println(branch);
//		}
		return branches;
	}
}
