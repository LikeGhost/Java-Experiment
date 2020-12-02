package enums;

public enum University {
    JMU("集美大学",City.Xiamen),PKU("北京大学",City.Beijing),FUDAN("复旦大学",City.Shanghai),
    THU("清华大学",City.Beijing),XMU("厦门大学",City.Xiamen);

    private City city;
    private String chineseName;
    private University(String chineseName,City city){
        this.chineseName=chineseName;
        this.city=city;
    }

    public City getCity() {
        return city;
    }

    public String getChineseName() {
        return chineseName;
    }

}
