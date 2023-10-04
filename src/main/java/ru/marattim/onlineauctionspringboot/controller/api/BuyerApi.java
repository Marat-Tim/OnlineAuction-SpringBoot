package ru.marattim.onlineauctionspringboot.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.marattim.onlineauctionspringboot.controller.dto.in.BetDto;
import ru.marattim.onlineauctionspringboot.controller.dto.out.ProductInfoDto;
import ru.marattim.onlineauctionspringboot.controller.dto.out.PurchasedProductInfoDto;

import java.util.List;

@RequestMapping("/buyer")
public interface BuyerApi {
    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    List<ProductInfoDto> find();

    @PostMapping("/bet")
    @ResponseStatus(HttpStatus.OK)
    void buy(@RequestBody BetDto id);

    @GetMapping("/trades")
    @ResponseStatus(HttpStatus.OK)
    List<ProductInfoDto> trades();

    @GetMapping("/purchased")
    @ResponseStatus(HttpStatus.OK)
    List<PurchasedProductInfoDto> purchased();
}
