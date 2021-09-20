package org.sayner.sandbox.soap.endpoint;

import org.sayner.sandbox.soap.repository.CountryRepository;
import org.sayner.sandbox.soap.generated.*;
import org.sayner.sandbox.soap.service.UserService;
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
    private final UserService userService;

    public CountryEndpoint(CountryRepository countryRepository,
                           UserService userService) {
        this.countryRepository = countryRepository;
        this.userService = userService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest") // defines the handler method according to the namespace and localPart attributes
    @ResponsePayload // indicates that this method returns a value to be mapped to the response payload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        final GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getRest(@RequestPayload GetUserRequest request){
        final GetUserResponse response=new GetUserResponse();
        response.setUser(userService.findUserByEmail(request.getEmail()));
        userService.fluxUser();
        return response;
    }
}
