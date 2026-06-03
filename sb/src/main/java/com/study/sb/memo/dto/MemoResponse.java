package com.study.sb.memo.dto;

import com.study.sb.memo.entity.Memo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemoResponse {
    private Long id;
    private String content;

    public MemoResponse (Memo entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
    }

    // MemoResponse.from(entity) - 이건 위의 코드와 같은 의미임 new를 안쓰게 됨
    public static MemoResponse from(Memo entity) {
        return new MemoResponse(entity);
    }
    // 이런걸 helper함수라고 한다.
}

/*
    매개 변수가 없는 생성자 같은 경우에는 lombok에서 제공하는게 있음


    public MemoResponse () {

    }
*/

/*

 */
/*

 */
/*

 */
/*
    이 부분들이 lombok을 사용하기 때문에 필요가 없어짐

    public Long getId () {
        return this.id;
    }

    public String getContent () {
        return this.content;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public void setContent (String content) {
        this.content = content;
    }
*/