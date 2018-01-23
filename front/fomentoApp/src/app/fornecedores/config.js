import ListController from './list.controller'
import FormController from './form.controller'

import FornecedorServico from './servico'

export const fornecedorConfig = (modulo) => {

  modulo.service('FornecedorServico', FornecedorServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('fornecedor', {
        template: require('@views/default.html'),
        url: '/fornecedores',
        onEnter: ['$state', function($state) {
          $state.go('fornecedor.list')
        }]
      })
      .state('fornecedor.list', {
        template: require('@views/fornecedores/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('fornecedor.new', {
        template: require('@views/fornecedores/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('fornecedor.edit', {
        template: require('@views/fornecedores/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
