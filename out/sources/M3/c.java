package M3;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: NonOwnedDrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b<Drawable> {
    @Override // D3.o
    public final Class<Drawable> c() {
        return this.f4562b.getClass();
    }

    @Override // D3.o
    public final int getSize() {
        T t8 = this.f4562b;
        return Math.max(1, t8.getIntrinsicHeight() * t8.getIntrinsicWidth() * 4);
    }

    @Override // D3.o
    public final void a() {
    }
}
