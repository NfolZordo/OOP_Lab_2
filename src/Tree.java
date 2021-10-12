public class Tree {
    private String nameBrand;
    private int numberPackages;     //кількість упаковок
    private float weightOne;          //вага 1 упаковки
    private int numberDaysStorage;    //кількість днів зберігання
    private float weightTotal;          //Загальна вага партії


    Tree() {
        this.nameBrand= "Coffee";
        this.numberPackages = 100;
        this.weightOne = 100;
        this.numberDaysStorage = 20;
        this.weightTotal = numberPackages * weightOne;
    }
    Tree(String nameBrand,int numberPackages,float weightOne,int numberDaysStorage) {
        this.nameBrand= nameBrand;
        this.numberPackages = numberPackages;
        this.weightOne = weightOne ;
        this.numberDaysStorage = numberDaysStorage;
        this.weightTotal = numberPackages * weightOne;
    }

    public String getNameBrand(){
        return(nameBrand);
    }
    public int getNumberPackages(){
        return(numberPackages);
    }
    public float getWeightOne(){return(weightOne);}
    public int getNumberDaysStorage(){
        return(numberDaysStorage);
    }
    public float getWeightTotal(){return(weightTotal);}

    public String getCoffeOll(){
        return("Назва кави - " + nameBrand+"\n"+"Кількість упаковок - "+numberPackages + "\n" + "Вага 1 упаковки - " + weightOne + "\n" + "Загальна вага партії - " + weightTotal + "\n" + "Кі-сть дн. зберігання - " + weightTotal);
    }
}