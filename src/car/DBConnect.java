/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package car;

/**
 *
 * @author n.u. karl
 */
public enum DBConnect {
    
        URL("jdbc:sqlserver://DESKTOP-C280F8T\\MSSQLSERVER;databaseName=carrental"),
        USER("papers"),
            PASSWORD("papersarewhite");

    private String val;

    DBConnect(String val){
        this.val = val;
    }

    public String getDBConnect(){
        return val;
    }
    
}
