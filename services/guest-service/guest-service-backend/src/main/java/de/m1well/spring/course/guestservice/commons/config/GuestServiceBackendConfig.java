package de.m1well.spring.course.guestservice.commons.config;

import de.m1well.spring.course.guestservice.api.service.GuestEntity2GuestToMapper;
import de.m1well.spring.course.guestservice.mapping.GuestEntity2GuestToMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
@Configuration
public class GuestServiceBackendConfig {

    @Bean
    public GuestEntity2GuestToMapper guestEntity2GuestToMapper() {
        return new GuestEntity2GuestToMapperImpl();
    }

}
