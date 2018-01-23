export default class FormController {

    constructor($stateParams, $state, ClienteServico,UsuarioServico, Notification) {
        this.record = {}
        this.title = 'Adicionando registro'
        this._service = ClienteServico
        if ($stateParams.id) {
            this.title = 'Editando registro'
            this._service.findById($stateParams.id)
                .then(data => {
                    this.record = data
                })
        }
        this._state = $state
        this._notify = Notification

        this.usuarios = []
        UsuarioServico.findAll()
        .then(data => {
             this.usuarios = data
        },erro => {
            console.log(erro)
            this._notify.error('Erro ao carregar os clientes!')
        })
    }


    save() {
        this._service.save(this.record)
            .then(resp => {
                this._notify.success('Registro salvo com sucesso!')
                this._state.go('cliente.list')
            }).catch(erro => {
                this._notify.error('Erro ao salvar o registro!')
            })
    }
}

FormController.$inject = ['$stateParams', '$state', 'ClienteServico','UsuarioServico', 'Notification']
