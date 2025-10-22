package in.sanait.repository;
import in.sanait.entity.Diet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietRepository extends JpaRepository<Diet, Long> {
    Page<Diet> findByUserId(Long userId, Pageable pageable);
}

