package id.ac.polinema.dtsfit.modul11.entitas;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Calories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String food;
    private int calory;
}
