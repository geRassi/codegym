package com.rami.gerassi.controllers;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class DownloadController {

    @GetMapping(path = "/download")
    private ResponseEntity<ByteArrayResource> download() throws IOException {
        return ResponseEntity.ok()
                .headers(getHttpHeaders())
                .contentLength(getFile().length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new ByteArrayResource(Files.readAllBytes(Paths.get(getFile().getAbsolutePath()))));
    }


    @GetMapping(value = "/stream")
    private ResponseEntity<InputStreamResource> downloadFile(HttpServletRequest request) throws IOException {

        return ResponseEntity.ok()
                .headers(getHttpHeaders())
                .body(new InputStreamResource(new FileInputStream(getFile())));
    }

    private File getFile() {
        return new File(getClass().getClassLoader().getResource(getFileName()).getFile());
    }

    private String getFileName() {
        return "DownloadMe.txt";
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        headers.add("Content-Disposition", "attachment; filename=" + getFileName());
        return headers;
    }

}