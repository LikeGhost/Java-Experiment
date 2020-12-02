package enums;

public enum City {
    Xiamen("厦门"),Beijing("北京"),Shanghai("上海");

    private String chineseName;

    private City(String chineseName){
        this.chineseName=chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }
}
