package com.carros;

import com.carros.domain.upload.FirebaseStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(classes = CarrosApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UploadTest {
    @Autowired
    protected TestRestTemplate rest;

    @Autowired
    private FirebaseStorageService service;

    private TestRestTemplate basicAuth() {
        return rest.withBasicAuth("admin", "123");
    }
}
