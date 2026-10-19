package p131k5;

import U4.C0804l;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L0 f41954e;

    public P0(L0 l10, String str, long j) {
        this.f41954e = l10;
        C0804l.e(str);
        this.f41950a = str;
        this.f41951b = j;
    }

    public final long a() {
        if (!this.f41952c) {
            this.f41952c = true;
            this.f41953d = this.f41954e.y().getLong(this.f41950a, this.f41951b);
        }
        return this.f41953d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.f41954e.y().edit();
        editorEdit.putLong(this.f41950a, j);
        editorEdit.apply();
        this.f41953d = j;
    }
}
