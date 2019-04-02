package com.vxcompany.talentlab.dthschatbotapi.repository;

import com.vxcompany.talentlab.dthschatbotapi.model.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<Data, Long> {
}
