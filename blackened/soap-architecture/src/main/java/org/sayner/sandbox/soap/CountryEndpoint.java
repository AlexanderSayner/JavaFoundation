package org.sayner.sandbox.soap;

import org.sayner.sandbox.soap.generated.GetCountryRequest;
import org.sayner.sandbox.soap.generated.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * The SOAP web service endpoint class will handle all the incoming requests for the service.
 * It will initiate the processing and will send the response back.
 */
@Endpoint // Registers the class with Spring WS as a Web Service Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://www.sayner.org/sandbox/soap/generated";

    private final CountryRepository countryRepository;

    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest") // defines the handler method according to the namespace and localPart attributes
    @ResponsePayload // indicates that this method returns a value to be mapped to the response payload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        final GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        return response;
    }
}
