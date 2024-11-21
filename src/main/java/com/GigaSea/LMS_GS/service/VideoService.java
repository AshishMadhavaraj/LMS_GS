package com.GigaSea.LMS_GS.service;

import com.GigaSea.LMS_GS.model.Video;
import com.GigaSea.LMS_GS.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public Video saveVideo(String name, String type, byte[] content) {
        Video video = new Video(name, type, content);
        return videoRepository.save(video);
    }

    public Video getVideo(Long id) {
        return videoRepository.findById(id).orElse(null);
    }
}
