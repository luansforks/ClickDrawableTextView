package com.matpag.clickdrawabletextview;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.matpag.clickdrawabletextview.interfaces.ClickableDrawable;
import com.matpag.clickdrawabletextview.interfaces.OnDrawableClickListener;

/**
 * A custom implementation of {@link AppCompatEditText} to add some advanced
 * features with the drawable handling
 *
 * Created by Mattia Pagini on 23/04/2017.
 */
public class ClickDrawableEditText extends AppCompatEditText implements ClickableDrawable {

    public CsDrawableViewManager mCsDrawableViewManager = new CsDrawableViewManager(this);

    public ClickDrawableEditText(Context context) {
        super(context);
        mCsDrawableViewManager.init(context, null);
    }

    public ClickDrawableEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mCsDrawableViewManager.init(context, attrs);
    }

    public ClickDrawableEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mCsDrawableViewManager.init(context, attrs);
    }

    @Override
    public void setOnDrawableClickListener(OnDrawableClickListener listener) {
        mCsDrawableViewManager.setOnDrawableClickListener(listener);
    }

    @Override
    public void removeOnDrawableClickListener() {
        mCsDrawableViewManager.removeOnDrawableClickListener();
    }

    @Override
    public void addStartCsDrawable(CsDrawable csDrawable) {
        mCsDrawableViewManager.addStartCsDrawable(csDrawable);
    }

    @Override
    public void addTopCsDrawable(CsDrawable csDrawable) {
        mCsDrawableViewManager.addTopCsDrawable(csDrawable);
    }

    @Override
    public void addEndCsDrawable(CsDrawable csDrawable) {
        mCsDrawableViewManager.addEndCsDrawable(csDrawable);
    }

    @Override
    public void addBottomCsDrawable(CsDrawable csDrawable) {
        mCsDrawableViewManager.addBottomCsDrawable(csDrawable);
    }

    @Override
    public void showStartCsDrawable(boolean visible) {
        mCsDrawableViewManager.showStartCsDrawable(visible);
    }

    @Override
    public void showTopCsDrawable(boolean visible) {
        mCsDrawableViewManager.showTopCsDrawable(visible);
    }

    @Override
    public void showEndCsDrawable(boolean visible) {
        mCsDrawableViewManager.showEndCsDrawable(visible);
    }

    @Override
    public void showBottomCsDrawable(boolean visible) {
        mCsDrawableViewManager.showBottomCsDrawable(visible);
    }

    @Override
    public void removeAllCsDrawables() {
        mCsDrawableViewManager.removeAllCsDrawables();
    }

    @Override
    public void disableFocusOnText(boolean preventReFocus, boolean closeKeyboard) {
        mCsDrawableViewManager.disableFocusOnText(preventReFocus, closeKeyboard);
    }

    @Override
    public void enableFocusOnText(boolean openKeyboard) {
        mCsDrawableViewManager.enableFocusOnText(openKeyboard);
    }

    @Override
    public void openKeyboard() {
        mCsDrawableViewManager.openKeyboard();
    }

    @Override
    public void closeKeyboard() {
        mCsDrawableViewManager.closeKeyboard();
    }
}
