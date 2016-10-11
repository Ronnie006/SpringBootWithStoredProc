package ph.com.smart.spring3.repository;

import org.springframework.data.repository.CrudRepository;

import ph.com.smart.spring3.model.Branch;

public interface BranchRepository extends CrudRepository<Branch, String>, BranchRepositoryCustom {

}
