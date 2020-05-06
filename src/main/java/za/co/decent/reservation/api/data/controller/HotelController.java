package za.co.decent.reservation.api.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.decent.reservation.api.data.entity.Hotel;
import za.co.decent.reservation.api.data.service.HotelService;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/hotel")
    public String addHotel(@RequestBody Hotel hotel) {
        Hotel h = hotelService.addHotel(hotel);
        return "Hotel has been created with " + h.getId();
    }
}
