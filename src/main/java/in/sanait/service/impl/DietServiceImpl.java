package in.sanait.service.impl;
import in.sanait.entity.Diet;
import in.sanait.repository.DietRepository;
import in.sanait.service.DietService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DietServiceImpl implements DietService {

    private final DietRepository repository;

    public DietServiceImpl(DietRepository repository) {
        this.repository = repository;
    }

    @Override
    public Diet add(Long userId, Diet diet) {
        diet.setUserId(userId);
        Diet saved = repository.save(diet);
        System.out.println("Diet added for user " + userId + ": " + saved.getMealType());
        return saved;
    }

    @Override
    public Page<Diet> list(Long userId, Pageable pageable) {
        System.out.println("Fetching diets for user " + userId);
        return repository.findByUserId(userId, pageable);
    }
}
