package ac.kr.jejunu.developermaker.service;

import ac.kr.jejunu.developermaker.entity.Developer;
import ac.kr.jejunu.developermaker.repository.DeveloperRepository;
import ac.kr.jejunu.developermaker.type.DeveloperLevel;
import ac.kr.jejunu.developermaker.type.DeveloperSkillType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * packageName            : ac.kr.jejunu.developermaker.service
 * fileName              : DmakerService
 * author                : sunkyu
 * date                  : 2022/02/19
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/02/19           sunkyu             최초 생성
 */
@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;

    @Transactional
    public void createDeveloper() {
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.FRONT_END)
                .experienceYears(2)
                .name("Olaf")
                .age(5)
                .build();

        developerRepository.save(developer);
    }
}
