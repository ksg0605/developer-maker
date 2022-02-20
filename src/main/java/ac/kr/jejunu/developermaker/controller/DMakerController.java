package ac.kr.jejunu.developermaker.controller;

import ac.kr.jejunu.developermaker.dto.CreateDeveloper;
import ac.kr.jejunu.developermaker.dto.DeveloperDetailDto;
import ac.kr.jejunu.developermaker.dto.DeveloperDto;
import ac.kr.jejunu.developermaker.dto.EditDeveloper;
import ac.kr.jejunu.developermaker.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * packageName            : ac.kr.jejunu.developermaker.controller
 * fileName              : DMakerController
 * author                : sunkyu
 * date                  : 2022/02/19
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/02/19           sunkyu             최초 생성
 */

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {
    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public List<DeveloperDto> getAllDevelopers() {
        //GET /developers HTTP/1.1
        log.info("GET /developers HTTP/1.1");

        return dMakerService.getAllDevelopers();
    }

    @GetMapping("/developer/{memberId}")
    public DeveloperDetailDto getDeveloperDetail(@PathVariable String memberId) {
        //GET /developers HTTP/1.1
        log.info("GET /developers HTTP/1.1");

        return dMakerService.getDeveloperDetail(memberId);
    }


    @PostMapping("/create-developer")
    public CreateDeveloper.Response createDevelopers(@Valid @RequestBody CreateDeveloper.Request request) {
        log.info("request : {}", request);

        return dMakerService.createDeveloper(request);
    }

    @PutMapping("/developer/{memberId}")
    public DeveloperDetailDto editDeveloper(@PathVariable String memberId, @Valid @RequestBody EditDeveloper.Request request) {
        //GET /developers HTTP/1.1
        log.info("GET /developers HTTP/1.1");

        return dMakerService.editDeveloper(memberId, request);
    }

}
