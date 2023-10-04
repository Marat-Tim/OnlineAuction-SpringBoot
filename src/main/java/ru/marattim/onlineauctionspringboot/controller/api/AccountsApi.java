package ru.marattim.onlineauctionspringboot.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.marattim.onlineauctionspringboot.controller.dto.out.UserInfoDto;

@RequestMapping("/account")
public interface AccountsApi {
    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    UserInfoDto user(@PathVariable("userId") long userId);
}
