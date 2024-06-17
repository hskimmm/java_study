package interfaces.ex3;

public class KiaCar implements Car{

    @Override
    public String carName() {
        return "모닝";
    }

    @Override
    public int showEngine() {
        return 100000;
    }

    @Override
    public void amountNavi() {
        System.out.println("모닝 amountNavi");
    }

    @Override
    public String getTier() {
        return "모닝 타이어";
    }
}
