package com.slmanju.servicea.service;

import com.slmanju.servicea.dto.Message;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b")
@RibbonClient(name = "service-b")
//@FeignClient(name = "service-b", url = "http://localhost:7005")
public interface MessageClientFeign {

    @GetMapping("/")
    Message message();

}
