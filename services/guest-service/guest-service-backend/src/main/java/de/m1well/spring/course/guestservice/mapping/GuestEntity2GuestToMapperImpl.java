package de.m1well.spring.course.guestservice.mapping;

import de.m1well.spring.course.guestservice.api.model.GuestTo;
import de.m1well.spring.course.guestservice.api.service.GuestEntity2GuestToMapper;
import de.m1well.spring.course.foundation.mapping.date.DateMapper;
import de.m1well.spring.course.database.entity.GuestEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
public class GuestEntity2GuestToMapperImpl implements GuestEntity2GuestToMapper {

    /**
     * {@inheritDoc}
     */
    public GuestTo mapEntity2To(GuestEntity guestEntity) {
        GuestTo guestTo = new GuestTo();
        guestTo.setId(guestEntity.getId());
        guestTo.setFirstName(guestEntity.getFirstName());
        guestTo.setLastName(guestEntity.getLastName());
        guestTo.setBirthDate(DateMapper.mapDateToString(guestEntity.getBirthDate()));
        return guestTo;
    }

    /**
     * {@inheritDoc}
     */
    public GuestEntity mapTo2Entity(GuestTo guestTo) {
        GuestEntity guestEntity = new GuestEntity();
        guestEntity.setId(guestTo.getId());
        guestEntity.setFirstName(guestTo.getFirstName());
        guestEntity.setLastName(guestTo.getLastName());
        try {
            guestEntity.setBirthDate(DateMapper.mapStingToDate(guestTo.getBirthDate()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return guestEntity;
    }

    /**
     * {@inheritDoc}
     */
    public List<GuestTo> mapEntityList2ToList(List<GuestEntity> guestEntityList) {
        List<GuestTo> guestToList = new ArrayList<>();
        for (GuestEntity guestEntity : guestEntityList) {
            guestToList.add(mapEntity2To(guestEntity));
        }
        return guestToList;
    }

    /**
     * {@inheritDoc}
     */
    public List<GuestEntity> mapToList2EntityList(List<GuestTo> guestToList) {
        List<GuestEntity> guestEntityList = new ArrayList<>();
        for (GuestTo guestTo : guestToList) {
            guestEntityList.add(mapTo2Entity(guestTo));
        }
        return  guestEntityList;
    }

}
