package id.ac.polinema.dtsfit.modul11.controller;

import id.ac.polinema.dtsfit.modul11.dao.CaloriesDao;
import id.ac.polinema.dtsfit.modul11.entitas.Calories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v.1.0/")
public class CaloriesController {
    @Autowired
    private CaloriesDao caloriesDao;

    @GetMapping("/calories")
    public Iterable<Calories> getAll() {
        return caloriesDao.findAll();
    }

    @GetMapping("/calories/{id}")
    public Calories getCalories(@PathVariable("id") Integer id) {
        try {
            return caloriesDao.findById(id).orElseThrow(() -> new Exception("Not Found!"));
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/calories")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Calories caloriesDto) {
        caloriesDao.save(caloriesDto);
    }

    @PutMapping("/calories/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Calories caloriesDto, @PathVariable("id") Integer id) {
        try {
            Calories calories = caloriesDao.findById(id).orElseThrow(() -> new Exception("Not Found!"));
            caloriesDto.setId(id.intValue());
            caloriesDao.save(caloriesDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @DeleteMapping("/calories/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        caloriesDao.deleteById(id);
    }
}
