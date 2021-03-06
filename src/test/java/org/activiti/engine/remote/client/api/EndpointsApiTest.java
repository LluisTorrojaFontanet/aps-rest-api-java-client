/*
 * Process Services Enterprise API
 * Provides access to the complete features provided by Alfresco Process Services powered by Activiti.  You can use this API to integrate Alfresco Process Services with external applications.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.activiti.engine.remote.client.api;

import org.activiti.engine.remote.client.ApiException;
import org.activiti.engine.remote.client.model.EndpointConfigurationRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EndpointsApi
 */
@Ignore
public class EndpointsApiTest {

    private final EndpointsApi api = new EndpointsApi();

    
    /**
     * Get an endpoint configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointConfigurationUsingGETTest() throws ApiException {
        Long endpointConfigurationId = null;
        EndpointConfigurationRepresentation response = api.getEndpointConfigurationUsingGET(endpointConfigurationId);

        // TODO: test validations
    }
    
    /**
     * List endpoint configurations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEndpointConfigurationsUsingGETTest() throws ApiException {
        List<EndpointConfigurationRepresentation> response = api.getEndpointConfigurationsUsingGET();

        // TODO: test validations
    }
    
}
