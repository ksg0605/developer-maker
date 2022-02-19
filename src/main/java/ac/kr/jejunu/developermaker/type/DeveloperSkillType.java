package ac.kr.jejunu.developermaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName            : ac.kr.jejunu.developermaker.type
 * fileName              : DeveloperSkillType
 * author                : sunkyu
 * date                  : 2022/02/19
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/02/19           sunkyu             최초 생성
 */
@AllArgsConstructor
@Getter
public enum DeveloperSkillType {
    BACK_END("백엔드 개발자"),
    FRONT_END("프론트엔드 개발자"),
    FULL_STACK("풀스택 개발자");

    private final String description;
}
