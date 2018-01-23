import AbstractCrudService from "../abstract.crud.service";

export default class FornecedorServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/fomentoApp-web/api/fornecedores')
  }

}

FornecedorServico.$inject = ['$http']
