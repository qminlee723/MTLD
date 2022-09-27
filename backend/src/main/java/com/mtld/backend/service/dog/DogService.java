package com.mtld.backend.service.dog;

import com.mtld.backend.dto.dog.DogRequestDto;
import com.mtld.backend.dto.dog.DogResponseDetailDto;
import com.mtld.backend.dto.dog.DogUpdateRequestDto;
import com.mtld.backend.entity.dog.Breed;
import com.mtld.backend.entity.dog.Dog;
import com.mtld.backend.repository.dog.DogRepository;
import org.springframework.web.multipart.MultipartFile;


/**
 * created by myeongseok on 2022/09/16
 * updated by seongmin on 2022/09/27
 */
public interface DogService {

    Dog getDog(Long dogId);
    DogResponseDetailDto getDogById(Long uid, Long id);

    void registerDog(Long userId, DogRequestDto dogRequestDto, MultipartFile file);

    void updateDog(Long userId, DogUpdateRequestDto dogUpdateRequestDto);

    void deleteDog(Long userId, Long dogId);
}
