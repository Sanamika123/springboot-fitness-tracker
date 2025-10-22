package in.sanait.service;


import in.sanait.entity.Diet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DietService {
    Diet add(Long userId, Diet diet);
    Page<Diet> list(Long userId, Pageable pageable);
}

