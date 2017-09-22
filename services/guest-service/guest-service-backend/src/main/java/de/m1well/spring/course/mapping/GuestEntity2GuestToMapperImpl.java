package de.m1well.spring.course.mapping;

import de.m1well.spring.course.api.model.GuestTo;
import de.m1well.spring.course.api.service.GuestEntity2GuestToMapper;
import de.m1well.spring.course.commons.mapping.date.DateMapper;
import de.m1well.spring.course.entity.GuestEntity;

import java.text.ParseException;
import java.util.List;

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
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public List<GuestEntity> mapToList2EntityList(List<GuestTo> guestToList) {
        return null;
    }

}
