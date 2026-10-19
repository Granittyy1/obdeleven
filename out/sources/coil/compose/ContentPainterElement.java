package coil.compose;

import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: ContentPainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContentPainterElement extends H<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Painter f22739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.d f22740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1161g f22741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I f22743f;

    public ContentPainterElement(Painter painter, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, float f10, I i10) {
        this.f22739b = painter;
        this.f22740c = dVar;
        this.f22741d = interfaceC1161g;
        this.f22742e = f10;
        this.f22743f = i10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        j jVar = new j();
        jVar.f22775p = this.f22739b;
        jVar.f22776q = this.f22740c;
        jVar.f22777r = this.f22741d;
        jVar.f22778s = this.f22742e;
        jVar.f22779t = this.f22743f;
        return jVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        j jVar = (j) cVar;
        long jH = jVar.f22775p.h();
        Painter painter = this.f22739b;
        boolean zA = I.h.a(jH, painter.h());
        jVar.f22775p = painter;
        jVar.f22776q = this.f22740c;
        jVar.f22777r = this.f22741d;
        jVar.f22778s = this.f22742e;
        jVar.f22779t = this.f22743f;
        if (!zA) {
            C1185f.f(jVar).O();
        }
        C1192m.a(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return kotlin.jvm.internal.i.a(this.f22739b, contentPainterElement.f22739b) && kotlin.jvm.internal.i.a(this.f22740c, contentPainterElement.f22740c) && kotlin.jvm.internal.i.a(this.f22741d, contentPainterElement.f22741d) && Float.compare(this.f22742e, contentPainterElement.f22742e) == 0 && kotlin.jvm.internal.i.a(this.f22743f, contentPainterElement.f22743f);
    }

    public final int hashCode() {
        int iD = O.a.d(this.f22742e, (this.f22741d.hashCode() + ((this.f22740c.hashCode() + (this.f22739b.hashCode() * 31)) * 31)) * 31, 31);
        I i10 = this.f22743f;
        return iD + (i10 == null ? 0 : i10.hashCode());
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f22739b + ", alignment=" + this.f22740c + ", contentScale=" + this.f22741d + ", alpha=" + this.f22742e + ", colorFilter=" + this.f22743f + ')';
    }
}
