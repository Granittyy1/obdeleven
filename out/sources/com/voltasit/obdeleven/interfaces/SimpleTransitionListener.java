package com.voltasit.obdeleven.interfaces;

import D2.F;

/* JADX INFO: loaded from: classes3.dex */
public interface SimpleTransitionListener extends F.e {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TransitionState f31118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TransitionState f31119c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ TransitionState[] f31120d;

        static {
            TransitionState transitionState = new TransitionState("START", 0);
            f31118b = transitionState;
            TransitionState transitionState2 = new TransitionState("END", 1);
            f31119c = transitionState2;
            f31120d = new TransitionState[]{transitionState, transitionState2};
        }

        public TransitionState() {
            throw null;
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) f31120d.clone();
        }
    }

    @Override // D2.F.e
    default void d(F f10) {
        f(TransitionState.f31118b);
    }

    @Override // D2.F.e
    default void e(F f10) {
        f(TransitionState.f31119c);
    }

    void f(TransitionState transitionState);

    @Override // D2.F.e
    default void a(F f10) {
    }

    @Override // D2.F.e
    default void b(F f10) {
    }

    @Override // D2.F.e
    default void c(F f10) {
    }
}
