package ac.kr.jejunu.developermaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName            : ac.kr.jejunu.developermaker.entity
 * fileName              : DeveloperLevel
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
public enum DeveloperLevel {
    NEW("신입 개발자"),
    JUNIOR("주니어 개발자"),
    JUGNIOR("중니어 개발자"),
    SENIOR("시니어 개발자")
    ;

    private final String description;
}
