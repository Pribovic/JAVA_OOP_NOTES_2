package com.gunay.oop_details_java;

public interface Walk {

    public boolean walker();

    // override edilmesi gerekmeyen ve eğer override etmessen implement eden sınıfın default bir şekilde kullanabildiği metodlar yazılabilir
    // eğer default halini kullanmak istemiyorsan override ederek istediğin haline getirebilirsin.
    public default boolean walkerBody(){
        System.out.println("default is true");
        return true;
    }

}
