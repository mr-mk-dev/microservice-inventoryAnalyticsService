package me.manishcodes.inventoryanalyticsservice.repository;

import me.manishcodes.inventoryanalyticsservice.entity.InventoryEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends
        JpaRepository<InventoryEvent,Integer> {
    
}
