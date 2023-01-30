package 제너릭응용;

public class GenericPrinter<T extends Material> { //Material로부터 상속받은 클래스만 타입변수로 지정 가능 하도록 함
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material.toString();
    }
}
