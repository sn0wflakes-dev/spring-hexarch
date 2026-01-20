package aji.learning.hexarch.adapter.inbound.rest.model.borrow;

public record BorrowResponse(
    String bookId,
    String bookName,
    String message
) {}
