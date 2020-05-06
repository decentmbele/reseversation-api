package za.co.decent.reservation.api.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.decent.reservation.api.data.entity.Hotel;
import za.co.decent.reservation.api.data.repository.HotelRepository;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public Hotel addHotel(Hotel hotel){
        return hotelRepository.save(hotel);
    }

}
