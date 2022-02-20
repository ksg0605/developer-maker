package ac.kr.jejunu.developermaker.dto;

import ac.kr.jejunu.developermaker.code.StatusCode;
import ac.kr.jejunu.developermaker.entity.Developer;
import ac.kr.jejunu.developermaker.type.DeveloperLevel;
import ac.kr.jejunu.developermaker.type.DeveloperSkillType;
import lombok.*;

/**
 * packageName            : ac.kr.jejunu.developermaker.dto
 * fileName              : DeveloperDetailDto
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
public class DeveloperDetailDto {
    private DeveloperLevel developerLevel;
    private DeveloperSkillType developerSkillType;
    private Integer experienceYears;
    private String memberId;
    private StatusCode statusCode;
    private String name;
    private Integer age;

    public static DeveloperDetailDto fromEntity(Developer developer) {
        return DeveloperDetailDto.builder()
                .developerLevel(developer.getDeveloperLevel())
                .developerSkillType(developer.getDeveloperSkillType())
                .experienceYears(developer.getExperienceYears())
                .memberId(developer.getMemberId())
                .statusCode(developer.getStatusCode())
                .name(developer.getName())
                .age(developer.getAge())
                .build();
    }
}
