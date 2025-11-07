package co.develhope.OperazioniV1;
import co.develhope.OperazioniV1.CarType;
import co.develhope.OperazioniV1.CarColor;
import jakarta.persistence.*;


@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CarType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private  CarColor color;

    public Car() {}

    public Long getId() { return id;}
    public void setId(Long id) { this.id = id;}

    public String getModelName() { return modelName; }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CarType getType() {return type;}
    public void setType(CarType type) {this.type = type;}

    public CarColor getColor() {return color;}
    public void setColor(CarColor color) {this.color = color;}

}
