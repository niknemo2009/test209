package lesson200520;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Example33 {
    public static void main(String[] args) {
    Example33 ex=new Example33();
        ex.getGeometrProgr(1,50,5).forEach(x-> System.out.println(x));

    //136
        //Створити набір методів, який дозволяє проводити
        // слідуючі операції з геометричними прогресіями:
        //-  генерувати геометричну прогресію на підставі
        // Stream int , починаючи з числа X до числа Z,
        // з кроком Y(xyz задаються, як параметри методу,
        // повертаєме значення –Stream int)
        //- метод , який виводить на консоль суму елементів
        // геометричної прогресії,які відповідають певній умові
        // (прогресія та умова задаються , як параметри методу)
    // 3 3*5  15*5
        //Створіть наступну модель- є політична сила,
        // яка може приймати до своїх лав громадян країни.
        // Політична сила може проводити з’їзди своїх членів
        // та обирати свої керівні органи.Повинна бути
        // можливість подивитися , за кого голосував кожний
        // учасник. або хто голосував за конкретну людину в
        // керуючому органі.  Кожен активіст може пошукати
        // детальну інформацію по різним критеріям серед всього
        // складу однопартійців, крім того є можливість
        // декларувати помісячно свої доходи та дивитися
        // доходи однопартійців за любий період.
        // Повинна бути можливість формувати списки
        // учасників з’їздів, це роблять регіональні
        // партійні структури. Таким чином регіональний
        // орган обирає з своїх лав учасників з’їзді.
        // Повинна бути можливість формування загальних
        // списків учасників з’їздів з можливістю   сортування
        // за регіонами, доходами, та по алфавіту.
    }

    IntStream  getGeometrProgr(int start,int end,int koeff){
        IntStream result=IntStream.of();
        for(int i=start;i<=end;i=i*koeff){
            result=IntStream.concat(result,IntStream.of(i));

        }
                 return result;
    }


int  sumForCondition(int start, int end, int koeff, IntPredicate condition){
        int result=0;
        result=getGeometrProgr(start,  end,  koeff).filter(condition).sum();
        return result;

}


}