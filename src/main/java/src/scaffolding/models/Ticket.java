package src.scaffolding.models;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import src.scaffolding.entities.FlightEntity;
import src.scaffolding.entities.PassengerEntity;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {

    private Long id;


    private PassengerEntity passengerEntity;


    private FlightEntity flightEntity;


    private LocalDateTime buyDate;


    private LocalDateTime boardDate;


    private Double price;
}
