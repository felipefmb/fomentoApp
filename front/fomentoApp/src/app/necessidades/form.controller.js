export default class FormController {

    constructor($stateParams, $state, NecessidadeServico,ClienteServico, ProdutoServico, Notification) {
        this.itens = []
        this.record = {}
        this.item = {}
        this.title = 'Adicionando registro'
        this._service = NecessidadeServico
        if ($stateParams.id) {
            this.title = 'Editando registro'
            this._service.findById($stateParams.id)
                .then(data => {
                    this.record = data
                    this.itens = this.record.itens
                })
        }
        this._state = $state
        this._notify = Notification

        this.clientes = []
        ClienteServico.findAll()
        .then(data => {
             this.clientes = data
        },erro => {
            console.log(erro)
            this._notify.error('Erro ao carregar as necessidades!')
        })

        this.produtos = []
        ProdutoServico.findAll()
        .then(data => {
            this.produtos = data
        },erro => {
             console.log(erro)
             this._notify.error('Erro ao carregar as produtos!')
        })

    }

    save() {
        this.record.itens = this.itens        
        console.log(this.record)
        this._service.save(this.record)
            .then(resp => {
                this._notify.success('Registro salvo com sucesso!')
                this._state.go('necessidade.list')
            }).catch(erro => {
                this._notify.error('Erro ao salvar o registro!')
            })
    }

    addItem() {
        if (this.item.produto != null && this.item.produto !== undefined) {
            this.itens.push(this.item);                
            this.item = {};
        }
    }

    delItem(id) {        
        this.itens.splice(id,1)        
        this.item = {};
    }

    editItem(id) {
        this.item = this.itens[id]
        this.itens.splice(id,1)        
    }
}

FormController.$inject = ['$stateParams', '$state', 'NecessidadeServico','ClienteServico','ProdutoServico', 'Notification']
