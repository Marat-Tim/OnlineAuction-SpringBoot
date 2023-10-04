package ru.marattim.onlineauctionspringboot.controller.dto.out;

import java.math.BigDecimal;

public record PurchasedProductInfoDto(long id,
                                      long userId,
                                      String name,
                                      String description,
                                      BigDecimal cost) {
}
