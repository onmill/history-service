package edu.iu.owenmill.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.owenmill.historyservice.model.PrimesRecord;
import edu.iu.owenmill.repository.PrimesHistoryRepository;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    private final PrimesHistoryRepository primesHistoryRepository;
    public PrimesHistoryController(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }

    @GetMapping("/{customer}")
    public List<PrimesRecord> findall(@PathVariable String customer) {
        return primesHistoryRepository.findAllByCustomer(customer);
    }
}
