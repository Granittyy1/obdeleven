package com.voltasit.obdeleven.presentation.appList;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AppAdapterItem.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: compiled from: AppAdapterItem.kt */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f31316b;

        public a(int i10, String str) {
            this.f31315a = i10;
            this.f31316b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31315a == aVar.f31315a && i.a(this.f31316b, aVar.f31316b);
        }

        public final int hashCode() {
            return this.f31316b.hashCode() + (Integer.hashCode(this.f31315a) * 31);
        }

        public final String toString() {
            return "Info(textResId=" + this.f31315a + ", url=" + this.f31316b + ")";
        }
    }

    /* JADX INFO: compiled from: AppAdapterItem.kt */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I8.a f31317a;

        public b(I8.a oca) {
            i.e(oca, "oca");
            this.f31317a = oca;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && i.a(this.f31317a, ((b) obj).f31317a);
        }

        public final int hashCode() {
            return this.f31317a.hashCode();
        }

        public final String toString() {
            return "Item(oca=" + this.f31317a + ")";
        }
    }
}
