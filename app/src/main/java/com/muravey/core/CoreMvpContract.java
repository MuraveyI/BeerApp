package com.muravey.core;

public interface CoreMvpContract {

    interface  View<T extends Presenter> {
        void attachPresenter(T presenter); // передать ссылку чтобы она знала куда отпрвлять

        void finishView();

    }

    interface Presenter<T extends  View>{
        void attachView(T view);

        void detachView();

    }
}
