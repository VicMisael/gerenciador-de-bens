package br.ufc.nuvem.patrimoniomanager.repository;

import br.ufc.nuvem.patrimoniomanager.model.Validation;
import br.ufc.nuvem.patrimoniomanager.strategy.ValidationLogStrategy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ValidationRepositoryImpl implements ValidationRepository {
    ValidationLogStrategy validationLogStrategy;

    @Override
    public Validation addValidation(Validation validation) {
        return validationLogStrategy.uploadValidation(validation);
    }

    @Override
    public List<Validation> getValidationByBemId(Long id) {
        return validationLogStrategy.getValidationListByBemId(id);
    }


}
