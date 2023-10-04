package ru.marattim.onlineauctionspringboot.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.marattim.onlineauctionspringboot.controller.dto.in.ProductInfoDto;
import ru.marattim.onlineauctionspringboot.controller.dto.out.MyProductInfoDto;

import java.util.List;

@RequestMapping("/seller")
public interface SellerApi {
    @PostMapping("/sell")
    @ResponseStatus(HttpStatus.CREATED)
    void sell(@RequestBody ProductInfoDto productInfoDto);

    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    List<MyProductInfoDto> products();
}
