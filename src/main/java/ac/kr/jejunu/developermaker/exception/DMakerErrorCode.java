package ac.kr.jejunu.developermaker.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName            : ac.kr.jejunu.developermaker.exception
 * fileName              : DMakerErrorCode
 * author                : sunkyu
 * date                  : 2022/02/19
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/02/19           sunkyu             최초 생성
 */
@Getter
@AllArgsConstructor
public enum DMakerErrorCode {
    NO_DEVELOPER("해당되는 개발자가 없습니다."),
    DUPLICATED_MEMBER_ID("MemberId가 중복되는 개발자가 있습니다."),
    LEVEL_EXPERIENCE_YEARS_NOT_MATCHED("개발자 레벨과 연차가 맞지 않습니다."),

    INTERNAL_SERVER_ERROR("서버에 오류가 발생했습니다."),
    INVAILD_REQUEST("잘못된 요청입니다.");

    private final String message;
}
