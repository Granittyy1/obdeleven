package com.obdeleven.service.interfaces;

import G8.l;
import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
public interface IDevice {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f29313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f29314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f29315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f29316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f29317f;

        static {
            State state = new State("UNKNOWN", 0);
            f29313b = state;
            State state2 = new State("FIRMWARE", 1);
            f29314c = state2;
            State state3 = new State("FIRMWARE_OLD", 2);
            f29315d = state3;
            State state4 = new State("BOOTLOADER", 3);
            f29316e = state4;
            f29317f = new State[]{state, state2, state3, state4};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f29317f.clone();
        }
    }

    String b();

    String c();

    void d(l lVar);

    l e();

    String f();

    Task<Float> g();

    String getVersion();

    Task<Void> h(String str);

    String i();
}
