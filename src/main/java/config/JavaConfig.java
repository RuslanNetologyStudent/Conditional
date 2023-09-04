package config;

import systemProfile.DevProfile;
import systemProfile.SystemProfile;
import systemProfile.ProductionProfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {

        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {

        return new ProductionProfile();
    }
}