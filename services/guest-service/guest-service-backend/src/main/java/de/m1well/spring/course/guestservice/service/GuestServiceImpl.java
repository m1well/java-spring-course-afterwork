package de.m1well.spring.course.guestservice.service;

import de.m1well.spring.course.guestservice.api.model.GuestTo;
import de.m1well.spring.course.guestservice.api.service.GuestEntity2GuestToMapper;
import de.m1well.spring.course.guestservice.api.service.GuestService;
import de.m1well.spring.course.database.entity.GuestEntity;
import de.m1well.spring.course.database.repository.GuestRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;
    private final GuestEntity2GuestToMapper guestEntity2GuestToMapper;

    @Autowired
    public GuestServiceImpl(GuestRepository guestRepository, GuestEntity2GuestToMapper guestEntity2GuestToMapper) {
        this.guestRepository = guestRepository;
        this.guestEntity2GuestToMapper = guestEntity2GuestToMapper;
    }

    public GuestTo createGuest(GuestTo guestTo) {
        GuestEntity guestEntityToCreate = guestEntity2GuestToMapper.mapTo2Entity(guestTo);
        // check if guestEntityToCreate is available in database
        guestEntityToCreate = generateUUID(guestEntityToCreate);
        guestEntityToCreate = setTimestampCreated(guestEntityToCreate);
        GuestEntity guestEntityCreated = guestRepository.createGuest(guestEntityToCreate);
        return guestEntity2GuestToMapper.mapEntity2To(guestEntityCreated);
    }

    public GuestTo findGuestById(UUID id) {
        // do the hibernate implementation
        GuestEntity guestEntity = guestRepository.findGuestById(id);
        return guestEntity2GuestToMapper.mapEntity2To(guestEntity);
    }

    public List<GuestTo> findAllGuests() {
        List<GuestEntity> guestEntityList = guestRepository.findAllGuests();
        return guestEntity2GuestToMapper.mapEntityList2ToList(guestEntityList);
    }

    public GuestTo updateGuest(UUID id) {
        // do the hibernate implementation
        GuestEntity guestEntity = new GuestEntity();
        guestEntity = setTimestampUpdated(guestEntity);
        return guestEntity2GuestToMapper.mapEntity2To(guestEntity);
    }

    public boolean deleteGuest(UUID id) {
        // do the hibernate implementation
        return true;
    }

    private GuestEntity generateUUID(GuestEntity guestEntity) {
        guestEntity.setId(UUID.randomUUID());
        return guestEntity;
    }

    private GuestEntity setTimestampCreated(GuestEntity guestEntity) {
        guestEntity.setTimestampCreated(new DateTime());
        return guestEntity;
    }

    private GuestEntity setTimestampUpdated(GuestEntity guestEntity) {
        guestEntity.setTimestampUpdated(new DateTime());
        return guestEntity;
    }

}
