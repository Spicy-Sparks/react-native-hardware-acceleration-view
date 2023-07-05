package com.hardwareaccelerationview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class HardwareAccelerationViewManager extends ViewGroupManager<ViewGroup> {
  public static final String REACT_CLASS = "HardwareAccelerationView";

  @Override
  @NonNull
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  @NonNull
  public ViewGroup createViewInstance(ThemedReactContext reactContext) {
    return new ViewGroup(reactContext) {
      @Override
      protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
      }
    };
  }

  @ReactProp(name = "accelerated")
  public void setAccelerated(ViewGroup view, Boolean accelerated) {
    view.setLayerType(accelerated ? View.LAYER_TYPE_HARDWARE : View.LAYER_TYPE_SOFTWARE, null);
  }
}
