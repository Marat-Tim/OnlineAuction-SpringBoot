package ru.marattim.onlineauctionspringboot.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.marattim.onlineauctionspringboot.controller.dto.in.RegisterInitDto;

@RequestMapping("/register")
public interface RegisterApi {
    @PostMapping("/init")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void init(@RequestBody RegisterInitDto registerInitDto);

    @PostMapping("/confirm")
    @ResponseStatus(HttpStatus.CREATED)
    void confirm(@RequestBody String token);
}
