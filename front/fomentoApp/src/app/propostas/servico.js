import AbstractCrudService from "../abstract.crud.service";

export default class PropostaServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/fomentoApp-web/api/propostas')
  }

}

PropostaServico.$inject = ['$http']