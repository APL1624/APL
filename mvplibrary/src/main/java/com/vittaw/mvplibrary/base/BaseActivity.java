package com.vittaw.mvplibrary.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.vittaw.mvplibrary.utils.TypeUtil;

import butterknife.ButterKnife;



public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends AppCompatActivity {

    public P mPresenter;

    public M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在设置布局前做操作
        doBeforeLayout();
        //设置布局
        setContentView(getLayoutId());
        //View注入
        ButterKnife.bind(this);
        //初始化Presenter
        mPresenter = TypeUtil.getObject(this,0);//activity 类上的泛型
        //初始化Model
        mModel = TypeUtil.getObject(this,1);
        //初始化View 和 Model
        if (mPresenter != null){
            initPresenter();
        }
        //初始化View
        initView();
    }

    /**
     * 预留 : 在设置布局前操作
     */
    protected void doBeforeLayout(){

    }

    /**
     * 给activity设置布局
     * @return resId
     */
    public abstract int getLayoutId();

    /**
     * mPresenter.setVM() 初始化presenter中持有的view 和 model
     *
     * 在presenter里需要持有view接口,所以要init,将view传到presenter里,不封装的时候,activity实现接口,传this,
     * 现在抽象出来,留给子Activity去实现
     *
     *
     * view → 因为要在activity实现view接口后,传this,所以封装,留给子类去实现
     * model → new 出来的,通过拿到class上的泛型,反射创建一个对象出来
     */
    public abstract void initPresenter();


    public abstract void initView();



}
