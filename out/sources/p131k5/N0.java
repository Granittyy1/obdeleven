package p131k5;

import U4.C0804l;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L0 f41913e;

    public N0(L0 l10, String str, boolean z10) {
        this.f41913e = l10;
        C0804l.e(str);
        this.f41909a = str;
        this.f41910b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f41913e.y().edit();
        editorEdit.putBoolean(this.f41909a, z10);
        editorEdit.apply();
        this.f41912d = z10;
    }

    public final boolean b() {
        if (!this.f41911c) {
            this.f41911c = true;
            this.f41912d = this.f41913e.y().getBoolean(this.f41909a, this.f41910b);
        }
        return this.f41912d;
    }
}
