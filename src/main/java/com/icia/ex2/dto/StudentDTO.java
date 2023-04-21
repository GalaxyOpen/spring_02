package com.icia.ex2.dto;

import lombok.*;

@Getter // 게터 자동생성
@Setter // 세터 자동생성
@ToString // 투스트링 자동 생성
@NoArgsConstructor //기본생성자 자동 생성
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class StudentDTO {
    private Long id;
    private String studentName;
    private String studentNumber;
}
