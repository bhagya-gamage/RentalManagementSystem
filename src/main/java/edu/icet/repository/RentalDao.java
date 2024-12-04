package edu.icet.repository;

import edu.icet.entity.ItemEntity;
import edu.icet.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalDao extends JpaRepository<RentalEntity,Integer> {
//    List<RentalEntity>
}
