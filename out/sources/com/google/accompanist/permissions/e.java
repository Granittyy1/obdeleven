package com.google.accompanist.permissions;

import Z3.o;

/* JADX INFO: compiled from: PermissionsUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: compiled from: PermissionsUtil.kt */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f25217a;

        public a(boolean z10) {
            this.f25217a = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f25217a == ((a) obj).f25217a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f25217a);
        }

        public final String toString() {
            return o.d(new StringBuilder("Denied(shouldShowRationale="), this.f25217a, ')');
        }
    }

    /* JADX INFO: compiled from: PermissionsUtil.kt */
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25218a = new b();
    }
}
