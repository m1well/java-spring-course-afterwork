package de.m1well.spring.course.guestservice.web.rest;

import de.m1well.spring.course.guestservice.api.model.GuestTo;
import de.m1well.spring.course.guestservice.api.service.GuestService;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
@RestController
@RequestMapping(value = "/guests")
@Scope("request")
public class GuestRestService {

    private final GuestService guestService;

    public GuestRestService(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping
    public GuestTo createGuest(@RequestBody GuestTo guestTo) {
        return guestService.createGuest(guestTo);
    }

    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<GuestTo> findGuestById(UUID id) {
        GuestTo guestTo = guestService.findGuestById(id);
        if (guestTo != null) {
            return new ResponseEntity<GuestTo>(guestTo, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    private boolean isGuestAlreadyStored(GuestTo guestTo) {
        // check if name is available
        return false;
    }

}
