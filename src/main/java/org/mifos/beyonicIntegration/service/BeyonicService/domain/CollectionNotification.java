package org.mifos.beyonicIntegration.service.BeyonicService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.mifos.beyonicIntegration.service.BeyonicService.domain.Collection;
import org.mifos.beyonicIntegration.service.BeyonicService.domain.Hook;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectionNotification {
    @JsonProperty("hook")
    private Hook hook;

    @JsonProperty("data")
    private Collection data;
}
