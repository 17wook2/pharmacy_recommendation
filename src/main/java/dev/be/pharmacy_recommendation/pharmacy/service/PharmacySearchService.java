package dev.be.pharmacy_recommendation.pharmacy.service;

import dev.be.pharmacy_recommendation.pharmacy.dto.PharmacyDto;
import dev.be.pharmacy_recommendation.pharmacy.repository.PharmacyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PharmacySearchService {

    private final PharmacyRepository pharmacyRepository;

    public List<PharmacyDto> searchPharmacyDtoList() {

        return pharmacyRepository.findAll()
                .stream()
                .map(PharmacyDto::from)
                .collect(Collectors.toList());
    }

}
