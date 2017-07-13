package tweentyscoops.mvp.kotlin.ui.main

import tweentyscoops.mvp.kotlin.ui.base.BaseContract

class TemplateContract {

    interface View : BaseContract.View {

    }

    interface Presenter<V : View> : BaseContract.Presenter<V> {

    }
}