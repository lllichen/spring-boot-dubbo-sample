package xyz.tendu.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import xyz.tendu.EchoService;

/**
 * Created by lichen@daojia.com on 2017-12-26.
 */

@Component
public class AbcService {
    @Reference(version = "1.0.0")
    public EchoService echoService;
}
