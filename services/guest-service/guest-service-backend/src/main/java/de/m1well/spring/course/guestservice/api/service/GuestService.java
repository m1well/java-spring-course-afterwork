package de.m1well.spring.course.guestservice.api.service;

import de.m1well.spring.course.guestservice.api.model.GuestTo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
@Service
public interface GuestService {

    GuestTo createGuest(GuestTo guestTo);

    GuestTo findGuestById(UUID id);

    List<GuestTo> findAllGuests();

    GuestTo updateGuest(UUID id);

    boolean deleteGuest(UUID id);
}
