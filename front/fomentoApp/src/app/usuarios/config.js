import ListController from './list.controller'
import FormController from './form.controller'

import UsuarioServico from './servico'

export const usuarioConfig = (modulo) => {

  modulo.service('UsuarioServico', UsuarioServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('usuario', {
        template: require('@views/default.html'),
        url: '/usuarios',
        onEnter: ['$state', function($state) {
          $state.go('usuario.list')
        }]
      })
      .state('usuario.list', {
        template: require('@views/usuarios/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('usuario.new', {
        template: require('@views/usuarios/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('usuario.edit', {
        template: require('@views/usuarios/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
