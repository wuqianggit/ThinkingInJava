package polymorphism;

/**
 * 销售管理系统
 * polymorphism
 *
 * 2017/11/2-14:25
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/2.
 */
/*多态
* 初始化的顺序
* */
class Glyph{
    void draw(){
        System.out.println(" Glyph.draw()");
    }
    Glyph(){
        System.out.println(" Glyph() before Draw() ");
        draw();
        System.out.println(" Glyph() after Draw() ");
    }

}
class RoundGlyph extends Glyph{
    private int radius=1;
    RoundGlyph(int r){
        this.radius=r;
        System.out.println("RoundGlyph.RoundGlyph（）.radius= "+radius);
    }
    void draw(){
        System.out.println(" RoundGlyph.draw(),radius= "+radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
