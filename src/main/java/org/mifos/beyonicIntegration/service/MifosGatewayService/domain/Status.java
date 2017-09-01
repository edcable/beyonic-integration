package org.mifos.beyonicIntegration.service.MifosGatewayService.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Status {

    private Integer id;

    private String code;

    private String description;

    private Integer statusCategory;
}
