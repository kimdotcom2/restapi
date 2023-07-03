package com.backend.restapi.tourapi.Service;

import com.backend.restapi.tourapi.DTO.TourAPIDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.tomcat.util.json.ParseException;

import java.util.List;

public interface TourAPIService {

    //키워드기반검색 API
    public List<TourAPIDTO> keywordSearchApi(String serviceKey, String keyword, String pageNo) throws JsonProcessingException, ParseException;

    //지역기반검색 API
    public List<TourAPIDTO> areaBasedSearchApi(String serviceKey, String areaCode, String pageNo);
}
