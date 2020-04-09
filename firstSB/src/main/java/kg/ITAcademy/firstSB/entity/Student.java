package kg.ITAcademy.firstSB.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    Integer age;

    @Column(name = "gender")
    String gender;

    @Column(name = "phone")
    String phone;

    @Column(name = "group_name")
    String groupName;
}
