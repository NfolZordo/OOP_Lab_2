public class Tree {
    String type;
    int height;          //висота
    float widthTrunk;    //діаметр стовбуру
    float widthVrown;    //діаметр крони
    int age;
    static float widthArea;
    static float widthShadow;
    Tree() {
        type= "Tree";
        height = 100;          //висота
        widthTrunk = 3;    //діаметр стовбуру
        widthVrown = 20;    //діаметр крони
        age = 40;
    }
    Tree(float widthTrunk, float widthVrown){
        widthArea = (float) ((widthTrunk+widthVrown) * 3.41);
    }

    Tree(float widthTrunk, float widthVrown, int height){
        this(widthTrunk, widthVrown);
        widthShadow = (float) ((widthArea*height) * 0.2);
    }

    float getArea(){
        new Tree(widthTrunk, widthVrown);
        return widthArea;

    }
    float getAge(){
        new Tree(widthTrunk, widthVrown, height);
        return widthShadow;
    }
    int getHeight(){
        return height;
    }
}