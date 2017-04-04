package com.apl.ticket.ui.home.contract;

import com.vittaw.mvplibrary.base.BaseModel;
import com.vittaw.mvplibrary.base.BasePresenter;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/31.
 */

public interface FoundReadContract {

    abstract class Presenter extends BasePresenter {

        public abstract void getFoundReadBeen(Map<String ,String> map);

    }

    interface Model extends BaseModel{

    }

}
