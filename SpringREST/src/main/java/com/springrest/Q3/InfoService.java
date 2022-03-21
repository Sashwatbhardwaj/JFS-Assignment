package com.springrest.Q3;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InfoService
{
    private List<Info> infos = Arrays.asList(new Info("Gujarat","Ahmedabad","India","395007"),
            new Info("Tamil Nadu","Chennai","India","480046")
    );

    public List<Info> getAllInfo()
    {
        return infos;
    }

    public Info getInfo(String zip)
    {
        return infos.stream().filter(i->i.getZip().equals(zip)).findFirst().get();
    }
}
