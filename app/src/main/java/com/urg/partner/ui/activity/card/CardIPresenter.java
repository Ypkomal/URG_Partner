package com.urg.partner.ui.activity.card;

import com.urg.partner.base.MvpPresenter;

public interface CardIPresenter<V extends CardIView> extends MvpPresenter<V> {

    void deleteCard(String cardId);

    void card();

    void changeCard(String cardId);
}
