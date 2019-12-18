package it.univpm.smartshop.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERTYPE")
public class Usertype
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Usertype")
    private String id_user;
    

    @Column(name = "Typename")
    private String type_name;

    @OneToOne(mappedBy = "id_type", cascade = CascadeType.ALL)
    public String getId_user()
    {
        return id_user;
    }


    public void setId_user(String id_user)
    {
        this.id_user = id_user;
    }


    public String getType_name()
    {
        return type_name;
    }


    public void setType_name(String type_name)
    {
        this.type_name = type_name;
    }
    

 
}
