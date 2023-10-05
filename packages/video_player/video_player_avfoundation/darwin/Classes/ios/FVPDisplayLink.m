// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

#import "../FVPDisplayLink.h"

#import <CoreAnimation/CoreAnimation.h>
#import <Foundation/Foundation.h>

/** A proxy object to act as a CADisplayLink target, to avoid retain loops. */
@interface FVPDisplayLinkTarget : NSObject
@property(nonatomic) (void (^)(void))callback;

/** Initializes a target object that runs the given callback when onDisplayLink: is called. */
- (instancetype)initWithCallback:(void (^)(void))callback;

/** Method to be called when a CADisplayLink fires. */
- (void)onDisplayLink:(CADisplayLink *)link;
@end

@implementation FVPDisplayLinkTarget
- (instancetype)initWithCallback:(void (^)(void))callback {
  self = [super init];
  if (self) {
    _callback = callback;
  }
  return self;
}

- (void)onDisplayLink:(CADisplayLink *)link {
  self.callback();
}
@end

#pragma mark -

@interface FVPDisplayLink()
// The underlying display link implementation.
@property(nonatomic) CADisplayLink *displayLink;
@property(nonatomic) FVPDisplayLinkTarget *target;
@end

@implementation FVPDisplayLink

- (instancetype)initWithCallback:(void (^)(void))callback {
  self = [super init];
  if (self) {
    _target = [[FVPDisplayLinkTarget alloc] initWithCallback:callback];
    _displayLink = [CADisplayLink displayLinkWithTarget:_target
                                               selector:@selector(onDisplayLink:)];
    [_displayLink addToRunLoop:[NSRunLoop currentRunLoop] forMode:NSRunLoopCommonModes];
    _displayLink.paused = YES;
  }
  return self;
}

- (void)dealloc {
  [_displayLink invalidate];
}

- (void)setRunning:(BOOL)running {
  self.displayLink.paused = !running;
}

@end
