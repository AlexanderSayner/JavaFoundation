package org.sayner.sandbox.rest.helper.soap;

import org.sayner.sandbox.rest.helper.LockVaccPackageRequest;
import org.sayner.sandbox.rest.helper.UnlockVaccPackageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
//import ru.mos.emias.soap.gateway.core.v1.domain.*;


//<!--                    <generateDirectory>${project.basedir}/src/main/java</generateDirectory>-->
//<!--                    <outputDirectory>${project.basedir}/src/main/java</outputDirectory>-->

public class GatewayClient
//        extends WebServiceGatewaySupport
{
    private static final Logger logger = LoggerFactory.getLogger(GatewayClient.class);

//    public GetLockVaccPackageResponse getLockVaccPackage(LockVaccPackageRequest lockVaccPackageRequest) {
//        final GetLockVaccPackageRequest request = new GetLockVaccPackageRequest();
//        request.setLockVaccPackage(lockVaccPackageRequest);
//        logger.info("Запрос данных для {} ", lockVaccPackageRequest);
//        return (GetLockVaccPackageResponse) getWebServiceTemplate().marshalSendAndReceive(
//                request

//                ,
//                new SecurityHeader(
//                        new Authentication("user","psd")
//                )

//                );
//    }

//    public GetUnlockVaccPackageResponse getLockVaccPackage(UnlockVaccPackageRequest lockVaccPackageRequest) {
//        final GetUnlockVaccPackageRequest request = new GetUnlockVaccPackageRequest();
//        request.setUnlockVaccPackage(lockVaccPackageRequest);
//        logger.info("Запрос данных для {} ", lockVaccPackageRequest);
//        return (GetUnlockVaccPackageResponse) getWebServiceTemplate().marshalSendAndReceive(request);
//    }
}
