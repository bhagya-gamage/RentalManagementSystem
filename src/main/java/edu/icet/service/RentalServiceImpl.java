package edu.icet.service;

import edu.icet.dto.Item;
import edu.icet.dto.Rental;
import edu.icet.entity.ItemEntity;
import edu.icet.entity.RentalEntity;
import edu.icet.repository.CustomerDao;
import edu.icet.repository.ItemDao;
import edu.icet.repository.RentalDao;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    private final RentalDao repository;
    private final ModelMapper mapper;
    private final CustomerDao customerDao;
    private final ItemDao itemDao;

    @Override
    public List<Rental> getAll() {
        List<Rental> rentalArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            rentalArrayList.add(mapper.map(entity, Rental.class));
        });
        return rentalArrayList;
    }

    @Override
    public void addRental(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public void deleteRentalById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Rental searchRentalById(Integer id) {
        return mapper.map(repository.findById(id), Rental.class);
    }

    @Override
    public void updateRentalById(Rental rental) {
        repository.save(mapper.map(rental,RentalEntity.class));
    }
}