package de.m1well.spring.course.guestservice.api.service;

import de.m1well.spring.course.guestservice.api.model.GuestTo;
import de.m1well.spring.course.database.entity.GuestEntity;

import java.util.List;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
public interface GuestEntity2GuestToMapper {

    /**
     * maps the database entity object to a transfer object
     *
     * @param guestEntity
     * @return
     */
    GuestTo mapEntity2To(GuestEntity guestEntity);

    /**
     * maps a transfer object to the database entity object
     *
     * @param guestTo
     * @return
     */
    GuestEntity mapTo2Entity(GuestTo guestTo);

    /**
     * maps a list of database entity objects to a list of transfer objects
     *
     * @param guestEntityList
     * @return
     */
    List<GuestTo> mapEntityList2ToList(List<GuestEntity> guestEntityList);

    /**
     * maps a list of transfer objects to a list of database entity objects
     *
     * @param guestToList
     * @return
     */
    List<GuestEntity> mapToList2EntityList(List<GuestTo> guestToList);

}
