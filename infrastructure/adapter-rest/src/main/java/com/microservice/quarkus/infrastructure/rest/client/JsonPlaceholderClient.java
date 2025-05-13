package com.microservice.quarkus.infrastructure.rest.client;

import com.microservice.quarkus.application.outbound.PostDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@RegisterRestClient(configKey = "external.posts")
@Path("/posts")
public interface JsonPlaceholderClient {
    @GET
    List<PostDTO> getPosts();
}