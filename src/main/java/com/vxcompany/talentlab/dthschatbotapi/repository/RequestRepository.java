package com.vxcompany.talentlab.dthschatbotapi.repository;

import com.vxcompany.talentlab.dthschatbotapi.model.DthsDataWrapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<DthsDataWrapper, Long> {
}
