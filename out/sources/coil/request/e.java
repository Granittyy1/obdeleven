package coil.request;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: ImageResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f23034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f23035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f23036c;

    public e(Drawable drawable, g gVar, Throwable th) {
        this.f23034a = drawable;
        this.f23035b = gVar;
        this.f23036c = th;
    }

    @Override // coil.request.h
    public final Drawable a() {
        return this.f23034a;
    }

    @Override // coil.request.h
    public final g b() {
        return this.f23035b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (kotlin.jvm.internal.i.a(this.f23034a, eVar.f23034a)) {
                if (kotlin.jvm.internal.i.a(this.f23035b, eVar.f23035b) && kotlin.jvm.internal.i.a(this.f23036c, eVar.f23036c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f23034a;
        return this.f23036c.hashCode() + ((this.f23035b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
