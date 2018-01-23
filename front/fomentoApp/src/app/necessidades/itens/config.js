import ListController from './list.controller'
import FormController from './form.controller'

import NecessidadeServico from './servico'

import { itemConfig } from './itens/config'

export const necessidadeConfig = (modulo) => {

  modulo.service('NecessidadeServico', NecessidadeServico)
        .config(itemConfig(modulo))
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('necessidade', {
        template: require('@views/default.html'),
        url: '/necessidades',
        onEnter: ['$state', function($state) {
          $state.go('necessidade.list')
        }]
      })
      .state('necessidade.list', {
        template: require('@views/necessidades/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('necessidade.new', {
        template: require('@views/necessidades/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('necessidade.edit', {
        template: require('@views/necessidades/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
