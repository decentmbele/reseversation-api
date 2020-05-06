package za.co.decent.reservation.api.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.decent.reservation.api.data.entity.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {
}
