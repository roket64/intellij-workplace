package genericExamples;

/*
Generic은 꺽쇠<>를 써서 사용할 수 있다.
이때 e는 가상의 클래스이며, 이름은 임의로 바꿀 수 있다.
 */
public class GenericExam02<E>{
    private E object;

    public void setObject(E object){
        this.object = object;
    }

    public E getObject(){
        return object;
    }
}
