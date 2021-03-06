# RuntimeAppDeploymentsApi

All URIs are relative to *https://localhost:9080/activiti-app/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAppDeploymentUsingDELETE**](RuntimeAppDeploymentsApi.md#deleteAppDeploymentUsingDELETE) | **DELETE** /enterprise/runtime-app-deployments/{appDeploymentId} | Remove an app deployment
[**exportAppDefinitionUsingGET1**](RuntimeAppDeploymentsApi.md#exportAppDefinitionUsingGET1) | **GET** /enterprise/export-app-deployment/{deploymentId} | Export the app archive for a deployment
[**getAppDefinitionsUsingGET1**](RuntimeAppDeploymentsApi.md#getAppDefinitionsUsingGET1) | **GET** /enterprise/runtime-app-deployments | Query app deployments
[**getAppDeploymentUsingGET**](RuntimeAppDeploymentsApi.md#getAppDeploymentUsingGET) | **GET** /enterprise/runtime-app-deployments/{appDeploymentId} | Get an app deployment
[**getRuntimeAppDeploymentByDeploymentUsingGET**](RuntimeAppDeploymentsApi.md#getRuntimeAppDeploymentByDeploymentUsingGET) | **GET** /enterprise/runtime-app-deployment | Get an app by deployment ID or DMN deployment ID


<a name="deleteAppDeploymentUsingDELETE"></a>
# **deleteAppDeploymentUsingDELETE**
> deleteAppDeploymentUsingDELETE(appDeploymentId)

Remove an app deployment

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.RuntimeAppDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RuntimeAppDeploymentsApi apiInstance = new RuntimeAppDeploymentsApi();
Long appDeploymentId = 789L; // Long | appDeploymentId
try {
    apiInstance.deleteAppDeploymentUsingDELETE(appDeploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDeploymentsApi#deleteAppDeploymentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appDeploymentId** | **Long**| appDeploymentId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportAppDefinitionUsingGET1"></a>
# **exportAppDefinitionUsingGET1**
> exportAppDefinitionUsingGET1(deploymentId)

Export the app archive for a deployment

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.RuntimeAppDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RuntimeAppDeploymentsApi apiInstance = new RuntimeAppDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | deploymentId
try {
    apiInstance.exportAppDefinitionUsingGET1(deploymentId);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDeploymentsApi#exportAppDefinitionUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| deploymentId |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/zip

<a name="getAppDefinitionsUsingGET1"></a>
# **getAppDefinitionsUsingGET1**
> ResultListDataRepresentationAppDeploymentRepresentation getAppDefinitionsUsingGET1(nameLike, tenantId, latest, start, sort, order, size)

Query app deployments

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.RuntimeAppDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RuntimeAppDeploymentsApi apiInstance = new RuntimeAppDeploymentsApi();
String nameLike = "nameLike_example"; // String | nameLike
Long tenantId = 789L; // Long | tenantId
Boolean latest = true; // Boolean | latest
Integer start = 56; // Integer | start
String sort = "sort_example"; // String | sort
String order = "order_example"; // String | order
Integer size = 56; // Integer | size
try {
    ResultListDataRepresentationAppDeploymentRepresentation result = apiInstance.getAppDefinitionsUsingGET1(nameLike, tenantId, latest, start, sort, order, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDeploymentsApi#getAppDefinitionsUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameLike** | **String**| nameLike | [optional]
 **tenantId** | **Long**| tenantId | [optional]
 **latest** | **Boolean**| latest | [optional]
 **start** | **Integer**| start | [optional]
 **sort** | **String**| sort | [optional]
 **order** | **String**| order | [optional]
 **size** | **Integer**| size | [optional]

### Return type

[**ResultListDataRepresentationAppDeploymentRepresentation**](ResultListDataRepresentationAppDeploymentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppDeploymentUsingGET"></a>
# **getAppDeploymentUsingGET**
> AppDeploymentRepresentation getAppDeploymentUsingGET(appDeploymentId)

Get an app deployment

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.RuntimeAppDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RuntimeAppDeploymentsApi apiInstance = new RuntimeAppDeploymentsApi();
Long appDeploymentId = 789L; // Long | appDeploymentId
try {
    AppDeploymentRepresentation result = apiInstance.getAppDeploymentUsingGET(appDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDeploymentsApi#getAppDeploymentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appDeploymentId** | **Long**| appDeploymentId |

### Return type

[**AppDeploymentRepresentation**](AppDeploymentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRuntimeAppDeploymentByDeploymentUsingGET"></a>
# **getRuntimeAppDeploymentByDeploymentUsingGET**
> AppDeploymentRepresentation getRuntimeAppDeploymentByDeploymentUsingGET(deploymentId, dmnDeploymentId)

Get an app by deployment ID or DMN deployment ID

Either a deploymentId or a dmnDeploymentId must be provided

### Example
```java
// Import classes:
//import org.activiti.engine.remote.client.ApiClient;
//import org.activiti.engine.remote.client.ApiException;
//import org.activiti.engine.remote.client.Configuration;
//import org.activiti.engine.remote.client.auth.*;
//import org.activiti.engine.remote.client.api.RuntimeAppDeploymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RuntimeAppDeploymentsApi apiInstance = new RuntimeAppDeploymentsApi();
String deploymentId = "deploymentId_example"; // String | deploymentId
Long dmnDeploymentId = 789L; // Long | dmnDeploymentId
try {
    AppDeploymentRepresentation result = apiInstance.getRuntimeAppDeploymentByDeploymentUsingGET(deploymentId, dmnDeploymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuntimeAppDeploymentsApi#getRuntimeAppDeploymentByDeploymentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | **String**| deploymentId | [optional]
 **dmnDeploymentId** | **Long**| dmnDeploymentId | [optional]

### Return type

[**AppDeploymentRepresentation**](AppDeploymentRepresentation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

