import AbstractCrudService from "../abstract.crud.service";

export default class UsuarioServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/fomentoApp-web/api/usuarios')
  }

}

UsuarioServico.$inject = ['$http']