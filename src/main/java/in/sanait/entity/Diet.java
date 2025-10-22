package in.sanait.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String mealType;
    private String description;
    private Integer calories;
    private LocalDate date = LocalDate.now();

    public Diet() {}

    public Diet(Long id, Long userId, String mealType, String description, Integer calories, LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.mealType = mealType;
        this.description = description;
        this.calories = calories;
        this.date = date;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getMealType() { return mealType; }
    public void setMealType(String mealType) { this.mealType = mealType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Integer getCalories() { return calories; }
    public void setCalories(Integer calories) { this.calories = calories; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
