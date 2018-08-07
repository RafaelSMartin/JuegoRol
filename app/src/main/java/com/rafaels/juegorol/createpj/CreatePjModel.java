package com.rafaels.juegorol.createpj;

public class CreatePjModel implements ContractCreatePj.CreatePjModel{
    private CreatePjPresenter createPjPresenter;

    public CreatePjModel(CreatePjPresenter createPjPresenter) {
        this.createPjPresenter = createPjPresenter;
    }

}
