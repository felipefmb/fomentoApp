import AbstractCrudService from "../abstract.crud.service";

export default class NecessidadeServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/fomentoApp-web/api/necessidades')
  }

}

NecessidadeServico.$inject = ['$http']