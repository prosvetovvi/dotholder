package com.example.service.content;

import com.example.service.content.dotmodel.Device;
import com.example.service.content.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private ContentService contentService;

    @Autowired
    public void setContentService(ContentService contentService) {
        this.contentService = contentService;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String startPage(){
        return "Start page";
    }

    @RequestMapping("/devices")
    @ResponseBody
//    @Cacheable("devices")
    public String getDevices(){
        List<Device> devices = contentService.getDevices();
        StringBuilder builder = new StringBuilder();
        devices.stream().map(Device::getName).forEach(builder::append);
        return builder.toString();
    }
}
