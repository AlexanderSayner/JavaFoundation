package org.sayner.sandbox.soap.client;

import org.sayner.sandbox.soap.generated.GetCountryRequest;
import org.sayner.sandbox.soap.generated.GetCountryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(CountryClient.class);

    public GetCountryResponse getCountry(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        logger.info("Requesting information for " + country);

        return (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

}
