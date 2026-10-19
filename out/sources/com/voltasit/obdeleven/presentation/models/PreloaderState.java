package com.voltasit.obdeleven.presentation.models;

import J4.i;
import kotlin.jvm.internal.e;
import p005a4.q;

/* JADX INFO: compiled from: PreloaderState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PreloaderState {
    public static final int $stable = 0;
    private final String state;

    /* JADX INFO: compiled from: PreloaderState.kt */
    public static final class a extends PreloaderState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f32641a;

        public a(int i10) {
            super(i.b(i10, "Custom: "), null);
            this.f32641a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f32641a == ((a) obj).f32641a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32641a);
        }

        @Override // com.voltasit.obdeleven.presentation.models.PreloaderState
        public final String toString() {
            return q.c(new StringBuilder("Custom(message="), this.f32641a, ")");
        }
    }

    /* JADX INFO: compiled from: PreloaderState.kt */
    public static final class b extends PreloaderState {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return kotlin.jvm.internal.i.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Override // com.voltasit.obdeleven.presentation.models.PreloaderState
        public final String toString() {
            return "CustomString(message=null)";
        }
    }

    /* JADX INFO: compiled from: PreloaderState.kt */
    public static final class c extends PreloaderState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f32642a = new c("Default", null);
    }

    /* JADX INFO: compiled from: PreloaderState.kt */
    public static final class d extends PreloaderState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f32643a = new d("Hidden", null);
    }

    public /* synthetic */ PreloaderState(String str, e eVar) {
        this(str);
    }

    public final String getState() {
        return this.state;
    }

    public String toString() {
        return this.state;
    }

    private PreloaderState(String str) {
        this.state = str;
    }
}
