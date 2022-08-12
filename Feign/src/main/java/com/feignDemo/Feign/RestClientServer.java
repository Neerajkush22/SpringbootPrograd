package com.feignDemo.Feign;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Headers("Content-Type:application/json")
@FeignClient(name = "${feign.name}",url = "${feign.url}")
public interface RestClientServer {
    @RequestMapping(value = "/app1/student/save",method = RequestMethod.POST)
    Student save(Student student);
}
