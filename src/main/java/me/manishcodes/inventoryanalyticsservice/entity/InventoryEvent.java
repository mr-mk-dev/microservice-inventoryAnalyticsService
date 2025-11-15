package me.manishcodes.inventoryanalyticsservice.entity;

import jakarta.persistence.*;
import me.manishcodes.inventoryanalyticsservice.enums.ChangeType;

import java.time.LocalDateTime;

@Entity
public class InventoryEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;

    private int productId;

    private ChangeType changeType;

    private String quantityChange;

    private LocalDateTime eventTime = LocalDateTime.now();
    
}
