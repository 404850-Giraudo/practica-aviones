package src.scaffolding.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "passenger")
    @OneToOne
    private PassengerEntity passengerEntity;

    @Column(name = "flight")
    @ManyToOne
    private FlightEntity flightEntity;

    @Column(name = "buy_date")
    private LocalDateTime buyDate;

    @Column(name = "board_date")
    private LocalDateTime boardDate;

    @Column(name = "price")
    private Double price;
}
