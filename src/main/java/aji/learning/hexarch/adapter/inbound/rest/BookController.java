package aji.learning.hexarch.adapter.inbound.rest;

import aji.learning.hexarch.adapter.inbound.rest.mapper.RestMapper;
import aji.learning.hexarch.adapter.inbound.rest.model.WebResponse;
import aji.learning.hexarch.adapter.inbound.rest.model.borrow.BorrowRequest;
import aji.learning.hexarch.adapter.inbound.rest.model.borrow.BorrowResponse;
import aji.learning.hexarch.adapter.inbound.rest.model.track.TrackResponse;
import aji.learning.hexarch.domain.model.BookData;
import aji.learning.hexarch.domain.port.inbound.BorrowBookUsecase;
import aji.learning.hexarch.domain.port.inbound.TrackBookUsecase;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BorrowBookUsecase borrowBookUsecase;
    private final TrackBookUsecase trackBookUsecase;

    public BookController(BorrowBookUsecase borrowBookUsecase, TrackBookUsecase trackBookUsecase) {
        this.borrowBookUsecase = borrowBookUsecase;
        this.trackBookUsecase = trackBookUsecase;
    }

    @PostMapping(
            value = "/borrow",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WebResponse<BorrowResponse>> borrowBookController(@Valid @RequestBody BorrowRequest borrowRequest) {
        BookData dataMapper = RestMapper.borrowReqToDomain(borrowRequest);
        borrowBookUsecase.borrowBook(dataMapper);
        BorrowResponse resMapper = RestMapper.toBorrowResponse(dataMapper);
        WebResponse<BorrowResponse> apiResponse = WebResponse.<BorrowResponse>builder()
                .data(resMapper).build();

        return ResponseEntity.ok(apiResponse);
    }

    @GetMapping("/track/{bookId}")
    public ResponseEntity<WebResponse<TrackResponse>> trackBookController(@PathVariable String bookId) {
        BookData data =  trackBookUsecase.trackBook(bookId);
        TrackResponse resMapper = RestMapper.toTrackResponse(data);

        WebResponse<TrackResponse> apiResponse = WebResponse.<TrackResponse>builder()
                .data(resMapper)
                .build();

        return ResponseEntity.ok(apiResponse);
    }
}
