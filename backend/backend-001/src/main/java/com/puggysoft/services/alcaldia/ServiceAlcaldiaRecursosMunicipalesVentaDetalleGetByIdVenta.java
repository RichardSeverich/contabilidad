package com.puggysoft.services.alcaldia;

import com.puggysoft.dtos.alcaldia.DtoAlcaldiaRecursosMunicipalesVentaDetalle;
import com.puggysoft.repositories.alcaldia.IRepositoryAlcaldiaRecursosMunicipalesVentaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/** Services for create. */
@Service
public class ServiceAlcaldiaRecursosMunicipalesVentaDetalleGetByIdVenta {

  @Autowired
  private IRepositoryAlcaldiaRecursosMunicipalesVentaDetalle IRepository;

  /** method for get by idVenta. */
  public ResponseEntity<DtoAlcaldiaRecursosMunicipalesVentaDetalle> getDtoRecursosMunicipalesVentaDetalleByIdVenta(
      Integer idVenta) {
      DtoAlcaldiaRecursosMunicipalesVentaDetalle dto = DtoAlcaldiaRecursosMunicipalesVentaDetalle
          .entityToDto(IRepository.getVentaDetalleTimbresByIdVenta(idVenta));
      return ResponseEntity.status(HttpStatus.OK).body(dto);
  }
}
