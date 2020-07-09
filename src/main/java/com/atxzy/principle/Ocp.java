package com.atxzy.principle;



public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape1(new Circle());
        graphicEditor.drawShape(new Rectangle());

    }

}
//这是一个用于绘图的类
class GraphicEditor{
    //接收Shape对象，然后根据type绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type == 1) {
            drawRectangle(s);
        }
        else if(s.m_type == 2){
            drawCircle(s);
        }
    }
    public void drawRectangle(Shape r){
        System.out.println("矩形");
    }
    public void drawCircle(Shape r){
        System.out.println("圆形");
    }
    public void drawShape1(Shape r){
        r.draw();
    }
}

//Shape类，基类
abstract class Shape{
    int m_type;
    public abstract void draw();//抽象方法
}

class Circle extends Shape{
    public Circle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Rectangle extends Shape{
    public Rectangle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}