package p131k5;

import U4.C0804l;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L0 f41968d;

    public Q0(L0 l10, String str) {
        this.f41968d = l10;
        C0804l.e(str);
        this.f41965a = str;
    }

    public final String a() {
        if (!this.f41966b) {
            this.f41966b = true;
            this.f41967c = this.f41968d.y().getString(this.f41965a, null);
        }
        return this.f41967c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f41968d.y().edit();
        editorEdit.putString(this.f41965a, str);
        editorEdit.apply();
        this.f41967c = str;
    }
}
