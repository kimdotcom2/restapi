package com.backend.tourapi.ServiceImpl;

import com.backend.restapi.tourapi.Service.TourAPIService;
import com.backend.restapi.tourapi.ServiceImpl.TourAPIServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.tomcat.util.json.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

class TourAPIServiceImplTest {

    @Autowired
    TourAPIService tourAPIService = new TourAPIServiceImpl();
    String key = "gIY262VtYdeHjkVj0LjSSFlkA56X/H2B/WviOklAVEu6MHcP2YY1MO/sj4K30CfAmMCh/xeo7DCl8iyIQj3D6g==";

    @Test
    void 키워드기반검색테스트() throws JsonProcessingException, ParseException {



        tourAPIService.keywordSearchApi(key, "울", "1");
    }

    @Test
    void 지역기반검색테스트() {
        tourAPIService.areaBasedSearchApi(key, "1", "1");
    }

}