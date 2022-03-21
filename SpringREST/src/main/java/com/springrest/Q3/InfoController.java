package com.springrest.Q3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController
{
    @Autowired
    private InfoService infoService;

    @RequestMapping("/Infos")
    public List<Info> getAllInfo()
    {
        return infoService.getAllInfo();
    }

    @RequestMapping("/Infos/{zip}")
    public Info getInfo(@PathVariable String zip)
    {
        return infoService.getInfo(zip);
    }
}
