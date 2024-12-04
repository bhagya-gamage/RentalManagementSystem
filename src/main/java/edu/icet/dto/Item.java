package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private Integer itemId;
    private String name;
    private Boolean availability;
    private String contact;
    private Double rentalPerDay;
    private Double finePerDay;
}