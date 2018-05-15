package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DummyBean {

    private String myProperty;

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String prop) {
        this.myProperty=prop;
    }
}