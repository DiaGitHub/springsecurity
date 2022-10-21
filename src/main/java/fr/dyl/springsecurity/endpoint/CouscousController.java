package fr.dyl.springsecurity.endpoint;

import fr.dyl.springsecurity.dto.CouscousDto;
import fr.dyl.springsecurity.dto.CouscousResponseDto;
import fr.dyl.springsecurity.service.CouscousService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(CouscousController.PATH)
@Slf4j
@RequiredArgsConstructor
public class CouscousController {
    static final String PATH = "/api/v1/couscouses";

    private final CouscousService couscousService;

    @GetMapping("/{couscousId}")
    public CouscousDto getCouscous(@PathVariable("couscousId") UUID couscousId) {
        return couscousService.getCouscous(couscousId);
    }

    @PostMapping
    public ResponseEntity<CouscousResponseDto> addCouscous(@Validated @RequestBody CouscousDto couscousDto) {
        var couscousId = couscousService.addCouscous(couscousDto);

        var createdUri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                                                    .path("/{couscousId}")
                                                    .buildAndExpand(Map.of("couscousId", couscousId.toString()))
                                                    .toUri();

        return ResponseEntity.created(createdUri)
                             .body(new CouscousResponseDto(couscousId));
    }
}
