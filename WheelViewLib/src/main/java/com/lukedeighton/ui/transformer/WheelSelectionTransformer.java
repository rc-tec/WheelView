package com.lukedeighton.ui.transformer;

import android.graphics.drawable.Drawable;

import com.lukedeighton.ui.WheelView;

public interface WheelSelectionTransformer {
    void transform(Drawable drawable, WheelView.ItemState itemState);
}
