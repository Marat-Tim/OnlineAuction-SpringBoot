package ru.marattim.onlineauctionspringboot.controller.dto.out;

import java.math.BigDecimal;
import java.time.Instant;

public record MyProductInfoDto(long id,
                               String title,
                               String description,
                               BigDecimal currentCost,
                               BigDecimal minStep,
                               Instant auctionEndDate) {
}
