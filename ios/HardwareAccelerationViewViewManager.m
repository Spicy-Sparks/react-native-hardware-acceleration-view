#import <React/RCTViewManager.h>

@interface HardwareAccelerationViewManager : RCTViewManager
@end

@implementation HardwareAccelerationViewManager

RCT_EXPORT_MODULE(HardwareAccelerationView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_CUSTOM_VIEW_PROPERTY(accelerated, NSString, UIView)
{
}

@end
