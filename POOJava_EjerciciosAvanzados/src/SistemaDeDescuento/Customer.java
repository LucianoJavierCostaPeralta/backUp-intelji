package SistemaDeDescuento;

public class Customer {
    //Atributos
    private  String name ;
    private boolean member = false ;
    private String memberType ;

    //Metodos

    //Metodo Constructor
    public Customer(String name) {
        this.name = name;
    }

    //Metodos Geter & Seters
    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "\nName : "+name+
                "\nMember : "+member+
                "\nMemberType : "+memberType;
    }
}
