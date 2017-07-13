package tweentyscoops.mvp.kotlin.template.fragment

import tweentyscoops.mvp.kotlin.ui.base.BaseContract

class TemplateContract {

    interface View : BaseContract.View {

    }

    interface Presenter<V : View> : BaseContract.Presenter<V> {

    }
}