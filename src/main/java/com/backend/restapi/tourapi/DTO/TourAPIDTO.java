package com.backend.restapi.tourapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//한국 관광정보 API에서 Response한 XML 결과를 담는 DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourAPIDTO {
    private String addr1;
    private String addr2;
    private String areacode;
    private String contentId;
    private String contentTypeId;
    private String mapx;
    private String mapy;
    private String title;
    private String image;
}

