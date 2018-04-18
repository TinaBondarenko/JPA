package TinaBond.MavenNew.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher_details")
@NoArgsConstructor
@Getter @Setter
public class TeacherDetails extends BaseEntity {

	private String email;

	private String hobby;

	

}
