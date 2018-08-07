package com.rafaels.juegorol.createpj;

public class CreatePjPresenter implements ContractCreatePj.CreatePjPresenter {
    private CreatePjView createPjView;
    private CreatePjModel createPjModel;

    public CreatePjPresenter(CreatePjView createPjView) {
        this.createPjView = createPjView;
        this.createPjModel = new CreatePjModel(this);
    }

}
