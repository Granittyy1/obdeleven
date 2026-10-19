package androidx.emoji2.text;

import R0.g;
import R0.h;
import R0.l;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: EmojiCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a f17341a;

    public b(c.a aVar) {
        this.f17341a = aVar;
    }

    @Override // androidx.emoji2.text.c.h
    public final void a(Throwable th) {
        this.f17341a.f17354a.f(th);
    }

    @Override // androidx.emoji2.text.c.h
    public final void b(l lVar) {
        c.a aVar = this.f17341a;
        aVar.f17353c = lVar;
        l lVar2 = aVar.f17353c;
        c cVar = aVar.f17354a;
        aVar.f17352b = new h(lVar2, cVar.f17349g, cVar.f17351i, Build.VERSION.SDK_INT >= 34 ? g.a() : I2.e.j());
        c cVar2 = aVar.f17354a;
        cVar2.getClass();
        ArrayList arrayList = new ArrayList();
        cVar2.f17343a.writeLock().lock();
        try {
            cVar2.f17345c = 1;
            arrayList.addAll(cVar2.f17344b);
            cVar2.f17344b.clear();
            cVar2.f17343a.writeLock().unlock();
            cVar2.f17346d.post(new c.f(arrayList, cVar2.f17345c, null));
        } catch (Throwable th) {
            cVar2.f17343a.writeLock().unlock();
            throw th;
        }
    }
}
