package ph.com.smart.spring3.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import ph.com.smart.spring3.model.Branch;

@Component
public class BranchRepositoryImpl implements BranchRepositoryCustom {

	 @PersistenceContext
	 EntityManager entityManager;

	
	@Override
	@SuppressWarnings("unchecked")
	public List<Branch> getBranches() {
		Query query = entityManager.createNamedStoredProcedureQuery("getBranches");
		return query.getResultList();
	}
}
