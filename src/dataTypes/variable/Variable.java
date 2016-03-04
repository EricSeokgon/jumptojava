package dataTypes.variable;

/**
 * Project: jumptojava
 * FileName: Variable
 * Date: 2016-03-04
 * Time: 오전 12:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Variable {

    public static void main(String[] args) {
        // a, b를 변수(variable)라고 한다
        int a;
        String b;

        int one;
        String two;

        //변수명은 숫자로 시작할 수 없다.
        //_(underscore)와 $문자 이외의 특수 문자는 사용할 수 없다.
        //자바의 키워드는 변수명으로 사용할 수 없다. (예: int, class, return등)

        //자료형(Type)
        //변수 a는 int 자료형 변수이다.
        //변수 b는 String 자료형 변수 이다.
        a = 1;
        b = "hello java";

        int a1 = 1;
        String b1 = "hello java";
    }
}
