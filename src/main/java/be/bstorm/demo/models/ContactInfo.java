package be.bstorm.demo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactInfo {
    @Column(name = "contact_phoneNumber")
    private String phoneNumber;
    @Column(name = "contact_webSite")
    private String webSite;
}
