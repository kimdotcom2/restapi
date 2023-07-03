package com.backend.restapi.tourapi.Controller;

import com.backend.restapi.tourapi.DTO.TourAPIDTO;
import com.backend.restapi.tourapi.Service.TourAPIService;
import com.backend.restapi.tourapi.ServiceImpl.TourAPIServiceImpl;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;


@RestController
public class TourRestAPIController {

    public final TourAPIServiceImpl tourAPIService;

    public TourRestAPIController(TourAPIService tourAPIService) {
        this.tourAPIService = (TourAPIServiceImpl) tourAPIService;
    }

    @GetMapping("/keywordSearch")
    public List<?> tourListApiByKeyword(
            @RequestParam String keyword,
            @RequestParam String pageNo
    ) {
        String key = "gIY262VtYdeHjkVj0LjSSFlkA56X/H2B/WviOklAVEu6MHcP2YY1MO/sj4K30CfAmMCh/xeo7DCl8iyIQj3D6g==";

        List<TourAPIDTO> tourAPIDTOS = tourAPIService.keywordSearchApi(key, keyword, pageNo);

        return tourAPIDTOS;
    }

    @GetMapping("/areaBasedSearch")
    public List<TourAPIDTO> tourListApiByArea(
            @RequestParam String areaCode,
            @RequestParam String pageNo
    ) {
        String key = "gIY262VtYdeHjkVj0LjSSFlkA56X/H2B/WviOklAVEu6MHcP2YY1MO/sj4K30CfAmMCh/xeo7DCl8iyIQj3D6g==";

        List<TourAPIDTO> tourAPIDTOS = tourAPIService.areaBasedSearchApi(key, areaCode, pageNo);

        return tourAPIDTOS;
    }

    @ExceptionHandler({MissingServletRequestParameterException.class, HttpServerErrorException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String handleMissingServletRequestParameterException() {
        System.out.println("예외 발생!\nMissingServletRequestParameterException");
        return "Bad Request";
    }

    @ExceptionHandler(JSONException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleJsonException() {
        System.out.println("예외 발생!\nJSONException");
        return "Server Error";
    }
}
