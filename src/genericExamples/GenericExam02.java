package genericExamples;

/*
Generic은 꺽쇠<>를 써서 사용할 수 있다.
이때 e는 가상의 클래스이며, 이름은 임의로 바꿀 수 있다.
 */
public class GenericExam02<e>{
    private e object;

    public void setObject(e object){
        this.object = object;
    }

    public e getObject(){
        return object;
    }
}
