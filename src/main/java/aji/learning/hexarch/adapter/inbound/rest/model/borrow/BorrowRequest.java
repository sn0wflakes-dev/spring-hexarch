package aji.learning.hexarch.adapter.inbound.rest.model.borrow;

import jakarta.validation.constraints.NotNull;

public record BorrowRequest(
   @NotNull
   String bookId,

   @NotNull
   String bookName,

   @NotNull
   String borrowBy,

   @NotNull
   Boolean isBooked
) {}
