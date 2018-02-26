package com.example.multi.mysql.data.sources.module2.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "zone")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JpaFoo {
  
  @Id
  private String id;
    
  @Column(name = "w_profile", columnDefinition = "mediumText")  
  private String profilesJson; 


}