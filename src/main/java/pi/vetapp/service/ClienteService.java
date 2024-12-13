package pi.vetapp.service;

import pi.vetapp.entity.Cliente;

import java.util.List;

public interface ClienteService {
  List<Cliente> getAllClientes();

  Cliente insertarCliente(Cliente cliente);

  Cliente actualizarCliente(int codigoCliente, Cliente cliente);

  void eliminarCliente(int codigoCliente);
}