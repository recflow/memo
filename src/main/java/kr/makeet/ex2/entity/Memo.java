package kr.makeet.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity // 자동으로 테이블 생성할 수도 있음
@Table(name = "tbl_memo") // 데이터베이스 상에서 어떤 엔티티 클래스로 생성할 것인지에 대한 정보를 담음
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // maria db나 mysql 상에서 auto increament로 기록되도록 함
    private Long mno;

    @Column(length = 200, nullable = false) // 칼럼을 지정할 때 사용
    private String memoText;
}
