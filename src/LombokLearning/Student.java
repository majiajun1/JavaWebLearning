package LombokLearning;

import lombok.*;
import lombok.experimental.Accessors;

//@AllArgsConstructor
//@Getter
//@Setter
//@NoArgsConstructor
//@RequiredArgsConstructor
//@ToString(includeFieldNames = false) //不返回类型
//// 也能通过exclude 设置排除字段
////of返回指定字段
//@Accessors(chain = true)
//
//@EqualsAndHashCode()
@Builder
@ToString
public class Student {
//   private Integer sid;
//   @Getter(value = AccessLevel.PUBLIC )
//   private String name="MJJ";
//   private String sex;
//   @Getter
//   static int test;
   @Builder.Default
   Integer sid=10;
   String name;
   String sex;

}
