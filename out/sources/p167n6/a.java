package p167n6;

import android.content.Context;
import java.util.HashMap;
import p096h7.b;

/* JADX INFO: compiled from: AbtComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44972a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<p192p6.a> f44973b;

    public a(Context context, b<p192p6.a> bVar) {
        this.f44973b = bVar;
    }

    public final synchronized p157m6.b a(String str) {
        try {
            if (!this.f44972a.containsKey(str)) {
                this.f44972a.put(str, new p157m6.b(this.f44973b, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (p157m6.b) this.f44972a.get(str);
    }
}
