package com.voltasit.obdeleven.interfaces;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes3.dex */
public interface SimpleAnimationListener extends Animation.AnimationListener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimationState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AnimationState f31114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnimationState f31115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AnimationState f31116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AnimationState[] f31117e;

        static {
            AnimationState animationState = new AnimationState("START", 0);
            f31114b = animationState;
            AnimationState animationState2 = new AnimationState("END", 1);
            f31115c = animationState2;
            AnimationState animationState3 = new AnimationState("REPEAT", 2);
            f31116d = animationState3;
            f31117e = new AnimationState[]{animationState, animationState2, animationState3};
        }

        public AnimationState() {
            throw null;
        }

        public static AnimationState valueOf(String str) {
            return (AnimationState) Enum.valueOf(AnimationState.class, str);
        }

        public static AnimationState[] values() {
            return (AnimationState[]) f31117e.clone();
        }
    }

    void a(AnimationState animationState);

    @Override // android.view.animation.Animation.AnimationListener
    default void onAnimationEnd(Animation animation) {
        a(AnimationState.f31115c);
    }

    @Override // android.view.animation.Animation.AnimationListener
    default void onAnimationRepeat(Animation animation) {
        a(AnimationState.f31116d);
    }

    @Override // android.view.animation.Animation.AnimationListener
    default void onAnimationStart(Animation animation) {
        a(AnimationState.f31114b);
    }
}
