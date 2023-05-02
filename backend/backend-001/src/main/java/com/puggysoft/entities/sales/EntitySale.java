package com.puggysoft.entities.sales;

import com.puggysoft.entities.EntitySuperClass;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Table(name = "sales")
@Data
@EqualsAndHashCode(callSuper = true)
public class EntitySale extends EntitySuperClass {

  private String client;

  // IN-PROGRESS, DONE.
  private String status;

  private String note;

  private String tenant;

}
