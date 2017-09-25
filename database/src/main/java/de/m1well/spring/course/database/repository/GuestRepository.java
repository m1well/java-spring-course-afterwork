package de.m1well.spring.course.database.repository;

import de.m1well.spring.course.database.entity.GuestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * author: Michael Wellner<br/>
 * date: 24.09.17<br/>
 */
@Transactional
@Repository
public class GuestRepository {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public GuestEntity createGuest(GuestEntity guestEntity)
    {
        return this.hibernateTemplate.merge(guestEntity);
    }

    public GuestEntity findGuestById(UUID id) {
        return this.hibernateTemplate.load(GuestEntity.class, id);
    }

    public List<GuestEntity> findAllGuests()
    {
        return this.hibernateTemplate.loadAll(GuestEntity.class);
    }

}
