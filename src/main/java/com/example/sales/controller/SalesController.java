import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.sales.entity.Sales;
import com.example.sales.repository.SalesRepository;

@RestController
@RequestMapping("/api/sales")
@CrossOrigin(
        origins = "http://localhost:5173",
        allowedHeaders = "*",
        methods = {
                RequestMethod.GET,
                RequestMethod.POST,
                RequestMethod.PUT,
                RequestMethod.DELETE,
                RequestMethod.OPTIONS
        }
)
public class SalesController {

    private final SalesRepository repo;

    public SalesController(SalesRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Sales> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Sales create(@RequestBody Sales sales) {
        return repo.save(sales);
    }

    @PutMapping("/{id}")
    public Sales update(@PathVariable Long id, @RequestBody Sales sales) {
        sales.setId(id);
        return repo.save(sales);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}