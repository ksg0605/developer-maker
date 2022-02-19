package ac.kr.jejunu.developermaker.dto;

import ac.kr.jejunu.developermaker.entity.Developer;
import ac.kr.jejunu.developermaker.type.DeveloperLevel;
import ac.kr.jejunu.developermaker.type.DeveloperSkillType;
import lombok.*;

/**
 * packageName            : ac.kr.jejunu.developermaker.dto
 * fileName              : DeveloperDto
 * author                : sunkyu
 * date                  : 2022/02/19
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/02/19           sunkyu             최초 생성
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeveloperDto {
    private DeveloperLevel developerLevel;
    private DeveloperSkillType developerSkillType;
    private String memberId;

    public static DeveloperDto fromEntity(Developer developer) {
        return DeveloperDto.builder()
                .developerLevel(developer.getDeveloperLevel())
                .developerSkillType(developer.getDeveloperSkillType())
                .memberId(developer.getMemberId())
                .build();
    }
}
