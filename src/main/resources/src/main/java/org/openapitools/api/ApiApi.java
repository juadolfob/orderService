/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Client;
import java.util.UUID;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-17T02:22:27.918543100-05:00[America/Ojinaga]", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "Client", description = "the Client API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/client : Create new client
     *
     * @param client  (required)
     * @return Successful Client Creation (status code 200)
     */
    @Operation(
        operationId = "createClient",
        summary = "Create new client",
        tags = { "Client" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful Client Creation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/client",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Client> createClient(
        @Parameter(name = "Client", description = "", required = true) @Valid @RequestBody Client client
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"phoneNumber\" : \"phoneNumber\", \"fullName\" : \"fullName\", \"id\" : 0, \"state\" : \"state\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/client/{id} : Update Existing Client
     *
     * @param id  (required)
     * @return Successful Client Update (status code 200)
     */
    @Operation(
        operationId = "deleteClient",
        summary = "Update Existing Client",
        tags = { "Client" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful Client Update", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/client/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Object> deleteClient(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/client : Retrieve all clients
     *
     * @return Successful client retrieval (status code 200)
     */
    @Operation(
        operationId = "getAllClients",
        summary = "Retrieve all clients",
        tags = { "Client" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful client retrieval", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Client.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/client",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Client>> getAllClients(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"phoneNumber\" : \"phoneNumber\", \"fullName\" : \"fullName\", \"id\" : 0, \"state\" : \"state\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"phoneNumber\" : \"phoneNumber\", \"fullName\" : \"fullName\", \"id\" : 0, \"state\" : \"state\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/client/{id} : Retrieve existing client
     *
     * @param id  (required)
     * @return Successful client retrieval (status code 200)
     */
    @Operation(
        operationId = "getClient",
        summary = "Retrieve existing client",
        tags = { "Client" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful client retrieval", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/client/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Client> getClient(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"phoneNumber\" : \"phoneNumber\", \"fullName\" : \"fullName\", \"id\" : 0, \"state\" : \"state\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/client/{id} : Update Existing Client
     *
     * @param id  (required)
     * @param client  (required)
     * @return Successful Client Update (status code 200)
     */
    @Operation(
        operationId = "updateClient",
        summary = "Update Existing Client",
        tags = { "Client" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful Client Update", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/client/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Client> updateClient(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id,
        @Parameter(name = "Client", description = "", required = true) @Valid @RequestBody Client client
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastUpdated\" : \"2000-01-23T04:56:07.000+00:00\", \"phoneNumber\" : \"phoneNumber\", \"fullName\" : \"fullName\", \"id\" : 0, \"state\" : \"state\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
