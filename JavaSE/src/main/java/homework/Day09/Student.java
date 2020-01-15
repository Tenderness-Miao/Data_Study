package homework.Day09;

/**
 * @program: Data_Study
 * @description: Day09 Student类
 * @author: HaoMiao
 * @create: 2019-11-03 06:38
 **/
public class Student extends Person{
    private Long id;
    private Integer score;

    public Student(String name, Integer age, Long id, Integer score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "我叫" + super.getName() + " 我是：" + getClass().getName();
    }
}
