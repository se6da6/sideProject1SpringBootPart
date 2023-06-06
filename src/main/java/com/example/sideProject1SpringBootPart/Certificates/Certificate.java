package com.example.sideProject1SpringBootPart.Certificates;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "certificates")
public class Certificate {
    @Id
    @SequenceGenerator(
        name="certificate_sequence",
        sequenceName = "certificate_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "certificate_sequence")
    private Long id;
    private String certificateName;
    private String issuingAuthority;
    private LocalDate issueDate;


    public Certificate() {
    }

    public Certificate(Long id, String certificateName, String issuingAuthority, LocalDate issueDate) {
        this.id = id;
        this.certificateName = certificateName;
        this.issuingAuthority = issuingAuthority;
        this.issueDate = issueDate;
    }

    public Certificate(String certificateName, String issuingAuthority, LocalDate issueDate) {
        this.certificateName = certificateName;
        this.issuingAuthority = issuingAuthority;
        this.issueDate = issueDate;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCertificateName() {
        return this.certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public LocalDate getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", certificateName='" + getCertificateName() + "'" +
            ", issuingAuthority='" + getIssuingAuthority() + "'" +
            ", issueDate='" + getIssueDate() + "'" +
            "}";
    }

    
}
