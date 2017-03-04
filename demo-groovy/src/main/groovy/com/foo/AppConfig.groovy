package com.foo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * Created by manish on 4/3/17.
 */

@Component
@ConfigurationProperties(prefix = 'app-config')
class AppConfig {
    String appVersion
    String appName

    @Override
    public String toString() {
        return "AppConfig{" +
                "appVersion='" + appVersion + '\'' +
                ", appName='" + appName + '\'' +
                '}';
    }
}
