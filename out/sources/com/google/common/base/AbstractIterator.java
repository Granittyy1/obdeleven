package com.google.common.base;

import A8.p;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public State f27769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27770c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f27771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f27772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f27773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f27774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ State[] f27775f;

        static {
            State state = new State("READY", 0);
            f27771b = state;
            State state2 = new State("NOT_READY", 1);
            f27772c = state2;
            State state3 = new State("DONE", 2);
            f27773d = state3;
            State state4 = new State("FAILED", 3);
            f27774e = state4;
            f27775f = new State[]{state, state2, state3, state4};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f27775f.clone();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state;
        String string;
        a.c cVar;
        State state2 = this.f27769b;
        State state3 = State.f27774e;
        p.q(state2 != state3);
        int iOrdinal = this.f27769b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.f27769b = state3;
        h.a aVar = (h.a) this;
        int i10 = aVar.f27805f;
        while (true) {
            int length = aVar.f27805f;
            state = State.f27773d;
            if (length == -1) {
                aVar.f27769b = state;
                string = null;
                break;
            }
            f fVar = (f) aVar;
            a.b bVar = fVar.f27799h.f27800a;
            CharSequence charSequence = fVar.f27803d;
            int length2 = charSequence.length();
            p.k(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            CharSequence charSequence2 = aVar.f27803d;
            if (length == -1) {
                length = charSequence2.length();
                aVar.f27805f = -1;
            } else {
                aVar.f27805f = length + 1;
            }
            int i11 = aVar.f27805f;
            if (i11 != i10) {
                while (true) {
                    cVar = aVar.f27804e;
                    if (i10 >= length || !cVar.a(charSequence2.charAt(i10))) {
                        break;
                    }
                    i10++;
                }
                while (length > i10 && cVar.a(charSequence2.charAt(length - 1))) {
                    length--;
                }
                int i12 = aVar.f27806g;
                if (i12 == 1) {
                    length = charSequence2.length();
                    aVar.f27805f = -1;
                    while (length > i10 && cVar.a(charSequence2.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    aVar.f27806g = i12 - 1;
                }
                string = charSequence2.subSequence(i10, length).toString();
                break;
            }
            int i13 = i11 + 1;
            aVar.f27805f = i13;
            if (i13 > charSequence2.length()) {
                aVar.f27805f = -1;
            }
        }
        this.f27770c = string;
        if (this.f27769b == state) {
            return false;
        }
        this.f27769b = State.f27771b;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27769b = State.f27772c;
        T t8 = (T) this.f27770c;
        this.f27770c = null;
        return t8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
