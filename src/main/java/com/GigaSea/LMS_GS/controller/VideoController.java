package com.GigaSea.LMS_GS.controller;

import com.GigaSea.LMS_GS.model.Video;
import com.GigaSea.LMS_GS.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;


    @PostMapping("/upload")
    public ResponseEntity<String> uploadVideo(@RequestParam("video") MultipartFile file) throws IOException {
        String videoName = file.getOriginalFilename();
        String videoType = file.getContentType();
        byte[] videoContent = file.getBytes();

        Video video = videoService.saveVideo(videoName, videoType, videoContent);
        return ResponseEntity.ok("Video uploaded successfully with ID: " + video.getId());
    }

    @GetMapping("/videos/{id}")
    public ResponseEntity<byte[]> getVideo(@PathVariable Long id) {
        Video video = videoService.getVideo(id);
        if (video != null) {
            return ResponseEntity.ok()
                    .header("Content-Type", video.getType())
                    .body(video.getContent());

        }
        return ResponseEntity.notFound().build();
    }
}
