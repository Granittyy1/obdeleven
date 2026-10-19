package K3;

import Q2.C0728e;
import Q2.C0730g;
import Q2.InterfaceC0729f;
import T4.C0781n;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TreeSet;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;

/* JADX INFO: compiled from: BitmapDrawableEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements A3.f, InterfaceC0729f, p191p5.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4245c;

    public b(C0781n c0781n, p191p5.h hVar) {
        this.f4245c = c0781n;
        this.f4244b = hVar;
    }

    @Override // Q2.InterfaceC0729f
    public Long a(String str) {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT long_value FROM Preference where `key`=?");
        kVarH.r(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4244b;
        workDatabase_Impl.b();
        Long lValueOf = null;
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            if (cursorK.moveToFirst() && !cursorK.isNull(0)) {
                lValueOf = Long.valueOf(cursorK.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.InterfaceC0729f
    public void b(C0728e c0728e) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f4244b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C0730g) this.f4245c).f(c0728e);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public void c(LayoutNode layoutNode, boolean z10) {
        F6.a aVar = (F6.a) this.f4245c;
        F6.a aVar2 = (F6.a) this.f4244b;
        if (z10) {
            aVar2.a(layoutNode);
            aVar.a(layoutNode);
        } else {
            if (((TreeSet) aVar2.f3259c).contains(layoutNode)) {
                return;
            }
            aVar.a(layoutNode);
        }
    }

    public boolean d() {
        return !(((TreeSet) ((F6.a) this.f4245c).f3259c).isEmpty() && ((TreeSet) ((F6.a) this.f4244b).f3259c).isEmpty());
    }

    @Override // p191p5.c
    public void e(p191p5.g gVar) {
        ((C0781n) this.f4245c).f5988b.remove((p191p5.h) this.f4244b);
    }

    @Override // A3.a
    public boolean f(Object obj, File file, A3.d dVar) {
        return ((c) this.f4245c).f(new d((E3.c) this.f4244b, ((BitmapDrawable) ((D3.o) obj).get()).getBitmap()), file, dVar);
    }

    @Override // A3.f
    public EncodeStrategy g(A3.d dVar) {
        return EncodeStrategy.f24522c;
    }

    public b(E3.c cVar, c cVar2) {
        this.f4244b = cVar;
        this.f4245c = cVar2;
    }

    public b(WorkDatabase_Impl workDatabase_Impl) {
        this.f4244b = workDatabase_Impl;
        this.f4245c = new C0730g(workDatabase_Impl);
    }

    public b() {
        this.f4244b = new F6.a(3);
        this.f4245c = new F6.a(3);
    }
}
