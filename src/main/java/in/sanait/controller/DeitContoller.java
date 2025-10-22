package in.sanait.controller;
import in.sanait.entity.Diet;
import in.sanait.service.DietService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/{userId}/diet")
public class DeitContoller {

    private final DietService service;

    public DeitContoller(DietService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Diet> add(@PathVariable Long userId, @RequestBody Diet diet) {
        System.out.println("Add diet for user " + userId);
        return ResponseEntity.ok(service.add(userId, diet));
    }

    @GetMapping
    public ResponseEntity<Page<Diet>> list(@PathVariable Long userId,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(service.list(userId, pageable));
    }
}
