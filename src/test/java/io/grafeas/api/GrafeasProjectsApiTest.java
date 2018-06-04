/*
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.grafeas.api;

import io.grafeas.ApiException;
import io.grafeas.model.ApiListProjectsResponse;
import io.grafeas.model.ApiProject;
import io.grafeas.model.ProtobufEmpty;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GrafeasProjectsApi
 */
@Ignore
public class GrafeasProjectsApiTest {

    private final GrafeasProjectsApi api = new GrafeasProjectsApi();

    
    /**
     * Creates a new &#x60;Project&#x60;.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        ApiProject body = null;
        ProtobufEmpty response = api.createProject(body);

        // TODO: test validations
    }
    
    /**
     * Deletes the given &#x60;Project&#x60; from the system.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String name = null;
        ProtobufEmpty response = api.deleteProject(name);

        // TODO: test validations
    }
    
    /**
     * Returns the requested &#x60;Project&#x60;.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        String name = null;
        ApiProject response = api.getProject(name);

        // TODO: test validations
    }
    
    /**
     * Lists &#x60;Projects&#x60;
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProjectsTest() throws ApiException {
        String filter = null;
        Integer pageSize = null;
        String pageToken = null;
        ApiListProjectsResponse response = api.listProjects(filter, pageSize, pageToken);

        // TODO: test validations
    }
    
}