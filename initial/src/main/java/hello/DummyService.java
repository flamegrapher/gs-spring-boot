package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    @Autowired
    private DummyBean bean;

    public String getMessage() {
        return bean.getMyProperty();
    }


}