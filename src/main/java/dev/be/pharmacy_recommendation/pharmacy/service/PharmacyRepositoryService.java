package dev.be.pharmacy_recommendation.pharmacy.service;

import dev.be.pharmacy_recommendation.pharmacy.entity.Pharmacy;
import dev.be.pharmacy_recommendation.pharmacy.repository.PharmacyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class PharmacyRepositoryService {

    private final PharmacyRepository pharmacyRepository;

    @Transactional
    public void updateAddress(Long id, String address) {
        Pharmacy entity = pharmacyRepository.findById(id).orElse(null);
        if (Objects.isNull(entity)) {
            log.error("[PharmacyService updateAddress] not found id : {}", id);
            return;
        }
        entity.changePharmacyAddress(address);
    }

    @Transactional(readOnly = true)
    public List<Pharmacy> findAll() {
        return pharmacyRepository.findAll();
    }

}
