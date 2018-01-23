import ListController from './list.controller'
import FormController from './form.controller'


import PropostaServico from './servico'

export const propostaConfig = (modulo) => {

  modulo.service('PropostaServico', PropostaServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('proposta', {
        template: require('@views/default.html'),
        url: '/propostas',
        onEnter: ['$state', function($state) {
          $state.go('proposta.list')
        }]
      })
      .state('proposta.list', {
        template: require('@views/propostas/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('proposta.new', {
        template: require('@views/propostas/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('proposta.edit', {
        template: require('@views/propostas/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
