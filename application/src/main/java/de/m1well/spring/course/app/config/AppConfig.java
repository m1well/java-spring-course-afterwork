package de.m1well.spring.course.app.config;

import de.m1well.spring.course.database.config.DatabaseConfig;
import de.m1well.spring.course.guestservice.web.config.WebConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * author: Michael Wellner<br/>
 * date: 23.09.17<br/>
 */
@Configuration
@Import({DatabaseConfig.class, WebConfig.class})
public class AppConfig {
}
