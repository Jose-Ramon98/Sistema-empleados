package com.gestion.clientes.repositorios;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.gestion.clientes.entidades.Empleado;

public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado,Long> {

}
