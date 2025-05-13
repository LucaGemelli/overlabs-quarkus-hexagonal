package com.microservice.quarkus.application.outbound;

import java.util.List;

public interface ExternalPostPort {
    List<PostDTO> fetchAllPosts();
}