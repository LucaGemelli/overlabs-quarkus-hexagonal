package com.microservice.quarkus.infrastructure.rest.adapter;

import com.microservice.quarkus.application.outbound.ExternalPostPort;
import com.microservice.quarkus.application.outbound.PostDTO;
import com.microservice.quarkus.infrastructure.rest.client.JsonPlaceholderClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ExternalPostAdapter implements ExternalPostPort {

    @Inject
    @RestClient
    JsonPlaceholderClient client;

    @Override
    public List<PostDTO> fetchAllPosts() {
        return client.getPosts();
    }
}