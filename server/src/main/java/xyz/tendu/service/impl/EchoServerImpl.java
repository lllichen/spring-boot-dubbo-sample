package xyz.tendu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import xyz.tendu.EchoService;


/**
 * Created by lichen@daojia.com on 2017-12-26.
 */
@Service(version = "1.0.0")
public class EchoServerImpl implements EchoService {

    public String echo(String str) {
        System.out.println(str);
        return str;
    }
}