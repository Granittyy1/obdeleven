package P1;

import p078g1.s;

/* JADX INFO: compiled from: MotionPhotoMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4888e;

    public a(long j, long j10, long j11, long j12, long j13) {
        this.f4884a = j;
        this.f4885b = j10;
        this.f4886c = j11;
        this.f4887d = j12;
        this.f4888e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4884a == aVar.f4884a && this.f4885b == aVar.f4885b && this.f4886c == aVar.f4886c && this.f4887d == aVar.f4887d && this.f4888e == aVar.f4888e;
    }

    public final int hashCode() {
        return com.google.common.primitives.a.a(this.f4888e) + ((com.google.common.primitives.a.a(this.f4887d) + ((com.google.common.primitives.a.a(this.f4886c) + ((com.google.common.primitives.a.a(this.f4885b) + ((com.google.common.primitives.a.a(this.f4884a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f4884a + ", photoSize=" + this.f4885b + ", photoPresentationTimestampUs=" + this.f4886c + ", videoStartPosition=" + this.f4887d + ", videoSize=" + this.f4888e;
    }
}
