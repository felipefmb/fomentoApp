export default class FormController {

    constructor($stateParams, $state, PropostaServico,FornecedorServico,NecessidadeServico, Notification) {
        this._state = $state
        this._notify = Notification
        this.record = {}
        this.title = 'Adicionando registro'
        this._service = PropostaServico

        this.fornecedores = []
        FornecedorServico.findAll()
        .then(data => {
             this.fornecedores = data
        },erro => {
            console.log(erro)
            this._notify.error('Erro ao carregar os fornecedores!')
        })

        this.necessidades = []
        NecessidadeServico.findAll()
        .then(data => {
            console.log(data)
            this.necessidades = data
        },erro => {
            console.log(erro)
            this._notify.error('Erro ao carregar as necessidades!')
        })

        if ($stateParams.id) {
            this.title = 'Editando registro'
            this._service.findById($stateParams.id)
                .then(data => {
                    this.record = data
                })
        }

    }


    save() {
        this._service.save(this.record)
            .then(resp => {
                this._notify.success('Registro salvo com sucesso!')
                this._state.go('proposta.list')
            }).catch(erro => {
                this._notify.error('Erro ao salvar o registro!')
            })
    }
}

FormController.$inject = ['$stateParams', '$state', 'PropostaServico','FornecedorServico','NecessidadeServico', 'Notification']
