package vezzoni.api.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import vezzoni.api.ApiController;

@Path(value = "/")
@Consumes(value = {MediaType.WILDCARD})
@Produces(value = {MediaType.APPLICATION_JSON})
public class ApiControllerImpl implements ApiController {

    @GET
    @Path(value = "/{name}")
    @Produces(value = {MediaType.TEXT_HTML})
    @Override
    public Response greetings(@PathParam("name") String name) {
        
        String message = String.format("Hello %s!", name);
        
        return Response
                .status(Response.Status.OK)
                .entity(message)
                .build();
    }

    @PUT
    @Path(value = "/{id}")
    @Override
    public Response insert(@PathParam("id") Integer id) {
        
        return Response
                .status(Response.Status.CREATED)
                .build();
    }

}
