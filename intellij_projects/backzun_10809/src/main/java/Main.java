/*
1. 알파벳 소문자로만 이루어진 단어 S가 주어짐
2. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치 출력
3. 포함되어 있지 않은 경우에는 -1을 출력
4. 각 알파벳은 공백으로 구분해서 출력
5. 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치
6. 알파벳이 중복으로 입력되면 처음 나타난 위치를 출력
*/
// 참고 사이트  : https://songdev.tistory.com/5 || https://pridiot.tistory.com/24
/*
 문장을 스캔하면서 indexOf에 해당하는 값이 있을때 그 위치를 찾음
 int nameNumber = 0;

         // ex - 알파벳 해당 글자(a)와 name을 비교하여 name 중 a가 들어가는 위치를 찾는다.
        //  if(알파벳 첫글자 == name 전체 스캔 )

        for(int i = 0; i <al.length;i++){

            for(int j = 0; j <al.length;j++){
                if(al[i]==name.charAt(j)){
                nameNumber = i;
                }else if(al[i]!=name.charAt(j)){
                nameNumber = -1;
                }
            }
            System.out.printf("%d ",nameNumber);
        }

      }
--------------------------------------
 알파벳을 A~Z까지 배열에 담는다.
    char[] al = new char[26];

    for(int i = 0;i<al.length;i++){
        al[i] = (char)(65+i);
    }


*/
import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();

        in.close();

        char[] al = new char[26];

        for(int i = 0;i<al.length;i++){
            al[i] = (char)(65+i);
            al[i] = toLowerCase(al[i]);

        }




        for(int i = 0; i <al.length;i++){
            int nameNumber = -1;
            for(int j = 0; j <name.length();j++){
                char a = name.charAt(j);
                if(al[i]==a){
                    nameNumber = j;
                    break;
                }
            }

            System.out.printf("%d ",nameNumber);
        }

    }

}
