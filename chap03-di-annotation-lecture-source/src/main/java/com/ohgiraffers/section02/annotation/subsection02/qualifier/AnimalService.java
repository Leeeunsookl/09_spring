package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("animalQualifier")
public class AnimalService {

    //@Autowired 어노테이션을 사용하여 의존성을 자동으로 주입받을 때,
    // @Qualifier 어노테이션을 함께 사용하여 주입받고자 하는 정확한 빈의 이름을 지정할 수 있습니다.
    // 이는 특히 동일한 타입의 빈이 여러 개 있을 때 유용합니다.
    //@Primary가 있어도 @Qualifier가 이김

    /* 필드 주입 방식 */
//    @Autowired
//    @Qualifier("raccoon")

//    private Animal animal;
//
//    public void animalEat(){
//        animal.eat();


    /* 생성자 주입 방식 */
    // 생성자 주입은 메소드의 파라미터 앞에 기재를 한다.
    private Animal animal;

    @Autowired
    public AnimalService(@Qualifier("raccoon")Animal animal){
        this.animal = animal;
    }

    public void animalEat() {
        animal.eat();
    }
}
