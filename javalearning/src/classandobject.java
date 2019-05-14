/**
 * @author liuhuan
 * @gmail xnjdlhjsj@gmail.com
 * @data 2019-05-2019/5/14
 */
public class classandobject {
    /**
     * 引用的概念，如果一个变量的类型是 类类型，而非基本类型，那么该变量又叫做引用。
     * new Hero();
     * 代表创建了一个Hero对象
     * 但是也仅仅是创建了一个对象，没有办法访问它
     * 为了访问这个对象，会使用引用来代表这个对象
     * Hero h = new Hero();
     * h这个变量是Hero类型，又叫做引用
     * =的意思指的h这个引用代表右侧创建的对象
     * “代表” 在面向对象里，又叫做“指向”
     */
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    /**
     * 多个引用，一个对象
     * @param args
     */
    public static void main(String[] args) {
        classandobject  h1 = new classandobject();
        classandobject h2 = h1;//h2指向h1所指向的对象
        classandobject h3 = h2;
        //h1,h2,h3 五个引用，都指向同一个对象
    }

}

class Item{
    String name;
    int price;
    public void buy(){
        System.out.println("子呢称的方法");
    }
    public void effect(){
        System.out.println("物品使用后可以有效果");
    }

    public static void main(String[] args) {
        Item i = new Item();
        ifeprot lp = new ifeprot();
        lp.effect();
    }
}

class  ifeprot extends Item{
    public void effect(){
        System.out.println("dasdf");
    }
}
class Weapon extends Item{
    int damage; //攻击力

    public static void main(String[] args) {
        Weapon wea = new Weapon();
        wea.name = "无技能";
        wea.damage = 45;
        wea.price = 12344;

    }
}

