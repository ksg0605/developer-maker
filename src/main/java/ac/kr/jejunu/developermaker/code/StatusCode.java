package ac.kr.jejunu.developermaker.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName            : ac.kr.jejunu.developermaker.entity
 * fileName              : StatusCode
 * author                : sunkyu
 * date                  : 2022/02/20
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/02/20           sunkyu             최초 생성
 */
@Getter
@AllArgsConstructor
public enum StatusCode {
    EMPLIYED("고용"),
    RETIRED("퇴직");

    private final String description;
}
