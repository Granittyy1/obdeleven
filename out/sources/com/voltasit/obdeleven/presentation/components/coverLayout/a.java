package com.voltasit.obdeleven.presentation.components.coverLayout;

import kotlin.jvm.internal.i;
import p255u9.E;

/* JADX INFO: compiled from: CoverLayoutCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.components.coverLayout.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CoverLayoutCommand.kt */
    public static final class C0332a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f31381a;

        public C0332a(E vehicle) {
            i.e(vehicle, "vehicle");
            this.f31381a = vehicle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0332a) && i.a(this.f31381a, ((C0332a) obj).f31381a);
        }

        public final int hashCode() {
            return this.f31381a.hashCode();
        }

        public final String toString() {
            return "LoadCar(vehicle=" + this.f31381a + ")";
        }
    }

    /* JADX INFO: compiled from: CoverLayoutCommand.kt */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31382a = new b();
    }

    /* JADX INFO: compiled from: CoverLayoutCommand.kt */
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31383a = new c();
    }
}
