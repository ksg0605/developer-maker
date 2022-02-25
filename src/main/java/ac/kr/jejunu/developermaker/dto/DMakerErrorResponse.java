package ac.kr.jejunu.developermaker.dto;

import ac.kr.jejunu.developermaker.exception.DMakerErrorCode;
import lombok.*;

/**
 * packageName            : ac.kr.jejunu.developermaker.dto
 * fileName              : DMakerErrorResponse
 * author                : sunkyu
 * date                  : 2022/02/25
 * description           :
 * ===========================================================
 * DATE              AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2022/02/25           sunkyu             최초 생성
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DMakerErrorResponse {
    private DMakerErrorCode errorCode;
    private String errorMessage;
}
