package com.muravey.beerapp.presentation.beerdetails;

import com.muravey.core.CoreMvpContract;

public interface IBeerDetailsContract {

interface View extends CoreMvpContract.View<Presenter>{

}

interface Presenter extends CoreMvpContract.Presenter<View>{

}

}
