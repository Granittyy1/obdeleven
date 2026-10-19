package androidx.work;

import android.net.Uri;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f20340i = new c(NetworkType.f20296b, false, false, false, false, -1, -1, EmptySet.f42985b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkType f20341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<a> f20348h;

    /* JADX INFO: compiled from: Constraints.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f20349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20350b;

        public a(boolean z10, Uri uri) {
            this.f20349a = uri;
            this.f20350b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f20349a, aVar.f20349a) && this.f20350b == aVar.f20350b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20350b) + (this.f20349a.hashCode() * 31);
        }
    }

    public c(NetworkType requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j, long j10, Set<a> contentUriTriggers) {
        kotlin.jvm.internal.i.e(requiredNetworkType, "requiredNetworkType");
        kotlin.jvm.internal.i.e(contentUriTriggers, "contentUriTriggers");
        this.f20341a = requiredNetworkType;
        this.f20342b = z10;
        this.f20343c = z11;
        this.f20344d = z12;
        this.f20345e = z13;
        this.f20346f = j;
        this.f20347g = j10;
        this.f20348h = contentUriTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c.class.equals(obj.getClass())) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f20342b == cVar.f20342b && this.f20343c == cVar.f20343c && this.f20344d == cVar.f20344d && this.f20345e == cVar.f20345e && this.f20346f == cVar.f20346f && this.f20347g == cVar.f20347g && this.f20341a == cVar.f20341a) {
            return kotlin.jvm.internal.i.a(this.f20348h, cVar.f20348h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f20341a.hashCode() * 31) + (this.f20342b ? 1 : 0)) * 31) + (this.f20343c ? 1 : 0)) * 31) + (this.f20344d ? 1 : 0)) * 31) + (this.f20345e ? 1 : 0)) * 31;
        long j = this.f20346f;
        int i10 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j10 = this.f20347g;
        return this.f20348h.hashCode() + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f20341a + ", requiresCharging=" + this.f20342b + ", requiresDeviceIdle=" + this.f20343c + ", requiresBatteryNotLow=" + this.f20344d + ", requiresStorageNotLow=" + this.f20345e + ", contentTriggerUpdateDelayMillis=" + this.f20346f + ", contentTriggerMaxDelayMillis=" + this.f20347g + ", contentUriTriggers=" + this.f20348h + ", }";
    }

    public c(c other) {
        kotlin.jvm.internal.i.e(other, "other");
        this.f20342b = other.f20342b;
        this.f20343c = other.f20343c;
        this.f20341a = other.f20341a;
        this.f20344d = other.f20344d;
        this.f20345e = other.f20345e;
        this.f20348h = other.f20348h;
        this.f20346f = other.f20346f;
        this.f20347g = other.f20347g;
    }
}
