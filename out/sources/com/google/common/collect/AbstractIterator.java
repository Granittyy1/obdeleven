package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractIterator<T> extends C<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f27812b = State.f27815c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f27813c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f27814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f27815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f27816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f27817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f27818f;

        static {
            State state = new State("READY", 0);
            f27814b = state;
            State state2 = new State("NOT_READY", 1);
            f27815c = state2;
            State state3 = new State("DONE", 2);
            f27816d = state3;
            State state4 = new State("FAILED", 3);
            f27817e = state4;
            f27818f = new State[]{state, state2, state3, state4};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f27818f.clone();
        }
    }

    public abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state = this.f27812b;
        State state2 = State.f27817e;
        A8.p.q(state != state2);
        int iOrdinal = this.f27812b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f27812b = state2;
        this.f27813c = a();
        if (this.f27812b == State.f27816d) {
            return false;
        }
        this.f27812b = State.f27814b;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27812b = State.f27815c;
        T t8 = this.f27813c;
        this.f27813c = null;
        return t8;
    }
}
