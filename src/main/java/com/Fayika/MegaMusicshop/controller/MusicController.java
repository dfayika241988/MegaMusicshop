package com.Fayika.MegaMusicshop.controller;

import com.Fayika.MegaMusicshop.dto.MusicDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/musics")
public class MusicController {

    @GetMapping()
    public ResponseEntity<List<MusicDto>> getMusics(){
        MusicDto music = MusicDto.builder()
                .title("My First Music title")
                .build();
        List<MusicDto>  musics = new ArrayList<>();
        musics.add(music);
        return ResponseEntity.ok(musics);
    }
}
