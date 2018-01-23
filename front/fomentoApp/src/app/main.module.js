import * as angular from 'angular'

import { default as uiRouter } from '@uirouter/angularjs'
import { default as uiNotification } from 'angular-ui-notification'
import { default as inputMasks } from 'angular-input-masks'
import { mainConfig } from './main/config'
import { usuarioConfig } from './usuarios/config'
import { fornecedorConfig } from './fornecedores/config'
import { clienteConfig } from './clientes/config'
import { produtoConfig } from './produtos/config'
import { propostaConfig } from './propostas/config'
import { necessidadeConfig } from './necessidades/config'

require('angular-i18n/angular-locale_pt-br.js')

export const appModule = 'app'

var modulo = angular.module(appModule, [uiRouter, uiNotification, inputMasks])

modulo.config(mainConfig(modulo))
      .config(usuarioConfig(modulo))      
      .config(fornecedorConfig(modulo))
      .config(clienteConfig(modulo))
      .config(produtoConfig(modulo))
      .config(propostaConfig(modulo))
      .config(necessidadeConfig(modulo))
      
