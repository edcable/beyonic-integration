package org.mifos.beyonicIntegration.service.MifosGatewayService.domain;


import lombok.Data;

@Data
public class Status {

    private Integer id;

    private String code;

    private String description;

    private Integer statusCategory;
}
