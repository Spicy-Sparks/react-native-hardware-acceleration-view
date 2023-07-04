package com.hardwareaccelerationview;

import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class HardwareAccelerationViewManager extends ViewGroupManager<FrameLayout> {
  public static final String REACT_CLASS = "HardwareAccelerationView";

  @Override
  @NonNull
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  @NonNull
  public FrameLayout createViewInstance(ThemedReactContext reactContext) {
    return new FrameLayout(reactContext);
  }

  @ReactProp(name = "accelerated")
  public void setAccelerated(View view, Boolean accelerated) {
    view.setLayerType(accelerated ? View.LAYER_TYPE_HARDWARE : View.LAYER_TYPE_SOFTWARE, null);
  }
}
