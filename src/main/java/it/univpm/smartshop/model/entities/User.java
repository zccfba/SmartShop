package it.univpm.smartshop.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_User")
    private String id_user;
    

    @Column(name = "ID_Type")
    private String id_type;
    
 
    @Column(name = "ID_List")
    private String id_list;
    

    @Column(name = "Namer")
    private String name;
    

    @Column(name = "Surname")
    private String surname;
    

    @Column(name = "City")
    private String city;
    

    @Column(name = "Post_coder")
    private String postcode;
    

    @Column(name = "Address")
    private String address;
    
 
    @Column(name = "Province")
    private String province;
    

    @Column(name = "Country")
    private String country;
    

    @Column(name = "Phone_Number")
    private String phone_number;

    public String getId_user()
    {
        return id_user;
    }
   
    public void setId_user(String id_user)
    {
        this.id_user = id_user;
    }
    
    @OneToOne(mappedBy = "id_user", cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Usertype")
    public String getId_type()
    {
        return id_type;
    }

    public void setId_type(String id_type)
    {
        this.id_type = id_type;
    }

    public String getId_list()
    {
        return id_list;
    }

    public void setId_list(String id_list)
    {
        this.id_list = id_list;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getPhone_number()
    {
        return phone_number;
    }

    public void setPhone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }
    
    
    
}
